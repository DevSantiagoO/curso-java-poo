# Clase 9: Encapsulamiento y Niveles de Acceso

El **Encapsulamiento** es uno de los cuatro pilares de la Programación Orientada a Objetos.

## 1. Conceptos Fundamentales

### ¿Qué es el Encapsulamiento?

El encapsulamiento consiste en **reunir los atributos y los métodos** dentro de una misma clase u objeto. No debe confundirse con la Abstracción.

### Principio de Ocultación

El Encapsulamiento se implementa a través del **Principio de Ocultación**:

* Es el mecanismo para **restringir el acceso directo** a algunos de los componentes internos de una unidad (generalmente los **atributos**).
* Esto obliga a otras clases a utilizar **interfaces públicas (métodos)** para interactuar con la entidad.
* El aislamiento protege las propiedades de un objeto contra la modificación externa no deseada, siendo un concepto de **protección**.

## 2. Niveles de Acceso en Java

El encapsulamiento se gestiona mediante los siguientes **tres niveles de acceso** (modificadores):

1.  **`public`:** El método o atributo puede ser utilizado por **cualquier otra clase** fuera de la clase donde está declarado.
2.  **`private`:** El método o atributo **únicamente** se puede utilizar **dentro de la clase** donde está declarado. Este es el nivel de protección más alto.
3.  **`protected`:** Nivel de protección intermedio. El acceso a los atributos o métodos solo puede ser utilizado por la **misma clase** o por sus **clases hijas (subclases)**.

## 3. Implementación y Uso de Getters y Setters

### ¿Qué tipo de acceso deben tener los Atributos?

Todos los atributos de una clase **deben ser privados** (`private`).

* **Motivo:** Se deben proteger para que **ninguna otra clase acceda a ellos directamente**.
* **Obligación:** Al hacer los atributos privados, nos obligamos a utilizar los **Getters y Setters** para poder establecer y obtener los valores de forma controlada.

### Relación con Getters y Setters

Cuando un atributo es declarado como `private`, los métodos **Getters y Setters** se convierten en la **única vía de acceso pública** a ese dato, permitiendo a la clase controlar *cómo* y *cuándo* se modifican sus propiedades internas.