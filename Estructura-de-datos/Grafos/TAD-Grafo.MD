###                                                          El TAD Grafo

####                                                      El ADT Grafo No dirigido

#####             *$Graph<V,E>:$*
###### *Un grafo pesado de vértices con rótulos de tipo* *`V`* y *arcos con rotulo de tipo *`E`* 
#####             $Vertex<V>:$
###### *La posición de un vértice con rótulos de tipo* *`V`*
#####              $Edge<E>:$ *La posición de un arco con rotulo  de tipo  *`E`*

*operaciones básicas con grafos*

| Arista$(u, v)$.       | Agrega el arco o arista $(u, v)$ al grafo.                                   |
| --------------------- | ---------------------------------------------------------------------------- |
| AristaPeso$(u, v, w)$ | para grafo valorado agrega el arco$(u, v)$ al grafo, y el coste del arco, w. |
| borraArco$(u, v)$     | Elimina del grafo el arco$(u, v)$                                            |
| adyacente$(u, v)$     | operación que devuelve true si los vértices $u,v$ forman un arco.            |
| nuevoVertice$(u)$     | Agrega el vértice u al grafo $G$                                             |





