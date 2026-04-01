###                                                          El TAD Grafo

Un grafo es una colección de vértices y aristas. Modelamos la abstracción como una combinación de tres tipos de datos: Vértice, Arista y Grafo. Un Vértice es un objeto ligero que almacena un elemento arbitrario proporcionado por el usuario (por ejemplo, un código de aeropuerto);
suponemos que el elemento se puede recuperar con el método *`getElement()`*. Una Arista también almacena un objeto asociado (por ejemplo, un número de vuelo, la distancia del viaje o el costo), que se devuelve mediante su método *`getElement()`*.

La abstracción principal para un grafo es el TAD Grafo. Suponemos que un grafo puede ser no dirigido o dirigido, y la designación se declara al construirlo;
recordemos que un grafo mixto se puede representar como un grafo dirigido, modelando la arista {u,v} como un par de aristas dirigidas (u,v) y (v,u).

###                                                             TAD Grafo Metodos
| Operaciones     |Descripcion                                                 |
*`numVertices()`* |  Devuelve el número de vértices del grafo.                 |
*`vertices()`*    |  Devuelve una iteración de todos los vértices del grafo.   |
*`numEdges()*`    |  Devuelve el número de aristas del grafo.                  |
*`edges()`*       |  Devuelve una iteración de todas las aristas del grafo.    |
*`getEdge(u, v)`* | Devuelve la arista del vértice u al vértice v, si existe;  | 
                  | de lo contrario, devuelve null. Para un grafo no dirigido, |
                  |  no hay  diferencia entre getEdge(u, v) y getEdge(v, u).   |
*`endVertices(e)`*| Devuelve un array que contiene los dos vértices extremos 
                  | de la arista e. Si el grafo es dirigido, el primer vértice | 
                  |  es el origen, y el segundo es el destino.
 *`opposite(v, e)`*: Para la arista e incidente al vértice v, devuelve el otro vértice de la
                    arista; Se produce un error si e no es incidente a v.
 *`outDegree(v)`* Devuelve el número de aristas salientes del vértice v.
 *`inDegree(v)`*: Devuelve el número de aristas entrantes al vértice v.
                    Para un grafo no dirigido, devuelve el mismo valor que outDegree(v).
 *`outgoingEdges(v)`*: Devuelve una iteración de todas las aristas salientes del vértice v.
 *`incomingEdges(v) `*: Devuelve una iteración de todas las aristas entrantes al vértice v.
                        Para un grafo no dirigido, devuelve la misma colección que
                            outgoingEdges(v).
 *`insertVertex(x) `*: Crea y devuelve un nuevo vértice que almacena el elemento x.
 *`insertEdge(u, v, x) `*: Crea y devuelve una nueva arista del vértice u al vértice v,
                         almacenando el elemento x; Se produce un error si ya existe una arista de u a v.
 *`removeVertex(v) `*: Elimina el vértice v y todas sus aristas incidentes del grafo.
 *`removeEdge(e) `*: Elimina la arista e del grafo.


