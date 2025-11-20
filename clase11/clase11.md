# Clases Abstractas vs. Interfaces en Programación Orientada a Objetos

## 1. Clases Abstractas (Abstract Classes) 

Una **Clase Abstracta** es una plantilla parcial para otras clases. Es una clase que **no puede ser instanciada** (no se pueden crear objetos directamente de ella), pero puede contener métodos y atributos tanto **concretos** (con implementación) como **abstractos** (sin implementación).

### Cuándo Usar una Clase Abstracta

Se utiliza principalmente cuando quieres:
1.  **Compartir implementación de código y estado** (atributos con valor) entre un grupo de clases estrechamente relacionadas.
2.  Establecer una **jerarquía estricta** (una relación "es un" fuerte).

### Características y Uso

| Característica | Contenido |
| :--- | :--- |
| **Atributos** | Sí, pueden ser variables normales con **estado** (no constantes) y atributos **propios** de la clase base. |
| **Métodos** | Puede tener métodos **concretos** (con cuerpo) y **abstractos** (sin cuerpo). |
| **Herencia** | Una clase solo puede **heredar de una** (Herencia Única) usando la palabra clave `extends`. |
| **Propósito** | Concepto Base Incompleto. Modela una entidad que es demasiado genérica para ser un objeto por sí misma. |

### Ejemplo Adicional: El Patrón "Es Un" Fuerte

Considera el concepto de `Empleado`.

* **Clase Abstracta `Empleado`**:
    * Método Concreto: `calcularAntiguedad()` (el cálculo es el mismo para todos los empleados).
    * Atributo con Estado: `salarioBase` (cada empleado tiene un valor base).
    * Método Abstracto: `calcularBono()` (la fórmula del bono es diferente para un `Manager` y un `Desarrollador`).

*Las clases **concretas** (`Manager`, `Desarrollador`) extienden a `Empleado` y se ven forzadas a implementar el método `calcularBono()`, pero heredan automáticamente la lógica y el estado de `calcularAntiguedad()` y `salarioBase`.*


## 2. Interfaces (Interfaces) 

Una **Interfaz** es un **contrato puro de comportamiento**. Es una colección de métodos **abstractos** y atributos **constantes**. Una clase que implementa una interfaz se compromete a proporcionar una implementación concreta para **todos** los métodos definidos en ese contrato.

### Cuándo Usar una Interfaz

Se utiliza principalmente cuando quieres:
1.  Establecer un **contrato de comportamiento** sin preocuparte por la implementación o el estado.
2.  Permitir que una clase tenga **múltiples "roles"** o capacidades funcionales, superando la limitación de la herencia única.

### Características y Uso

| Característica | Contenido |
| :--- | :--- |
| **Atributos** | Sí, pero son implícitamente **constantes** (por ejemplo, `public static final` en Java). **No tienen estado** cambiante por objeto. |
| **Métodos** | Generalmente **abstractos** (sin cuerpo). Solo definen la firma (`public abstract`). |
| **Implementación** | Una clase puede **implementar muchas** interfaces usando la palabra clave `implements` (resolviendo la Herencia Múltiple de Comportamiento). |
| **Propósito** | Modela el concepto de **"Tiene La Capacidad De"** (Can-Do). |

### Ejemplo Adicional: El Patrón "Tiene La Capacidad De"

Considera clases que no están en la misma jerarquía de herencia, pero que comparten capacidades:

* **Interfaz `Volador`**: Define el método `volar()`.
* **Interfaz `Nadador`**: Define el método `nadar()`.
* **Interfaz `Dibujable`**: Define el método `dibujar()`.

Una clase **`Pato`** puede `implements Volador, Nadador`. Una clase **`Avion`** puede `implements Volador`. Una clase **`Circulo`** puede `implements Dibujable`.

*El concepto clave aquí es que la interfaz se enfoca en el **comportamiento** que una clase promete implementar, sin importar de qué clase base hereda.*

```java
// Ejemplo de implementación de interfaz
package claabstractas;

public class Circulo implements Figura {
    private double radio;
    
    public Circulo() {}
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        double pi = 3.14; // Nota: En código real, usar Math.PI
        double resultado = pi * radio * radio;
        return resultado;
    }
} 
// La clase Circulo implementa el contrato Figura.
```
# Ejemplo Completo de Interfaz: `Movible`

Este ejemplo define una interfaz para cualquier objeto que tenga la capacidad de moverse, y luego muestra cómo una clase la implementa, destacando el concepto de **contrato de comportamiento**.

## 1. Definición de la Interfaz (El Contrato)

La interfaz define qué métodos **debe tener** cualquier clase que la implemente.

```java
/**
 * Interfaz que define el contrato de comportamiento para cualquier objeto
 * que tenga la capacidad de moverse en un plano 2D.
 */
public interface Movible {

    // 1. Atributo Constante (implícitamente public static final en Java)
    // Representa una constante compartida por todos los implementadores.
    int VELOCIDAD_MAXIMA = 100;

    // 2. Método Abstracto (implícitamente public abstract)
    // Define que el objeto debe poder moverse a ciertas coordenadas.
    void moverA(int x, int y);

    // 3. Método Abstracto
    // Define que el objeto debe poder obtener su posición actual.
    String obtenerPosicionActual();
}
```
## 2. Implementación de la Interfaz (La Promesa) 

La clase `Coche` se compromete a cumplir el contrato definido en la interfaz `Movible` utilizando la palabra clave `implements`. **Debe** proporcionar la lógica (el cuerpo del método) para todos los métodos abstractos de la interfaz.

```java
/**
 * Clase Coche, que implementa la interfaz Movible.
 */
public class Coche implements Movible {

    private int posicionX;
    private int posicionY;
    private String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
        this.posicionX = 0;
        this.posicionY = 0;
    }

    // Implementación específica del método 'moverA' para un Coche
    @Override
    public void moverA(int nuevaX, int nuevaY) {
        this.posicionX = nuevaX;
        this.posicionY = nuevaY;
        System.out.println("El coche " + this.matricula + " se movió a (" + nuevaX + ", " + nuevaY + ").");
        
        // Uso de la constante de la Interfaz
        if (nuevaX > Movible.VELOCIDAD_MAXIMA) { 
            System.out.println("(Aviso: Se excedió la posición X más allá del límite de referencia de " + Movible.VELOCIDAD_MAXIMA + ")");
        }
    }

    // Implementación específica del método 'obtenerPosicionActual' para un Coche
    @Override
    public String obtenerPosicionActual() {
        return "El coche " + this.matricula + " está en X: " + posicionX + ", Y: " + posicionY;
    }
}
```

## 3. Uso y Beneficio (Polimorfismo) 

El beneficio clave de usar interfaces es el **Polimorfismo**. Podemos tratar a cualquier objeto que implemente la interfaz `Movible` de forma genérica, ya que todos garantizan que tienen los métodos definidos en ese contrato.

```java
public class Aplicacion {
    public static void main(String[] args) {
        
        // Declaramos la variable usando el tipo de la Interfaz.
        // El objeto es un Coche, pero la referencia es de tipo Movible.
        Movible objetoMovil = new Coche("XYZ-456");

        // Llamamos a los métodos definidos en el Contrato
        System.out.println("--- Prueba de movimiento ---");
        objetoMovil.moverA(80, 50);
        objetoMovil.moverA(120, 10); // Genera el aviso por la constante

        System.out.println(objetoMovil.obtenerPosicionActual());
        
        // El polimorfismo permite que la variable 'objetoMovil' pueda apuntar
        // a cualquier clase (Coche, Avion, Bicicleta) siempre y cuando 
        // implemente la interfaz Movible.
    }
}
```

## 3. Resumen y Criterio de Decisión 

La principal diferencia y la clave para elegir se reduce a si necesitas **compartir código y estado** o simplemente **definir un comportamiento**.

| Criterio / Pregunta Clave | Clase Abstracta | Interfaz |
| :--- | :--- | :--- |
| **¿Necesitas compartir atributos con *estado* (variables de instancia)?** | **SÍ**. Permite atributos con estado. | **NO**. Solo permite constantes. |
| **¿Necesitas compartir *implementación* (código de método)?** | **SÍ**. Permite métodos concretos. | **NO**. (Solo firmas abstractas o métodos `default` en versiones modernas). |
| **¿La relación es estricta (patrón "ES UN")?** | **SÍ**. Para jerarquías fuertes. | **NO**. Para capacidades o roles diversos. |
| **¿Permite *herencia múltiple* de código/comportamiento?** | **NO**. Herencia única (`extends`). | **SÍ**. Implementación múltiple (`implements`). |
| **Palabra Clave para la Herencia/Implementación** | `extends` | `implements` |

---

### Conclusión:

* Utiliza una **Clase Abstracta** para la **Clase Base principal** de una familia de clases que comparten una estructura y una implementación parcial.
* Utiliza una **Interfaz** para definir **Contratos de Comportamiento** que pueden ser adoptados por cualquier clase, independientemente de su jerarquía principal.