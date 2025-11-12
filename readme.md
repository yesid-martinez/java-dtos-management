# DTO Manager — Aplicación Java con Repository y DTO Pattern

Este proyecto es una demostración práctica del uso de los patrones **DTO (Data Transfer Object)**, **Mapper** y **Repository** dentro de una arquitectura modular inspirada en los principios de **Clean Architecture / DDD Light**.  

El propósito es mostrar cómo diseñar una aplicación Java orientada a la mantenibilidad, escalabilidad y separación clara de responsabilidades entre las capas de dominio, aplicación, infraestructura y presentación.  
El sistema implementa un gestor de usuarios en consola que permite crear, listar y validar entidades mediante una lógica desacoplada y fácilmente extensible.

---

## Objetivo del proyecto

El proyecto nace con un propósito académico y como extensión se decidió ilustrar el manejo estructurado de datos mediante **DTOs** y **Repositories**, mostrando cómo aislar la lógica de negocio de los detalles técnicos de persistencia y presentación.  

En términos funcionales, la aplicación gestiona una colección de usuarios, validando información y coordinando las transformaciones entre las distintas capas de la arquitectura.  
Sin embargo, su valor principal no está en las operaciones en sí, sino en **la forma en que la arquitectura organiza esas responsabilidades**.

---

## Patrón DTO y Mapper

El patrón **DTO (Data Transfer Object)** se utiliza para **transportar datos entre capas** sin exponer directamente las entidades del dominio.  
De esta manera, la capa de presentación o de aplicación puede trabajar con representaciones simples y seguras, mientras que la lógica de negocio permanece protegida dentro del dominio.

A su vez, el **Mapper** es el encargado de convertir explícitamente entre entidades y DTOs.  
Este patrón garantiza que el intercambio de datos sea controlado, predecible y fácil de mantener, eliminando dependencias directas entre capas.  

El resultado es una aplicación en la que el dominio no conoce los detalles del mundo exterior, pero sigue siendo accesible mediante objetos de transferencia diseñados específicamente para la comunicación entre componentes.

---

## Patrón Repository

El patrón **Repository** actúa como una **abstracción del acceso a los datos del dominio**.  
Su objetivo es ofrecer una interfaz que represente una colección de entidades, sin exponer los detalles de cómo se almacenan, consultan o persisten.  

Gracias a este patrón, la lógica de negocio puede trabajar con objetos del dominio como si estuvieran en memoria, mientras que la infraestructura decide si los datos provienen de una base de datos, un archivo o cualquier otro medio.  
De esta forma, la aplicación logra **desacoplar completamente el "qué" del "cómo"**, permitiendo cambiar la fuente de datos sin alterar el comportamiento del sistema.

En esta implementación, el Repository cumple un rol central en la arquitectura:  
- Proporciona los métodos necesarios para guardar y obtener entidades.  
- Aísla las operaciones de persistencia del resto del sistema.  
- Refuerza el principio de inversión de dependencias, haciendo que las capas superiores dependan de **interfaces** y no de **implementaciones concretas**.  

---

## Lógica de aplicación (Service)

La capa de aplicación implementa los **casos de uso** de la aplicación.  
El **Service** coordina el flujo de datos entre el dominio, el repositorio y los DTOs, aplicando las reglas de negocio que van más allá del estado individual de una entidad, como la verificación de duplicados o el control de integridad de la información.

Su función principal es **orquestar los componentes** y garantizar que cada operación respete las políticas del dominio.  
De esta manera, los servicios actúan como el punto de conexión entre la lógica interna y las capas externas de la arquitectura.

---

## Capa de presentación

La capa de presentación representa la **interfaz con el usuario**.  
En este caso, se implementa un controlador de consola (`Controller`) que muestra un menú interactivo y permite ejecutar las operaciones de creación y listado de usuarios.  

El Controller no contiene lógica de negocio, sino que delega todas las operaciones al `Service`, actuando como intermediario entre la aplicación y el usuario final.  
Este enfoque facilita reemplazar la interfaz de consola por una API REST, una interfaz gráfica o cualquier otro mecanismo sin afectar el núcleo de la aplicación.

---

## Ejecución

El programa se ejecuta desde la clase principal, que inicializa las dependencias (Repository, Mapper y Service) e inicia el controlador de consola.  
Todo el flujo se mantiene desacoplado y alineado con los principios de Clean Architecture, garantizando que las dependencias fluyan siempre hacia el dominio, y no al revés.

---

## Conceptos aplicados

- **DTO Pattern:** transferencia de datos desacoplada del dominio.  
- **Mapper Pattern:** conversión controlada entre entidades y DTOs.  
- **Repository Pattern:** abstracción del acceso a datos y fuente de persistencia.  
- **Clean Architecture:** separación en capas de dominio, aplicación, infraestructura y presentación. 

---

## Conclusión

Este proyecto ejemplifica cómo combinar **DTOs, Repositories y Mappers** dentro de una arquitectura limpia, demostrando un enfoque modular y mantenible para el desarrollo de software en Java.  
La estructura adoptada permite reemplazar componentes, escalar funcionalidades y extender el sistema sin comprometer la cohesión del código.
