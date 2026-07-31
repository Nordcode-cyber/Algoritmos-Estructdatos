###                             Lista de adyacencia

La representación de un ${Grafo}$ con matriz de ${adyacencia}$ no es eficiente cuando el grafo es poco denso `(disperso)`, 
es decir, `tiene pocos arcos, y por tanto la matriz de adyacencia tiene muchos ceros.` 
Para grafos dispersos, la matriz de adyacencia ocupa el mismo espacio que si el ${grafo}$ tuviera muchos arcos (grafo denso). 
Cuando esto ocurre, se elige la representación del ${grafo}$ con ${listas}$ ${enlazadas}$, denominadas ${listas}$ de ${adyacencia}$.
Las ${listas}$ de ${adyacencia}$ son una estructura multienlazada formada por una tabla directorio en la que cada elemento representa,
un vértice del grafo, del cual emerge una lista enlazada con todos sus `vértices adyacentes`.
Es decir, cada lista representa los arcos con el vértice origen del nodo de la lista directorio, por eso se llama lista de adyacencia.