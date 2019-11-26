# Ejercicio de android para admisión

El objetivo de este proyecto es calificar las aptitudes básicas 
de un desarrollador para medir sus conocimientos 
en la plataforma de Android.

### El entregable consiste en lo siguiente:

* Un pull request de un branch creado por el desarrollador hacia 
el branch de develop, que será revisado por el dueño del repositorio.

### Las especificaciones del ejercicio son las siguientes:

Se debe crear un listado de estaciones ecobici. Cada item de la lista debe de mostrar los campos:
 
* id
* nombre
* direccion
* bicis disponibles
* espacios disponibles 
 
 El listado debe de contar con tres filtros:

* Cercanos; se deben usar los campos "lon" y "lat" para ordenar las estaciones de la más cercana a la más alejada (a unas coordenadas hardcodeadas en el proyecto)
* Por bicis disponibles (de mayor a menor) con el campo de "bikes"
* Por espacios disponibles (de menor a mayor) con el campo "slots"

Para alimentar el listado se tiene un archivo json en el folder "raw" 
que se lee con el helper JsonReaderHelper y el método "getInfoBikes".
 

### Reglas de trabajo

* Clonar el repositorio
* Crear un branch a partir de develop con el nombre de "feature/nombre_del_participante" (sin las comillas y utilizando tu nombre)
* Hacer un máximo de 3 commit´s en tu branch para resolver el ejercicio antes mencionado
* Hacer un push del branch anteriormente creado
* Hacer un pull request hacia el branch develop



## Se calificará

* Que el ejercicio esté completo
* Lógica que se utilizó para resolver el ejercicio
* Componentes y librerias utilizadas para resolver el ejercicio (preferible las nativas y recomendadas por google)
* Nociones de POO 
* Limpieza de código

## Puntos extras

* Pruebas unitarias
* Coverage 
* Diseño de la aplicación 
* Documentación