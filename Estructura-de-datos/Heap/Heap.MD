##                            Cola de Prioridad

Una cola de prioridad es una estructura de datos más especializada que una pila o una cola.
Sin embargo, es una herramienta útil en un número sorprendente de situaciones. Al igual que una cola ordinaria,
 una cola de prioridad tiene una parte delantera y una trasera, y los elementos se eliminan de la parte delantera.
Sin embargo, en una cola de prioridad, los elementos se ordenan por valor clave, de modo que el elemento con
la clave más baja (o, en algunas implementaciones, la clave más alta) siempre se encuentra en la parte delantera.
Los elementos se insertan en la posición adecuada para mantener el orden. Así es como la analogía de la clasificación,
del correo se aplica a una cola de prioridad. Cada vez que el cartero te entrega una carta, la insertas en tu pila, 
de cartas pendientes según su prioridad. 
###                             Definición de Montículo (HEAP)


Un montículo binario de tamaño ` n`  se define como un ` árbol binario`  casi completo de ` n` nodos ,
tal que el contenido de cada nodo es menor o igual que el contenido de su hijos.
La definición formal de la estructura ` montículo`  está relacionada con los ` árboles binarios` . Así,
en la Figura Heap.svg se puede observar un árbol binario con todos los niveles completos excepto el último, 
que puede no estar completo y tener los nodos situados lo más a la izquierda posible, que forma un montículo binario.
Un árbol binario completo 3 es un árbol con todos los niveles llenos con la excepción del último nivel, que se llena de izquierda a derecha. 
Tienen la propiedad importante de que la altura de un árbol binario, completo de ${n}$ nodos es ${log n}$

Si debe responderse inmediatamente (la compañía telefónica está a punto de desconectar tu línea de módem), 
va en la parte superior, mientras que si puede esperar una respuesta tranquila(una carta de tu tía Mabel), va en la parte inferior. 
Las cartas con prioridades intermedias se colocan en el medio; cuanto mayor es la prioridad, mayor es su
posición en la pila. La parte superior de la pila de cartas corresponde a la parte delantera de la cola de prioridad.
Cuando tienes tiempo para responder a tu correo, empiezas por sacar la carta que está encima
(la primera de la cola), asegurándote así de que las cartas más importantes se responden
primero. 
###                         Situaciones a implementar cola de prioridad


Al igual que las pilas y las colas, las colas de prioridad se utilizan a menudo como herramientas de programación. Veremos
una utilizada para encontrar algo llamado árbol de expansión mínima para un grafo. Además, al igual que las colas normales, 
las colas de prioridad se utilizan de diversas maneras en determinados sistemas informáticos. En un sistema operativo multitarea preventivo, 
por ejemplo, los programas pueden colocarse en una cola de prioridad para que el programa con mayor prioridad sea el
siguiente en recibir una porción de tiempo que le permita ejecutarse.
###                               TABLA DE PRIORIDADES
Quizás la forma más intuitiva de implementar una cola de prioridades es con una tabla o array de listas, donde cada elemento de la tabla,
 se organiza a la manera de una cola (primero en entrar, primero en salir) y representa a los objetos con la misma prioridad. 
tabla en la que cada elemento se corresponde con una prioridad y de la que emerge una cola.
La operación insertEnPrioridad añade un nuevo 
#elemento ${T}$ de prioridad ${m}$ a la estructura,
siguiendo estos pasos:
1. Buscar la prioridad ${m}$ en la tabla.
2. Si existe, poner el elemento ${T}$ al final de la cola ${m}$.
3. Si la prioridad ${m}$ está fuera del rango de prioridades, generar un *error*
La operación ${elementoMin}$ devuelve el elemento frente de la cola no vacía que tiene la ${máxima}$ ${prioridad}$. 
La operación ${quitarMin}$ también devuelve el elemento de ${máxima}$ ${prioridad}$
y, además, lo extrae de la cola.

###                            Declaración del TAD Cola de Prioridad


| Operaciones        | Descripción de la operaciones                                    |
| ------------------ | ---------------------------------------------------------------- |
| CrearColaPrioridad | Inicia la estructura con las prioridades sin elementos           |
| InsertEnPrioridad  | Agrega un elemento a la cola segun prioridad                     |
| ElementoMin        | Devuelve el elemento de la cola en la prioridad mas alta.        |
| QuitarMin          | Devuelve y retira el elemento de la cola con prioridad mas alta. |
| ColaVacia          | Comprueba si una determinada cola no tiene elementos.            |
| ColaPrioridadVacia | Comprueba si todas las colas,  de la estructura están vacias.    |




