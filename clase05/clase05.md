# Clase 4: Getters y Setters y la Introducción al Encapsulamiento

Los Getters y Setters son métodos **especiales** que se crean para cada atributo de una clase, y su propósito fundamental está ligado al **Encapsulamiento**.

## 1. Funcionalidad: Get (Obtener) y Set (Establecer)

| Método | Propósito | Retorno/Parámetro | Sintaxis en Java |
| :--- | :--- | :--- | :--- |
| **Getter (`get`)** | **Obtener/Traer** el valor actual de un atributo para usarlo en operaciones, mostrarlos, etc. | **Retorna un valor** (del mismo tipo que el atributo). | `public TipoDato getNombreAtributo() { ... }` |
| **Setter (`set`)** | **Establecer/Colocar** un nuevo valor a un atributo. | Es un **Procedimiento** (`void`), pero **recibe un parámetro** con el nuevo valor. | `public void setNombreAtributo(TipoDato valor) { ... }` |

### Diferencia Clave

Si observamos el código generado, la diferencia es clara:

* El **`Get`** se comporta como una **Función** (retorna un valor).
* El **`Set`** se comporta como un **Procedimiento** (`void`), pero **recibe un valor por parámetro** para asignarlo al atributo.

## 2. Implementación en la Clase

### Ubicación

Los métodos Getters y Setters deben ser creados **dentro de la clase** a la que pertenecen.

* **Recomendación:** Generalmente se colocan **después** de los métodos constructores y **antes** de otros métodos propios que definamos para la clase.

### Creación Rápida

La forma más eficiente de crearlos en NetBeans es:

1.  Usar el atajo **`ALT + INSERT`**.
2.  Seleccionar la opción **`Getter and Setter...`**.
3.  Elegir los atributos para los que se desea generar estos métodos.


## 3. Utilidad y Relación con Constructores

### ¿Para qué sirven los Setters si ya tengo un Constructor?

Los Setters son necesarios para dos escenarios principales:

1.  **Modificación:** Si se crea un objeto usando un constructor vacío, o si se desea **cambiar el valor** de un atributo en un objeto ya existente (por ejemplo, cambiar el nombre de un alumno después de que fue creado).
2.  **Validación:** Permiten añadir lógica de validación antes de que el valor sea asignado al atributo.

### Ejemplo de Uso

La utilización de Getters y Setters se realiza a través del objeto instanciado:

```java
// 1. Instanciamos un objeto
Alumno alumno1 = new Alumno();

// 2. Usamos el Setter para ESTABLECER un valor
alumno1.setNombre("Carla");
alumno1.setApellido("Gómez");

// 3. Usamos el Getter para OBTENER y mostrar un valor
String nombreDelAlumno = alumno1.getNombre();
System.out.println("El nombre es: " + nombreDelAlumno);
```
## 4. Conclusión: Encapsulamiento
Los Getters y Setters están fuertemente relacionados con el pilar de Encapsulamiento.

Aunque los atributos de este ejemplo son públicos, los Getters y Setters son la puerta de acceso controlada cuando los atributos se declaran como privados (private), permitiendo proteger los datos del objeto.