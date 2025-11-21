# TP-POKEMON: Ejercicio Integrador de POO

Este repositorio contiene la resolución del Ejercicio Integrador del módulo de **Programación Orientada a Objetos (POO) con Java** del curso de **TODOCODE Academy**.

## Objetivo del Proyecto

El proyecto tiene como finalidad modelar la lógica de ataques de diferentes criaturas Pokémon aplicando los siguientes conceptos fundamentales de POO:

* **Clase Abstracta:** Implementación de una clase base (`Pokemon`) que define atributos comunes (como `nombrePokemon` y `num_pokedex`) y métodos de ataque generales (`atacarPlacaje()`, `atacarArañazo()`, etc.)
* **Interfaces:** Creación de interfaces específicas (`IElectrico`, `IFuego`, `IPlanta`, `IAgua`) para estandarizar los ataques únicos de cada tipo de Pokémon.
* **Herencia e Implementación:** Desarrollo de las clases concretas de los Pokémon *starters* de la primera temporada (Charmander, Bulbasaur, Squirtle y Pikachu), las cuales heredan de la clase abstracta e implementan la interfaz correspondiente a su tipo.
* **Sobrescritura (`@Override`):** Adaptación de los métodos de ataque para que cada Pokémon muestre un mensaje personalizado en pantalla.

## Estructura del Código

El código Java sigue una estructura de paquetes lógica para mantener la organización:
```
tp-pokemon/

├── src/

│   └── pokemon/

│       ├── interfaces/  // Define los "contratos" de ataque (IElectrico, IFuego, IPlanta, IAgua).

│       ├── modelos/     // Contiene la Clase Abstracta Pokemon.

│       └── clases/      // Contiene las Clases Concretas (Charmander, Pikachu, Bulbasaur, Squirtle).

└── Main.java            // Punto de entrada del programa, donde se crean las instancias y se prueban los métodos.
```

## Cómo Ejecutar

1.  Clona o descarga el repositorio.
2.  Compila el proyecto Java.
3.  Ejecuta el archivo `Main.java` (o `Principal.java`).
4.  La salida mostrará las instancias de cada Pokémon realizando los ataques solicitados en la consigna.

---

**Autor:** [DevSantiagoO]

**Curso:** POO con Java, TodoCode Academy.