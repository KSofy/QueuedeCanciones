# QueuedeCanciones

Simulador de Reproducción de Canciones (Spotify Simulation)
Este proyecto consiste en un sistema de gestión de reproducción de música basado en estructuras de datos lineales (Colas) implementadas de forma manual, siguiendo una arquitectura modular con Maven.

🛠️ Arquitectura del Proyecto
El sistema se divide en dos módulos principales:

Librería de Estructura de Datos (queue): Contiene la implementación manual de una cola genérica QueueLinked<T> utilizando nodos, sin depender de ninguna clase del Java Collections Framework (JDK).

Manejador de Reproducción (queueHandler): Aplicación que consume la librería para gestionar una lista de canciones con sistema de prioridad.

🚀 Instrucciones de Compilación y Ejecución

1. Instalar la Librería Manual
Navegue a la carpeta de la librería y ejecute:
Bash
cd umg.edu.gt.data-structure.queue
mvn clean install

2. Ejecutar la Simulación
Navegue a la carpeta del handler y ejecute el comando de Maven para iniciar la aplicación:
Bash
cd ../queueHandler
mvn exec:java "-Dexec.mainClass=umg.edu.gt.Main"

🧠 Decisiones Técnicas y Diseño
Implementación de la Cola
Se diseñó una estructura de datos QueueLinked<T> propia. El uso de genéricos permite que la cola sea reutilizable para cualquier tipo de objeto, cumpliendo con el principio FIFO (First-In, First-Out).

Sistema de Prioridad
Para cumplir con el requisito de prioridad sin utilizar estructuras complejas del JDK, se optó por un diseño de Multi-Cola:

Cola de Prioridad Alta: Almacena canciones con nivel 1.

Cola de Prioridad Normal: Almacena canciones con nivel 2.

Lógica de salida: El reproductor vacía totalmente la cola de prioridad alta antes de procesar cualquier canción de la cola normal.

🌟 Extensiones de Complejidad (Parte D)
Se implementaron las siguientes mejoras para enriquecer la simulación:
Barra de Progreso Visual: Durante la reproducción, se muestra una barra dinámica [#####-----] que se actualiza segundo a segundo en la consola.

Reporte Final: Al terminar la lista, el sistema imprime el total de canciones reproducidas y el tiempo total de acumulado.
