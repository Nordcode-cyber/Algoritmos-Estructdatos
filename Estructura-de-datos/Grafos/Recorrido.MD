###                        RECORRIDO DE UN GRAFO

En general, recorrer una estructura consiste en visitar (procesar) cada uno de los ${nodos}$ a partir
de uno dado. Se puede recorrer una lista, o un ${arbol}$ en, por ejemplo, *`preorden `* partiendo del *` nodo raíz`* . 
De igual forma, recorrer un ${grafo}$ consiste en visitar todos los ${vértices}$ alcanzables a partir
de uno dado. Muchos de los problemas que se plantean con los ${grafos}$ exigen examinar las ${aristas}$ o ${arcos}$
de que consta y procesar los ${vértices}$.
Siendo *` V`*  el conjunto de ${vértices}$ del ${grafo}$, los algoritmos de recorrido de ${grafo}$s parten de
un nodo, *v*, y mantienen un conjunto de nodos marcados (procesables), *` W`*, que inicialmente es el
*` nodo o vértice de partida`*, v. Cada pasada del algoritmo retira un nodo *` w`* , del conjunto *` w`*, que se
procesa y para cada una de las aristas cuyo origen es *` w`*, *` (w,u)`*, su vértice adyacente *` u`* se añade
a W si no está marcado. El algoritmo continúa hasta que el conjunto W se queda vacío, en ese
momento todo vértice no marcado no es accesible desde el nodo de partida v. Si se necesita un
recorrido completo, se puede continuar desde cualquier vértice no marcado.

###                                   Nota
*Hay dos formas de recorrer un ${grafo}$: recorrido en profundidad y recorrido en anchura. Si
el conjunto de nodos marcados se trata como una ${cola}$, el recorrido es en anchura; si se
trata como una ${pila}$, el recorrido es en profundidad.*

###                            Recorrido en Anchura
Se utiliza una ${cola}$ como estructura en la que se mantienen los ${vértices}$ marcados que se van a
procesar posteriormente. El proceso de los elementos en una ${cola}$ (First in, First out ) hace que, 
a partir del vértice de partida v se procesen primero todos los ${vértices}$ adyacentes a
v, después los adyacentes de éstos que no estuvieran ya marcados o visitados, y así sucesivamente
con los adyacentes de los adyacentes.
El orden en que se visitan los nodos en el recorrido en anchura se expresa de manera más
concisa en los siguientes pasos:
1. Marcar el vértice de partida v.
2. Meter en la ${cola}$ el vértice de partida v.
3. Repetir los pasos 4 y 5 hasta que se cumpla la condición ${cola}$ vacía.
4. Quitar el nodo frente de la ${cola}$, w, visitar w.
5. Meter en la ${cola}$ todos los vértices adyacentes a w que no estén marcados y, a continuación
marcar esos vértices.
6. Fin del recorrido.
###                             Recorrido en Profundidad
La búsqueda de los vértices y aristas de un ${grafo}$ en profundidad persigue el mismo objetivo que
el recorrido en anchura: visitar todos los vértices del ${grafo}$ alcanzables desde un vértice dado.
Difiere este recorrido con el recorrido en anchura sólo en el orden en que se procesan los vértices
adyacentes. El orden en el recorrido en profundidad es el que determina la estructura ${pila}$.
El recorrido empieza por un vértice v del ${grafo}$, se marca como visitado y se mete en la ${pila}$.
Después se recorre en profundidad cada vértice adyacente a v no visitado; hasta que no haya
más vértices adyacentes no visitados. Esta estrategia de examinar los vértices se denomina en
profundidad porque la dirección de visitar es hacia adelante mientras resulta posible; al contrario
que la búsqueda en anchura que primero visita todos los vértices posibles en amplitud.
