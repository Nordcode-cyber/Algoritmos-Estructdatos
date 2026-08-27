#                                  Concepto Básico de Grafos

##             `Definicion de Grafos subgrafos, caminos y ciclos`

##### Un Grafo es una pareja de conjuntos (${V,E}$) donde:
${V}$ es distinto de vacío, y ${E}$ es conjunto de pares de elementos de ${V}$.  
los elementos de ${V}$ se llaman ${vértices}$ o ${nodos}$.
###  ${Grafos}$ ${ no}$ ${dirigidos }$ ,
los pares de ${E}$ No ordenados, se llaman ${Aristas}$, y se representan con puntos y líneas.
###  `Grafos dirigidos ` 
los pares de ${E}$ son ordenados, se llaman ${Arcos}$, y se representan con puntos y flechas.
###                                Mas Notaciones
####  ${Grafos}$ ${no}$ ${dirigidos}$ ,
 Si $(Vi, Vj)$ representa una ${arista}$
 ${Vi}$ y ${Vj}$ son ${extremos}$ de ${Vi, Vj}$ ,
 ${Vi, Vj}$ son ${adyacente}$ porque están unidos por una arista.
##### ${(Vi, Vj)}$ es incidente de Vi, Vj
##### Si ${Vi=Vj}$, ${(Vi,Vj)}$ se llama: ${Bucle}$
 Un ${grafo}$ sin `bucle` se llama ${simple}$
####  `Grafos  dirigidos ` ,
#### ${Vi}$ es extremo inicial de ${Vi,Vj}$
#### ${Vj}$ es extremo  final  de ${Vi,Vj}$
##### Si ${Vi=Vj}$, ${(Vi,Vj)}$ se llama: ${bucle}$
##### Un ${grafo}$ sin ${bucle}$ se llama ${simple}$

 ###                      Multígrafo
 Decimos que G es un  `multigrafo`si se permite, que entre un mismo par de vértices, se trace,
 mas de una arista, y un `pseudografo` si se permiten aristas de `(v,v)`, `bucles`

 ####                    Caminos, cadenas y ciclos
 _Cadena_: a toda sucesion finita alterna de vertices y aristas (resp. arcos).
 _Cadena_ _cerrada_: a toda cadena en la que los vertices inicial y final  coinciden.
 _Camino_: a toda cadena en la que no se repiten ni vertices, ni aristas(resp. arcos).
 _Ciclo_: Cadena en la que no se repiten ninguna arista(resp. arcos), ni vertices a excepcion del inicial y final.
 _Longitud de cadena_: numero de aristas(resp. arcos), que la forman.




