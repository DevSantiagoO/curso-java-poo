# Clase 6: Polimorfismo (Muchas Formas)

## 1. Concepto de Polimorfismo

### ¿Qué significa Polimorfismo?

**Polimorfismo** significa literalmente **"muchas formas"**. Es uno de los pilares de la POO.

A partir de un **objeto de la Clase Padre** (o Superclase), podemos tratar objetos que fueron creados con sus **Clases Hijas** o derivadas.

Al compartir atributos y métodos en común, estos objetos pueden ser considerados **como si tuvieran la forma de un solo objeto** (el del Padre), permitiendo un código más flexible y genérico.

### Ejemplo de Relación Polimórfica

La clase `Vehiculo` (Clase Padre) puede tomar la forma de sus Clases Hijas especializadas (`Coche`, `Moto`, `Bus`).
cionar( Bus );

## 2. Implementación del Polimorfismo en Java

La clave del polimorfismo es poder invocar un mismo método o guardar distintos tipos de objetos en una estructura (como un vector o lista), siempre que sean de la misma jerarquía de herencia.

### Ejemplo de Invocación

Podemos tener una función o método (`estacionar`) que reciba diferentes tipos de objetos, siempre y cuando todos hereden de la misma Clase Padre (`Vehiculo`).

```java
    estacionar( Coche ); 
    estacionar( Moto ); 
    estacionar( Bus );
```

### Ejemplo de Estructura Genérica (Vector)

Podemos declarar un **vector** de la **Clase Padre** (`Persona`) y luego asignarle instancias de cualquiera de sus Clases Hijas (`Empleado`, `Consultor`, `Jefe`).

```java
public static void main(String[] args) {
    // Declaro un vector de 5 posiciones de tipo Clase Padre (Persona)
    Persona vector [] = new Persona [5]; 
    
    // Almacenamos objetos de distintas Clases Hijas en el vector de la Clase Padre
    vector [0] = new Persona(); 
    vector [1] = new Empleado(); 
    vector [2] = new Consultor(); 
    vector [3] = new Jefe(); 
    // vector [4] queda vacío o se puede usar con otra Clase Hija...
}