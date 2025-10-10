###                Arboles, Arboles binarios y arboles generales

1. Arbol Generales
2. Arbol Binario
3. Arbol Binario de busqueda
4. Recorrido

El árbol es una estructura de datos muy importante en informática y en ciencias de la computación.
Los árboles son estructuras no lineales, al contrario que los arrays y las listas enlazadas,
que constituyen estructuras lineales.
Los árboles se utilizan para representar fórmulas algebraicas, para organizar objetos en orden
de tal forma que las búsquedas sean muy eficientes y en aplicaciones diversas tales como
inteligencia artificial o algoritmos de cifrado. Casi todos los sistemas operativos almacenan sus
archivos en árboles o estructuras similares a árboles. Además de las aplicaciones citadas, los
árboles se utilizan en diseño de compiladores, procesado de texto y algoritmos de búsqueda.
En este capítulo se estudiarán el concepto de árbol general y los tipos de árboles más usuales,
binario y binario de búsqueda o árbol ordenado. También se estudiarán algunas aplicaciones
típicas del diseño y la construcción de árboles.

###             Arboles de profundidades diferentes

Un árbol se divide en subárboles. Un subárbol es cualquier estructura conectada por debajo
del nodo raíz. Cada nodo de un árbol es la raíz de un subárbol que se define por el nodo y todos
sus descendientes. El primer nodo de un subárbol se conoce como el nodo raíz del subárbol y se
utiliza para nombrar el subárbol. Además, los subárboles se pueden subdividir en subárboles.
###                  Resumen de definiciones

El primer nodo de un árbol, normalmente dibujado en la posición superior, se denomina
raíz del árbol.
• Las flechas que conectan un nodo con otro se llaman arcos o ramas.
• Los nodos terminales, esto es, nodos de los cuales no se deduce ningún nodo, se denominan
hojas.
• Los nodos que no son hojas se denominan nodos internos.
• *En un árbol donde una rama va de un nodo `n1` a un nodo `n2`, se dice que `n1` es el padre de*
*`n2` y que `n2` es un hijo de `n1`.*
• *`n1` se llama ascendiente de `n2` si `n1` es el padre de `n2` o si `n1` es el padre de un ascendiente de `n2`.*
• *`n2` se llama descendiente de `n1` si `n1` es un ascendiente de `n2`.*

• Un camino de `n1` a `n2` es una secuencia de arcos contiguos que van de  `n1` a `n2`.
• La longitud de un camino es el número de arcos que contiene o, de forma equivalente, el
número de nodos del camino menos uno.
• El nivel de un nodo es la longitud del camino que lo conecta al nodo raíz.
• La profundidad o altura de un árbol es la longitud del camino más largo que conecta el
raíz a una hoja.
• Un subárbol de un árbol es un subconjunto de nodos del árbol, conectados por ramas del
propio árbol, esto es, a su vez un árbol.
• Sea S un subárbol de un árbol A: si para cada nodo n de SA, SA contiene también todos los
descendientes de n en A, SA se llama un subárbol completo de A.
• Un árbol está equilibrado cuando, dado un número máximo k de hijos de cada nodo y
la altura del árbol h, cada nodo de nivel k < h-1 tiene exactamente k hijos. El árbol está
equilibrado perfectamente, si cada nodo de nivel l<h tiene exactamente k hijos.

###                 Representacion de lista

Otro formato utilizado para representar un árboles es la lista entre paréntesis. Esta es la notación
utilizada con expresiones algebraicas. En esta representación, cada paréntesis abierto
indica el comienzo de un nuevo nivel y cada paréntesis cerrado completa un nivel y se mueve
hacia arriba un nivel en el árbol. La notación en paréntesis correspondiente al árbol de la
Figura 13.2: A(B (C, D), E, F, (G, H, I)).