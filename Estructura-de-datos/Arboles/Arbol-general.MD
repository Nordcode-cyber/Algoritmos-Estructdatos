##                Arboles, Arboles binarios y arboles generales

1. Árbol Generales
2. Árbol de Expresión
3. Árbol Binario
4. Árbol Binario de búsqueda
5. Recorrido

El árbol es una estructura de datos muy importante en informática y en ciencias de la computación.
Los árboles son estructuras no lineales, al contrario que los vectores y las listas enlazadas,
que constituyen estructuras lineales.
Los árboles se utilizan para representar fórmulas algebraicas, para organizar objetos en orden
de tal forma que las búsquedas sean muy eficientes y en aplicaciones diversas tales como
inteligencia artificial o algoritmos de cifrado. Casi todos los sistemas operativos almacenan sus
archivos en árboles o estructuras similares a árboles. Además de las aplicaciones citadas, los
árboles se utilizan en diseño de compiladores, procesado de texto y algoritmos de búsqueda.
En este capítulo se estudiarán el concepto de árbol general y los tipos de árboles más usuales,
binario y binario de búsqueda o árbol ordenado. También se estudiarán algunas aplicaciones
típicas del diseño y la construcción de árboles.

#####             Arboles de profundidades diferentes

Un árbol se divide en subárboles. Un subárbol es cualquier estructura conectada por debajo
del nodo raíz. Cada nodo de un árbol es la raíz de un subárbol que se define por el nodo y todos
sus descendientes. El primer nodo de un subárbol se conoce como el nodo raíz del subárbol y se
utiliza para nombrar el subárbol. Además, los subárboles se pueden subdividir en subárboles.
#####                  Resumen de definiciones

El primer nodo de un árbol, normalmente dibujado en la posición superior, se denomina
raíz del árbol.
• Las flechas que conectan un nodo con otro se llaman arcos o ramas.
• Los nodos terminales, esto es, nodos de los cuales no se deduce ningún nodo, se denominan
hojas.
• Los nodos que no son hojas se denominan nodos internos.
• *En un árbol donde una rama va de un nodo ${n1}$ a un nodo ${n2}$, se dice que ${n1}$ es el padre de*
*${n2}$ y que ${n2}$ es un hijo de ${n1}$.*
• *${n1}$ se llama ascendiente de ${n2}$ si ${n1}$ es el padre de ${n2}$ o si ${n1}$ es el padre de un ascendiente de ${n2}$.*
• *${n2}$ se llama descendiente de ${n1}$ si ${n1}$ es un ascendiente de ${n2}$.*

• Un camino de ${n1}$ a ${n2}$ es una secuencia de arcos contiguos que van de  ${n1}$ a ${n2}$.
• La longitud de un camino es el número de arcos que contiene o, de forma equivalente, el
número de nodos del camino menos uno.
• El nivel de un nodo es la longitud del camino que lo conecta al nodo raíz.
• La profundidad o altura de un árbol es la longitud del camino más largo que conecta el
raíz a una hoja.
• Un subárbol de un árbol es un subconjunto de nodos del árbol, conectados por ramas del
propio árbol, esto es, a su vez un árbol.
• Sea S un subárbol de un árbol A: si para cada nodo n de SA, SA contiene también todos los
descendientes de n en A, SA se llama un subárbol completo de A.
• Un árbol está equilibrado cuando, dado un número máximo ${k}$ de hijos de cada nodo y
la altura del árbol ${h}$, cada nodo de nivel ${k < h-1}$ tiene exactamente ${k}$ hijos. El árbol está
equilibrado perfectamente, si cada nodo de nivel ${l<h}$ tiene exactamente ${k}$ hijos.

#####                 Representación de lista

Otro formato utilizado para representar  árboles es la lista entre paréntesis. Esta es la notación
utilizada con expresiones ${algebraicas}$. En esta representación, cada paréntesis abierto
indica el comienzo de un nuevo nivel y cada paréntesis cerrado completa un nivel y se mueve
hacia arriba un nivel en el árbol. La notación en paréntesis correspondiente al árbol de la
${A(B (C, D), E, F, (G, H, I))}$.

#####                       Nodo Raíz

Un árbol es un conjunto de uno o más nodos tales que:
1. Hay un nodo diseñado especialmente llamado raíz.
2. Los nodos restantes se dividen en ${n ≥ 0}$ conjuntos disjuntos, ${T1}$ ... ${Tn}$, tal que
cada uno de estos conjuntos es un árbol. A ${T1}$ ... ${Tn}$ se les denomina subárboles
del raíz si un árbol no está vacío, entonces el primer nodo se llama raíz ${R}$. Obsérvese en la definición 
que el árbol ha sido definido de modo recursivo, ya que los subárboles se definen como árboles.

######                                   Nodos sucesores

Estos nodos sucesores se llaman hijos. Por ejemplo, el nodo B es el padre de los hijos E y F. El
padre de H es el nodo D. Un árbol puede representar diversas generaciones en la familia. Los hijos
de un nodo y los hijos de estos hijos se llaman descendientes, y el padre y los abuelos de un nodo
son sus ascendientes. Por ejemplo, los nodos E, F, I y J son descendientes de B. Cada nodo no
raíz tiene un único padre y cada padre tiene cero o más nodos hijos.

###                             Árbol Binario
*un árbol binario no puede tener mas de 2 subárboles*

Un árbol binario es un árbol cuyos nodos no pueden tener más de dos subárboles. En un árbol
binario, cada nodo puede tener cero, uno o dos hijos (subárboles). Se conoce el nodo de la izquierda
como hijo izquierdo y el nodo de la derecha como hijo derecho.
Un árbol binario es una estructura recursiva. Cada nodo es la raíz de su propio subárbol y
tiene hijos, que son raíces de árboles, llamados subárboles derecho e izquierdo del nodo, respectivamente.
Un árbol binario se divide en tres subconjuntos disjuntos:

1. ${R}$           *Nodo Raíz*
2. ${I1, I2, In}$  *Subárbol Izquierdo de R*
3. ${D1, D2, Dn}$  *Subárbol Derecho de R*

#####                        Árbol Binario completo
Un árbol binario completo de profundidad ${n}$ es un árbol que para cada nivel, del ${0}$ al nivel ${n-1}$ , 
tiene un conjunto, lleno de nodos y todos los nodos hojas a nivel ${n}$ ocupan las posiciones mas a la `izquierda` 
del Árbol.
Un árbol binario completo que contiene ${2n}$ nodos a nivel ${n}$ es **un árbol lleno**.
Un árbol lleno es un ${árbol}$ ${ binario}$ que tiene el máximo de numero de entrada para su altura, 
esto sucede cuando el ultimo nivel esta lleno.

####                        Árbol Binario degenerado

El último caso de árbol es un tipo especial, denominado árbol degenerado, en el que hay una
sola hoja ${(E)}$ y cada ${nodo}$ no hoja sólo tiene un hijo. Un árbol degenerado es equivalente a
una lista enlazada.
Los árboles binarios completos y llenos de profundidad ${k+1}$ proporcionan algunos datos matemáticos
de interés. En cada caso, existe un ${nodo}$ ${(2º)}$ al nivel 0 ${(raíz)}$, dos nodos (21 ) a nivel 1,
cuatro nodos (22 ) a nivel 2, etc. A través de los primeros ${k-1}$ niveles se puede demostrar, considerando
la suma de los términos de una progresión geométrica de razón 2, que hay ${2}$ ${k - 1}$ ${nodos}$.

####                        Equilibrio 

La distancia de un nodo a la raíz determina la eficiencia con la que puede ser localizado. Por ejemplo, dado cualquier nodo de un árbol, 
a sus hijos se puede acceder siguiendo sólo un camino de bifurcación o de ramas, el que conduce al nodo deseado. 
De modo similar, a los nodos en el nivel 2 de un árbol sólo puede accederse siguiendo dos ramas del árbol.
La característica anterior nos conduce a una característica muy importante de un árbol binario, su balance o equilibrio. 
Para determinar si un árbol está equilibrado, se calcula su factor de equilibrio. ${h}$
El factor de equilibrio de un árbol binario es la diferencia en altura entre los
subárboles derecho e izquierdo. Si la altura del subárbol izquierdo es hI y la altura del subárbol
derecho hD, entonces el factor de equilibrio del árbol B se determina por la siguiente fórmula:
.*` B = hD - hI `*
###                                  Recorrido de un Arbol Binario
####                            Recorrido En Orden (IND)

El recorrido en orden ${inorder}$ procesa primero el subárbol izquierdo, después el raíz y, a continuación,
el subárbol derecho. El significado de in es que la raíz se procesa entre los subárboles.
Si el árbol no está vacío, el método implica los siguientes pasos:
`1. Recorrer el subárbol izquierdo (I) en orden.`
`2. Visitar el nodo raíz (N).`
`3. Recorrer el subárbol derecho (D) en orden.`
El primer subárbol recorrido es el `subárbol izquierdo` del nodo raíz, siguiendo el orden ${IND}$,
luego visita el nodo `Raiz`, y por ultimo el `subarbol derecho`

####                               Recorrido Preorden (NID) 

El recorrido Preorden (NID) 
conlleva los siguientes pasos, en los que el nodo raíz va antes que
los subárboles:
`1. Visitar el nodo raíz (N).`
`2. Recorrer el subárbol izquierdo (I) en preorden.`
`3. Recorrer el subárbol derecho (D) en preorden.`
Dadas las características recursivas de los árboles, el algoritmo de recorrido tiene naturaleza recursiva. 
Primero se procesa  ${R}$, a continuación, el `subárbol izquierdo` y, posteriormente,
el `subárbol derecho`. Para procesar el subárbol izquierdo, se siguen los mismos pasos:
`raíz, subárbol izquierdo y subárbol derecho` (proceso recursivo). Luego se hace lo mismo con
el subárbol derecho.

```el recorrido Preorden, la raiz se procesa antes que los subarboles izquierdo y derecho```
####                                     Recorrido Postorden (IDN)

El recorrido postorden (IDN) procesa el nodo raíz ${post}$ después de que los subárboles izquierdo
y derecho se hayan procesado. Comienza situándose en la hoja más a la izquierda y se procesa. A
continuación, se procesa su subárbol derecho. Por último, se procesa el nodo raíz. Las etapas del
algoritmo, si el árbol no está vacío, son:
`1. Recorrer el subárbol izquierdo (I) en postorden.`
`2. Recorrer el subárbol derecho (D) en postorden.`
`3. Visitar el nodo raíz (N).`
Se visita primero el subárbol izquierdo, siguiendo el orden IDN, luego subárbol derecho, y por ultimo,
se visita ${N}$
####                           ${TAD}$ ${Arbol}$ ${Binario}$

La estructura de árbol binario constituye un tipo abstracto de datos; 
las operaciones básicas que definen el TAD árbol binario son las siguientes:

| Operaciones    |Descripcion                                                 |
|----------------|------------------------------------------------------------|
| CrearArbol     | inicia Arbol como vacio                                    | 
| DeclararArbol  | Crea un árbol con un elemento raíz y dos ramas, izq y der  | 
| IsEmpty        | EsVacio Comprueba si el Arbol no tiene nodos               | 
| Root           | Devuelve el nodo raiz                                      | 
| Izquierdo      | Obtiene la rama o subárbol izquierdo de un árbol dado.     | 
| Derecho        | Obtiene la rama o subárbol derecho de un árbol dado.       | 
| Borrar         |  Elimina del árbol el nodo con un elemento determinado.    | 
| Pertenece      | Determina si un elemento se encuentra en el árbol.         |

###                             Árbol Binario de Búsqueda

Un árbol binario de búsqueda es aquel en que, dado un nodo, todos los datos del subárbol
izquierdo son menores que los datos de ese nodo, mientras que todos los datos del subárbol
derecho son mayores que sus propios datos.
Un ABB permite representar los datos de una colección de forma jerarquizada y ordenado
cuyo objetivo es permitir la búsqueda de elementos en tiempos sublineales con el numero de elementos.
[todos los datos de su subárbol izquierdo son menores que el que ocupa la raíz]
[todos los datos de su subárbol derecho son mayores que el que ocupa la raíz]

####                       Operaciones en Arboles binario de búsqueda

| Operacion            | Descripcion                                                 |
| -------------------- | ----------------------------------------------------------- |
| Busqueda de un nodo  | Devuelve la referencia al nodo del arbol o ```null```       |
|Inserccion de un nodo | Crea nodo con dato asociado, y lo agrega, en orden, al arbol|
|Borrado de un nodo    |Busca el nodo del árbol que contiene un dato y lo quita      |
|Recorrido de un arbol |Recorrido  árbol binario `preorden`, `inorden` y `postorden` |

####                       Complejidad Temporal en un ABB

Árbol lleno $0(log2(N))$.
todos los niveles completos.

${0(N)}$
ver: Árbol-binario-búsquedas. SVG
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
La búsqueda del ${3}$ recorre los siguientes ${nodos}$ del árbol ${5-2-3}$ 
La búsqueda del ${9}$ recorre los siguientes ${nodos}$ del árbol ${5-7-9}$ 

####                        Complejidad Temporal de un ABB

Caso mejor  
El elemento buscado esta en la ${R}$ del `ABB` se realiza ${1}$ comparación ----> Coste Constante
Caso peor:
El elemento esta en cualquier hoja del nivel, o el nivel mas alto o el elemento no esta en el `ABB`,
en el peor de los casos la complejidad temporal es proporcional a la altura de un `ABB`.

####                             Inserción de un ABB

La inserción de un `ABB` requiere buscar el lugar de inserción, y crear nueva hoja en el caso de que,
no este el elemento. La inserción en un `ABB` requiere un coste temporal, en el peor de los casos,
lineal con la altura del árbol similar al de la búsqueda:

###### Para un Árbol equilibrado: $0{(log2(N))}$
###### Para un Árbol degenerando: ${0(N)}$

####                             Obtención del mínimo y máximo en un ABB

El mínimo dato se encuentra en el ${nodo}$ situado mas a la `izquierda`. si existiera algún elemento mas pequeño,
que el situado en ${Subarbol}$ `izquierdo` (por definición de ABB), el máximo  `dato` se encuentra en el ${nodo}$,
situado mas a la `derecha`. Si existiera algún elemento mas grande que el estaría situado en el ${Subarbol}$ `derecho`,
por definición de `ABB`.

###                              Conclusiones del Arbol Binario de busqueda

El `ABB` es una Estructura de datos orientada a la busqueda de datos comparables.
Permite realizar las principales operaciones,(insertar, buscar y eliminar) en tiempo ${0(log2(N))}$ siempre que:
*El `ABB` sea equilibrado*
*Si no esta equilibrado, el coste puede llegar a* ${0(N)}$, como en un array.
Para tener un `ABB` equilibrado la elección de la ${Raiz}$ es fundamental.
Elemento mediano en la ${Raiz}$ de cada ${Subarbol}$.



