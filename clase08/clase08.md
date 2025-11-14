# Clase 8: Sobrecarga (`Overloading`) y Sobreescritura (`Overriding`)

Esta clase cubre dos formas distintas de aplicar el concepto de **Polimorfismo** en Java.

## 1. Sobrecarga de Métodos (`Method Overloading`)

La sobrecarga de métodos ocurre **dentro de una misma clase**.

### Definición
La **Sobrecarga** establece que dentro de una clase podemos tener **múltiples métodos que tienen exactamente el mismo nombre**, pero se distinguen entre sí por la **cantidad** o el **tipo de parámetros** que reciben.

### Ejemplo en Java: Clase `Animal`

En el siguiente ejemplo, la clase `Animal` tiene tres métodos llamados `hacerSonido()`, pero cada uno tiene una **firma** diferente (cero, uno o dos parámetros):

```java
package sobreescrituraysobrecarga;

public class Animal { 
    private int id_animal;
    private String descripcion;
    //constructores
    //métodos getters y setters
    //otros métodos
    
    // 1. Método sin parámetros
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    // 2. Método con un parámetro (Sobrecarga)
    public void hacerSonido(String nombreAnimal) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    
    // 3. Método con dos parámetros (Sobrecarga)
    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
}
```
## 2. Sobreescritura de Métodos (`Method Overriding`)

La **Sobreescritura** ocurre en la **relación de herencia** entre la Clase Padre y la Clase Hija.

### Definición
Sobreescribir un método significa **reemplazar, pisar o modificar** el comportamiento de un método que fue heredado de la Clase Padre, para adaptarlo a la lógica específica de la Clase Hija.

### Requisito: Clase Abstracta (Ejemplo)

Para que un método sea sobreescrito en la Hija, es una práctica común que la Clase Padre sea **abstracta** y el método esté **declarado** pero **no implementado** en el Padre.

```java
package sobreescrituraysobrecarga;

// Clase Padre abstracta (solo se declara, no se instancia)
public abstract class Animal { 
    private int id_animal;
    private String descripcion;
    //constructores
    //métodos getters y setters
    
    // El método abstracto SOLO se declara, no se implementa en la Clase Padre
    public abstract void hacerSonido();
}
```
### Uso del `@Override`

* **Significado:** El decorador **`@Override`** indica explícitamente que el método que sigue está **sobreescribiendo** (pisando, modificando) un método heredado de la Clase Padre.

### Ejemplo de Sobreescritura en Java

La clase `Perro` (Clase Hija) implementa su propia versión del método `hacerSonido()` heredado de `Animal` (Clase Padre).

```java
package sobreescrituraysobrecarga;

public class Perro extends Animal {
    
    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;
    //constructores
    //getters y setters
    
    // Método sobreescrito
    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro: Guau guau");
    }
}
```