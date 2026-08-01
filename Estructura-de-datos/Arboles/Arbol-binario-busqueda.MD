###                             Árbol Binario de Búsqueda

Un árbol binario de búsqueda es aquel en que, dado un nodo, todos los datos del subárbol
izquierdo son menores que los datos de ese nodo, mientras que todos los datos del subárbol
derecho son mayores que sus propios datos.
Un ABB permite representar los datos de una colección de forma jerarquizada y ordenado
cuyo objetivo es permitir la búsqueda de elementos en tiempos sublineales con el numero de elementos.
[todos los datos de su subárbol izquierdo son menores que el que ocupa la raíz]
[todos los datos de su subárbol derecho son mayores que el que ocupa la raíz]

####                       Operaciones en Arboles binario de búsqueda

| Operacion            | Descripcion                            |
| -------------------- | ----------------------------------------------------------- |
| Busqueda de un nodo  | Devuelve la referencia al nodo del arbol o ```null```       |
|Inserccion de un nodo | Crea nodo con dato asociado, y lo agrega, en orden, al arbol|
|Borrado de un nodo    |Busca el nodo del árbol que contiene un dato y lo quita      |
|Recorrido de un arbol |Recorrido  árbol binario `preorden`, `inorden` y `postorden` |

####                       Complejidad Temporal en un ABB

Árbol lleno $0(log2(N))$.
todos los niveles completos.

${0(N)}$
ver: Arbol-binario-busqueda.SVG
*La altura del árbol binario viene dado por la forma en la que se ha construido:* 
*los casos extremos aporta cota inferior y superior a la altura del árbol binario*

####                       Construcción de un ABB
Queremos ingresar los elementos ${[3,5,4,7,6]}$ en un `ABB`, la selección de la raíz determina,
la estructura del árbol:
**_si el primer Elemento ${R}$ del árbol, es el mínimo, o máximo elemento:_**

####                         Búsqueda de un ABB

La búsqueda compara el objeto ${X}$ con la raíz. Si ${X<R}$, la búsqueda prosigue de manera,
recursiva por el ${Subarbol}$ Izquierdo. Si ${X>R}$, la búsqueda prosigue de manera,
recursiva por el ${Subarbol}$ Derecho. La búsqueda termina cuando se encuentra el elemento,
o cuando ya no se encuentran mas ${nodos}$ por visitar.
${[1,2,3,5,7,9]}$ 
La busqueda del ${3}$ recorre los siguientes ${nodos}$ del arbol ${5-2-3}$ 
La busqueda del ${9}$ recorre los siguientes ${nodos}$ del arbol ${5-7-9}$ 


