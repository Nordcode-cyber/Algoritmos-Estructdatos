##                                                      HeapSort
                                                                         
###                        Método de ordenamiento por Montículo,  algoritmo de  Árbol Binario con Recursividad.

El algoritmo empieza con un vector de N elementos que no cumple la condición de montículo. Lo primero que hace el algoritmo es construir el montículo de partida. Para ello, considera el montículo como una estructura recursiva. Se puede considerar que los nodos del montículo del último nivel del árbol son cada uno un sub montículo de 1 nodo. Subiendo un nivel en el árbol, cada nodo es la raíz de un árbol que cumple la condición del montículo, excepto, quizás, en la raíz (su rama izquierda y derecha cumplen la condición, ya que se está construyendo de abajo a arriba); entonces, al aplicar el método criba() (reconstruye el montículo hundiendo la raíz), se asegura que cumple la condición de ordenación y ya es submontículo. El algoritmo va subiendo de nivel en nivel, construyendo tantos sub montículos como nodos tiene el nivel, hasta llegar al primer nivel, en el que sólo hay un nodo, que es la raíz del montículo completo.

###                                      Explicación lógica del algoritmo Heapsort:

El algoritmo Heapsort es un algoritmo de ordenamiento basado en la estructura de datos "heap". Un heap es un árbol binario completo en el que cada nodo padre es mayor (o menor) que sus hijos. El proceso de ordenamiento comienza construyendo un heap a partir de la lista desordenada.Para construir el heap, se insertan todos los elementos de la lista, en el heap uno por uno, comenzando desde la izquierda y moviéndose hacia la derecha. Cada vez que se inserta un elemento en el heap, se asegura que la propiedad del heap se mantenga (es decir, cada nodo padre es mayor o menor que sus hijos). Una vez que se ha construido el heap, se extrae el elemento máximo del heap (que siempre es la raíz del árbol). El elemento máximo se coloca al final de la lista ordenada. Luego, se reorganiza el heap para asegurarse de que la propiedad del heap se mantenga después de la eliminación del elemento máximo. Este proceso se repite hasta que todos los elementos del heap se han eliminado y se han agregado a la lista ordenada. La lista ordenada final es la lista original de elementos, pero en orden ascendente o descendente según la elección de implementación del heap. En resumen, el algoritmo Heapsort construye un heap a partir de la lista desordenada, extrae el elemento máximo del heap y lo coloca al final de la lista ordenada, y repite este proceso hasta que todos los elementos del heap se han eliminado y se han agregado a la lista ordenada.

###                                    Metodo de Intercambio del algoritmo Heapsort

La fase de extracción de los elementos en orden tarda O(n log n) tiempo en el peor de los casos. La razón de esto se debe al hecho de que cada extracción de un elemento del montículo toma O(log n) tiempo en el peor de los casos. Esto se debe a que después de cada extracción, el montículo debe ser restaurado a un estado válido mediante una serie de intercambios y comparaciones de elementos. En el peor de los casos, esto implica descender por la altura completa del árbol binario completo que representa el montículo, lo que tiene una complejidad de O(log n).

En total, el tiempo de ejecución de Heapsort en el peor de los casos es O(n log n), ya que la fase de construcción del montículo y la fase de extracción de los elementos en orden tienen complejidades de O(n) y O(n log n), respectivamente. En resumen, el análisis logarítmico de Heapsort se basa en el hecho de que la extracción de cada elemento del montículo toma O(log n) tiempo en el peor de los casos debido a la altura del árbol binario completo que representa el montículo. Esto da lugar a una complejidad total de O(n log n) para el algoritmo en el peor de los casos.

###                    Notación asintótica complejidad temporal O(n log n) ?

*O(n log n)*El algoritmo de ordenación por montículos es sencillo de implementar, realiza una ordenación in situ de O(n·lg(n)), pero no es estable.

El primer bucle, la fase de "apilamiento" Θ(n), ordena el arreglo en forma de montón. El segundo bucle, la fase de "ordenación" O(n·lg(n)), extrae repetidamente el máximo y restablece el orden del montón.

La función sink se escribe de forma recursiva para mayor claridad. Por lo tanto, como se muestra, el código requiere un espacio de Θ(lg(n)) para la pila de llamadas recursivas. Sin embargo, la recursión de cola en sink() se puede convertir fácilmente en iteración, lo que da como resultado un límite de espacio de O(1).

Ambas fases son ligeramente adaptativas, aunque no de una manera particularmente útil. En el caso de un orden casi perfecto, la fase de agrupamiento destruye el orden original. En el caso inverso, la fase de agrupamiento es lo más rápida posible, ya que el array comienza en orden de agrupamiento, pero luego la fase de ordenación es la típica. En el caso de pocas claves únicas, se observa cierta aceleración, pero no tanta como en el algoritmo de ordenación Shell o Quicksort de tres vías.

| Caracteristica | Heapsort   | Quicksort | Mergesort  |
| -------------- | ---------- | --------- | ---------- |
| Peor Caso      | $O(nlogn)$ | $O(n2)$   | $O(nlogn)$ |
| Memoria        | $O(1)$     | $O(logn)$ | $O(n)$     |
| Estable        | No         | No        | Si         |
