# Clase 3: Objetos, Instanciación y Constructores

## 1. El Objeto: La Materialización de la Clase

Un **objeto** es la unidad fundamental de la POO. Es una **instancia** concreta y material de una clase (el molde).

El objeto es la representación programada de algo que existe en la vida real (ej. un perro, una cuenta bancaria, un alumno específico).

### Componentes de un Objeto

Todo objeto posee dos elementos definidos por su clase:

1.  **Estado:** Definido por los **atributos** (los valores actuales de sus características).
2.  **Comportamiento:** Definido por los **métodos** (las acciones que puede ejecutar).


## 2. Métodos Constructores

Los **métodos constructores** son funciones especiales y obligatorias en toda clase, necesarias para **crear e inicializar** objetos a partir de esa clase.

### Funcionalidad

El constructor es el responsable de asignar la memoria necesaria e inicializar los atributos al momento de crear una instancia de la clase.

### Nomenclatura y Retorno

* **Nombre:** El constructor **SIEMPRE** se llama **igual que la clase** (ej. `Alumno()`).
* **Retorno:** Los constructores **NO retornan ningún valor** (ni siquiera se declaran con `void`).

### Creación Automática (Tipos Comunes)

Podemos crear constructores de forma automática con atajos del IDE, como **`ALT + INSERT`** en NetBeans. Generalmente se utilizan dos tipos principales:

1.  **Constructor Vacío (Sin Parámetros):**
    * **Utilidad:** Se utiliza para crear el objeto ahora, pero planificar la carga de sus datos más adelante. Es útil cuando los datos se reciben de una base de datos o se cargan de forma diferida.

    ```java
    public Alumno() {
        // Constructor vacío
    }
    ```
    

2.  **Constructor con Parámetros:**
    * **Utilidad:** Permite inicializar *todos* o *algunos* atributos del objeto en el mismo momento de su creación.

    **A tener en cuenta con Parámetros:** Si un parámetro tiene el mismo nombre que un atributo de la clase (ej. `nombre`), es obligatorio usar la palabra clave **`this.`** para diferenciar entre el parámetro recibido y el atributo de la clase (ej. `this.nombre = nombre;`).

    ```java
    public Alumno(int id, String nombre, String apellido) {
        // Inicializa los atributos con los valores recibidos
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    ```
    


## 3. Creación y Uso de Objetos

La creación de un objeto, también llamada **instanciación**, sigue esta sintaxis:

```java
// Clase NombreObjeto = new Constructor();
Alumno alumno1 = new Alumno(101, "Juan", "Perez");

// Crear un objeto con el constructor vacío
Alumno alumno2 = new Alumno();