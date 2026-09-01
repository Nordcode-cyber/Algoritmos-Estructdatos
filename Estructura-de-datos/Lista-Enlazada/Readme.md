###                             LISTAS ENLAZADAS
*Linked List*
Las estructuras de datos lineales de elementos homogéneos (listas, tablas, vectores) utilizaban
Arrays para implementar tales estructuras, siendo los elementos de tipo primitivo (int, Long,
double...); también se ha utilizado la clase Vector, aunque los elementos, en este caso, han
de ser referencias. Esta técnica obliga a fijar por adelantado el espacio a ocupar en memoria,
de modo que, cuando se desea añadir un nuevo elemento que rebase el tamaño prefijado del
array, no es posible realizar la operación sin que se produzca un error en tiempo de ejecución.
Esta característica se debe a que los Arrays hacen un uso ineficiente de la memoria. Gracias
a la asignación dinámica de variables, se pueden implementar listas de modo que la memoria
física utilizada se corresponda con el número de elementos de la tabla; para ello, se recurre a las
referencias (apuntadores) que hacen un uso más eficiente de la memoria, como ya se ha visto
con anterioridad.
####                          Fundamento teórico de Lista enlazada 
Una lista enlazada es una colección o secuencia de elementos dispuestos uno detrás de otro,
en la que cada elemento se conecta al siguiente elemento por un “enlace” o “referencia”. La idea
básica consiste en construir una lista cuyos elementos, llamados nodos, se componen de dos
partes (campos): la primera parte contiene la información y es, por consiguiente, un valor de
un tipo genérico (denominado Dato, Tipo Elemento, Info, etc.), y la segunda parte es una
referencia (denominado enlace o sgte) que apunta (enlaza) al siguiente elemento de la lista.

######                    *Una lista enlazada consta de un numero de elementos, y cada elemento tiene 2 campos*
######                    *una referencia al siguiente elemento de la lista, y un valor, que puede ser de cualquier tipo*

###                       Clasificación de Listas Enlazadas

#####                      *Listas simplemente enlazadas.* 
Cada nodo ( n elemento) contiene un único enlace que lo
conecta al nodo siguiente o nodo sucesor. La lista es eficiente en recorridos directos
(“adelante”).
#####                     *Listas doblemente enlazadas.*
Cada nodo contiene dos enlaces, uno a su nodo predecesor
y otro a su nodo sucesor. La lista es eficiente tanto en recorrido directo (“adelante”) como
en recorrido inverso (“atrás”).
###                      *Lista circular simplemente enlazada.*
Una lista enlazada simplemente en la que el último
elemento (cola) se enlaza al primer elemento (cabeza) de tal modo que la lista puede ser
recorrida de modo circular (“en anillo”).
###                      *Lista circular doblemente enlazada.* 
Una lista doblemente enlazada en la que el último elemento se enlaza al primer elemento y viceversa. 
Esta lista se puede recorrer de modo circular (“en anillo”) tanto en dirección directa (“adelante”) 
como inversa (“atrás”).