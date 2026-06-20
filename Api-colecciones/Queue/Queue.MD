####                                                           Queue

Es una colección lineal de elementos que se utiliza para almacenar varios elementos antes de su procesamiento, normalmente siguiendo el orden FIFO (primero en entrar, primero en salir). Esto significa que los elementos se añaden por un extremo y se eliminan por el otro, de modo que el primer elemento añadido a la cola es el primero en eliminarse.

#####  *Mecanismo interno*: 
El funcionamiento interno de una cola puede variar en función de su implementación específica.
#####  *Lista enlazada*: 
Utiliza una lista doblemente enlazada para almacenar elementos, lo que significa que se puede recorrer tanto hacia adelante como hacia atrás, 
lo que permite operaciones flexibles.
##### *Cola de prioridad*: 
Está respaldada internamente por un montón binario, que es muy eficiente para las operaciones de recuperación.
##### *ArrayDeque*: 
Se implementa utilizando una matriz que se expande o se contrae a medida que se añaden o eliminan elementos. Aquí,
 los elementos se pueden añadir o eliminar desde ambos extremos de la cola.
##### *Duplicados*: 
En una cola, se permiten elementos duplicados, lo que permite insertar varias instancias del mismo valor.
##### *Nulo*: 
no se puede insertar un valor nulo en una cola porque, por diseño, algunos métodos de una cola devuelven nulo para indicar que está vacía. 
Para evitar confusiones, no se permiten valores nulos.
##### *Orden*: 
Los elementos se insertan según su orden natural. Alternativamente, puede controlar el orden de inserción especificando un comparador personalizado.
##### *Sincronización*: 
Una cola no está sincronizada de forma predeterminada. Sin embargo, puede utilizar una implementación ConcurrentLinkedQueue o 
BlockingQueue para lograr la seguridad de los subprocesos.
##### *Métodos claves*: 
Aquí están algunos métodos para la interface Queue: `add(E element)`, `offer(E element)`, `poll()`, and `peek()`. 
##### *Rendimiento*: 
Las implementaciones como LinkedList y ArrayDeque suelen ser rápidas para añadir y eliminar elementos. 
PriorityQueue es un poco más lenta porque inserta los elementos según el orden de prioridad establecido.