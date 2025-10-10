###                             Arbol Binario
*un arbol binario no puede tener mas de 2 subarboles*

Un árbol binario es un árbol cuyos nodos no pueden tener más de dos subárboles. En un árbol
binario, cada nodo puede tener cero, uno o dos hijos (subárboles). Se conoce el nodo de la izquierda
como hijo izquierdo y el nodo de la derecha como hijo derecho.
Un árbol binario es una estructura recursiva. Cada nodo es la raíz de su propio subárbol y
tiene hijos, que son raíces de árboles, llamados subárboles derecho e izquierdo del nodo, respectivamente.
Un árbol binario se divide en tres subconjuntos disjuntos:

1. `{R}`           *Nodo Raiz*
2. `{I1, I2, In}`  *Subarbol Izquierdo de R*
3. `{D1, D2, Dn}`  *Subarbol Derecho de R*

####                        Arbol Binario completo
Un arbol binario completo de profundidad `n` es un arbol que para cada nivel, del `0` al nivel `n-1` , tiene un conjunto,
lleno de nodos y todos los nodos hojas a nivel `n`  es un arbol lleno, un arbol lleno contiene maximo `n` de entradas,
para su altura.

####                        Equilibrio 

La distancia de un nodo a la raíz determina la eficiencia con la que puede ser localizado. Por ejemplo, dado cualquier nodo de un árbol, 
a sus hijos se puede acceder siguiendo sólo un camino de bifurcación o de ramas, el que conduce al nodo deseado. 
De modo similar, a los nodos en el nivel 2 de un árbol sólo puede accederse siguiendo dos ramas del árbol.
La característica anterior nos conduce a una característica muy importante de un árbol binario, su balance o equilibrio. 
Para determinar si un árbol está equilibrado, se calcula su factor de equilibrio. 
El factor de equilibrio de un árbol binario es la diferencia en altura entre los
subárboles derecho e izquierdo. Si la altura del subárbol izquierdo es hI y la altura del subárbol
derecho hD, entonces el factor de equilibrio del árbol B se determina por la siguiente fórmula:
.*` B = hD - hI `*