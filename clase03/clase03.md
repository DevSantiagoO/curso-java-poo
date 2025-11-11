# Clase 2: Atributos y Métodos (Comportamiento y Características)

## Concepto Clave: La Estructura de la Clase

Una clase es un **molde** que define las **características** y las **acciones** de las entidades que modela.

| Elemento | ¿Qué es? | ¿Qué representa? |
| :--- | :--- | :--- |
| **Clase** | La plantilla o el molde. | La entidad abstracta (ej. `Persona`). |
| **Atributos** | Los **datos** que posee. | Las características de la entidad (ej. `nombre`, `edad`). |
| **Métodos** | Las **acciones** que puede realizar. | El comportamiento de la entidad (ej. `comer`, `dormir`). |

## 1. Atributos (Características)

Los atributos definen el **estado** de un objeto y son las variables declaradas dentro de una clase.

### Definición

* Los atributos son las **variables** declaradas dentro de una clase que describen sus propiedades.
* Todo objeto creado a partir de la misma clase contendrá esos atributos.

### Convención de Nomenclatura

* Se utiliza la convención **`camelCase`**: La primera palabra en minúscula y las siguientes palabras iniciando con mayúscula (ej: `numeroDeCuenta`).

### Ejemplo en Java

```java
public class Alumno {

    // Atributos de la clase
    public int id;
    public String nombre;
    public String apellido; 
}
```

## 2. Métodos (Comportamiento)

Los métodos definen las **acciones** que un objeto puede realizar. Son el comportamiento de la clase.

### Definición

* Son bloques de código que ejecutan tareas específicas y se identifican con **verbos** (ej: `calcular`, `mostrar`).
* También se les conoce como **operaciones**.

### Componentes y Tipos

| Tipo | Descripción | Retorno en Java |
| :--- | :--- | :--- |
| **Función** | **Retorna un valor** como resultado de su operación. | Se declara con el tipo de dato que retorna (ej: `int`, `String`). |
| **Procedimiento** | **No retorna ningún valor**; solo ejecuta una acción. | Se declara con la palabra clave **`void`**. |

### Convención de Nomenclatura

* Los métodos también usan la convención **`camelCase`** (ej: `inscribirMateria()`, `obtenerPromedio()`).

### Ejemplo en Java

```java
public class Alumno {
    // ... Atributos
    public String nombre;
    
    // Método / Procedimiento (void, no retorna valor)
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    // Método / Función (Retorna un String)
    public String obtenerNombreCompleto(String apellido) {
        return nombre + " " + apellido; 
    }
}
```

**A tener en cuenta**

* *public* → Modificador de acceso.
* *void* → Indica que es un procedimiento, es decir que no retorna ningún tipo de dato.
* Tenemos metodos especiales llamados *constructores* que nos permiten crear objetos a traves de ellos.