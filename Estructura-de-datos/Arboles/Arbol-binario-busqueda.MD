###                             Arbol Binario de Busqueda
Un árbol binario de búsqueda es aquel en que, dado un nodo, todos los datos del subárbol
izquierdo son menores que los datos de ese nodo, mientras que todos los datos del subárbol
derecho son mayores que sus propios datos.
Un ABB permite representar los datos de una coleccion de forma jerarquizada y ordenado
cuyo objetivo es permitir la busqueda de elementos en tiempos sublineales con el numero de elementos.
> [todos los datos de su subarbol izquierdo son menores que el que ocupa la raiz]: 
> [todos los datos de su subarbol derecho son mayores que el que ocupa la raiz]: 

####                       Operaciones en Arboles binario de busqueda

| Operacion            | Descripcion                            |
| -------------------- | ----------------------------------------------------------- |
| Busqueda de un nodo  | Devuelve la referencia al nodo del arbol o ```null```       |
|Inserccion de un nodo | Crea nodo con dato asociado, y lo agrega, en orden, al arbol|
|Borrado de un nodo    |Busca el nodo del árbol que contiene un dato y lo quita      |
|Recorrido de un arbol |Recorrido  árbol binario `preorden`, `inorden` y `postorden` |