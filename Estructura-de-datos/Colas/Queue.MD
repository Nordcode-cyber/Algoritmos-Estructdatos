###                            INTRODUCCION
En este capítulo se estudia el tipo abstracto de datos Cola, estructura muy utilizada en la vida
cotidiana y también en la resolución de problemas en programación. Esta estructura, al igual que
las pilas, almacena y recupera sus elementos atendiendo a un orden estricto. Las colas se conocen
como estructuras ${FIFO}$ ( first-in, first-out,), debido a la forma y orden de inserción y de extracción de elementos. 
Las colas tienen numerosas aplicaciones en el mundo de la computación: colas de mensajes, 
colas de tareas a realizar por una impresora, colas de prioridades, etc.
###                                    CONCEPTO DE COLA
Una cola es una estructura de datos que almacena elementos en una lista y permite acceder a los
datos por uno de los dos extremos. Un elemento se inserta en la cola (parte final) de la lista y 
se suprime o elimina por el frente (parte inicial, frente) de la lista. Las aplicaciones utilizan,
 una cola para almacenar elementos en su orden de aparición o concurrencia.

###                                        OPERACIONES


| CrearCola | Inicia la cola como vacía.                             |
| --------- | ------------------------------------------------------ |
| Insertar  | Añade un elemento por el final de la cola.             |
| Quitar    | (extrae) el elemento frente de la cola                 |
| ColaVacia | Comprueba si la cola no tiene elementos.               |
| ColaLlena | Comprueba si la cola está llena de elementos.          |
| Frente    | Obtiene el elemento frente o primero de la cola.       |
| Tamaño    | Número de elementos máximo que puede contener la cola. |
