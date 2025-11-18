# Clase 10: Clases Abstractas

Las Clases Abstractas son un elemento fundamental en la POO para definir una estructura común sin implementar completamente la lógica, forzando a las Clases Hijas a hacerlo.

## 1. Definición y Propósito

### ¿Qué son las Clases Abstractas?

Una Clase Abstracta es un tipo particular de clase cuya principal característica es que **no puede ser instanciada directamente**.

### Implicación de no ser Instanciada
Que no pueda ser instanciada significa que **no puedes crear un objeto** a partir de ella utilizando el operador `new`.

* **Ejemplo:** No puedes hacer `new Figura()`.

### Diferencia con Clases Normales (Clase Padre)
Una Clase Abstracta se utiliza como **molde** o **esqueleto** para la creación de otras clases mediante la **Herencia**. Su función es declarar la existencia de métodos (métodos abstractos), pero **no su implementación**, dejando esta responsabilidad a sus Clases Hijas.

### ¿Cuándo usar Clases Abstractas?
Se usan cuando deseamos definir una **abstracción** que englobe objetos de distintos tipos y queremos hacer uso del **Polimorfismo**.

* **Ejemplo:** La clase `Figura` es abstracta porque no tiene sentido calcular el área de una "Figura" genérica, pero sí de sus hijos específicos (`Cuadrado` o `Círculo`).

## 2. Métodos Abstractos y Reglas de Implementación

### ¿Cómo debe ser una Clase Abstracta?
Para que una clase sea abstracta, **al menos uno de sus métodos debe ser abstracto**.

### Declaración de Métodos Abstractos
Los métodos abstractos **solo se declaran**, pero no contienen código entre llaves (`{}`).

```java
public abstract double calcularArea(); // Método abstracto sin cuerpo
```

## Clase Padre Abstracta (`Figura`)

La clase `Figura` es declarada como **abstract** y contiene el método `calcularArea()` también declarado como **abstract**.

### Ejemplo en Java: Declaración Abstracta

```java
package claabstractas;

public abstract class Figura { 
    protected double x; // Posición en x
    protected double y; // Posición en y

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método abstracto: debe ser implementado por las Clases Hijas
    public abstract double calcularArea();
}
```

### Niveles de Visualización (Acceso)
Los métodos abstractos deben ser **`public`** o **`protected`**.

## 3. Implementación de Clases Hijas

### Regla Fundamental
Si una subclase hereda de una Clase Abstracta (como `Figura`), tiene **dos opciones**:

1.  **Implementar** todos los métodos abstractos heredados (la forma más común).
2.  **Declararse también como clase abstracta**.

### Clase Hija: `Cuadrado`
La clase `Cuadrado` extiende `Figura` e implementa su propia lógica para `calcularArea()`.

```java
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
```

### Clase Hija: `Circulo`

La clase `Circulo` extiende `Figura` e implementa su propia lógica para `calcularArea()`, cumpliendo así con el contrato establecido por la clase abstracta.

```java
package claabstractas;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
}
```

## 4. Diferencia con Interfaces (Adelanto)

* **Clases Abstractas:** Una clase **no puede heredar de varias clases abstractas a la vez** (solo se permite una Herencia simple en Java).
* **Interfaces:** Sí permiten una "herencia" o **implementación múltiple**.