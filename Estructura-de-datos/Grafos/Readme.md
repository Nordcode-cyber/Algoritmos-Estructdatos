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
${Ciclo(simple)}$ Un camino que comienza y termina en el mismo vértice,(sin repetir arcos)
${Ciclo (camino)}$ dirigido un ciclo (camino) donde las aristas, tienen dirección y son recorridas en su dirección.
 _Longitud de cadena_: numero de aristas(resp. arcos), que la forman.

###                         Subgrafos
Un subgrafo H de un grafo G es un grafo donde los vértice de H son un subconjunto de los vértices de G y los 
arcos de H son un subconjunto de los arcos de G.

######       Sea ${G =}$ ${(V(G)}$ , ${E(G))}$ Y ${H=(V(H)}$, ${E(H))}$
######     H es subgrafo de G si ${V(H)}$ ${⊆}$ ${V(G)}$ y ${E(H)}$ ${⊆E(G)}$
######     H es subgrafo generador de G si es un subgrafo de G tal que ${V(H)}$ ${=V(G)}$
####                         *Subgrafos inducidos*
######                   Sea ${G=(V,E)}$ ${grafo}$
######    Dado ${V'⊆V,V'}$ = 0, se llama *Subgrafo generado o inducido por V' al subgrafo maximal de G cuyo conjunto de vertices es V'*`
######                  Se denota ${G[V']}$
 ###                                    Matriz de Adyacencia

La característica mas importante de un grafo, que distingue a uno de otro, es el conjunto de pares de vértices que están relacionados, 
o que son adyacentes. Por ello, la forma más sencilla de representación es mediante una matriz, de tantas filas/columnas como nodos, 
que permite modelar fácilmente esa cualidad.
Sea ${G}$ = ${(V, A)}$ un ${grafo}$ de `n nodos`, siendo ${V}$ ${=}$ ${v0, v1 , ... , vn-1}$  el conjunto de nodos, 
y ${A =}$ ${(Vi, Vj)}$ el conjunto de arcos. 
Los nodos están numerados consecutivamente de 0 a n-1. La representación de los arcos se hace con una matriz A de n x n elementos, denominada
matriz de adyacencia, tal que todo elemento `aij` puede tomar los valores:

######  ${aij}$  ` 1 si hay un arco ` ${(Vi,Vj)}$
######  ${aij}$  ` 0 si no hay arco ` ${(Vi, Vj)}$

`En los Grafos no dirigidos la matriz de adyacencia siempre es simétrica` ya que las relaciones entre vértices no son ordenadas
 si ${Vi}$ `está relacionado con ${Vj}$, entonces ${Vj}$ está relacionado con  ${Vi}$.
Los ${grafos}$ que modelan problemas en los que un arco tiene asociado una magnitud, un factor de peso, también se representan,
 mediante una matriz de tantas filas/columnas como ${nodos}$. 
 Ahora un elemento cualquiera, ${Aij}$ representa el coste o factor de peso del arco ${(Vi, Vj)}$.
 La matriz de adyacencia representa los arcos, relaciones entre un par de nodos de un grafo. 
 Es una matriz de unos y ceros, que indican si dos vértices son adyacentes o no.
En un grafo valorado, cada elemento representa el peso de la arista, y por ello se la
denomina matriz de pesos.
Ver Matriz-adyacencia.SVG
###                             Lista de adyacencia

La representación de un ${Grafo}$ con matriz de ${adyacencia}$ no es eficiente cuando el grafo es poco denso `(disperso)`, 
es decir, `tiene pocos arcos, y por tanto la matriz de adyacencia tiene muchos ceros.` 
Para grafos dispersos, la matriz de adyacencia ocupa el mismo espacio que si el ${grafo}$ tuviera muchos arcos (grafo denso). 
Cuando esto ocurre, se elige la representación del ${grafo}$ con ${listas}$ ${enlazadas}$, denominadas ${listas}$ de ${adyacencia}$.
Las ${listas}$ de ${adyacencia}$ son una estructura multienlazada formada por una tabla directorio en la que cada elemento representa,
un vértice del grafo, del cual emerge una lista enlazada con todos sus `vértices adyacentes`.
Es decir, cada lista representa los arcos con el vértice origen del nodo de la lista directorio, por eso se llama lista de adyacencia.
###                                Función de adyacencia

Sea ${G=(V,E)}$ , con ${|V|}$
Llamamos una _Función gamma_ de ${G}$ que va del conjunto de vértices, al conjunto de partes,
de vértices.
$\Gamma$: ${V -> P(V)}$ definida
$\Gamma$: ${(u)}$= {v $\in$ V / (u,v)$\in$ E}
###                             Concepto de Grado 

Sea ${G =(V,E)}$  un ${grafo}$ no dirigido
Sea ${V}$ un vértice de ${G}$
Se llama grado de v al numero de aristas incidentes en v.
Si la arista es un bucle en v, contribuye con dos unidades al valor de grado.
######       Propiedades en Grafos no dirigidos

a) $$ \sum d(v)=2card(E)$$
b) El numero de vértices de grado impar es par.

#####       Sucesiones graficas
Una sucesión finita de enteros no negativos se dice sucesión grafica si existe un ${grafo}$ no dirigido simple, 
es decir grafos sin bucles, cuya arista empieza y termina en el mismo vértice.
que tiene por sucesión de grados la sucesión dada.

#####        Propiedad en grafos dirigidos

Sea ${G =(V,E)}$  un ${grafo}$ dirigido, ${v}$ un vertice de ${G}$. 
Se llama grado de entrada de ${v}$ al numero de arcos,
cuyo extremo final es ${v}$. 
Se llama grado de salida de ${v}$ al numero de arcos, cuyo extremo inicial es ${v}$.

###                   Conexion en grafos no dirigidos
Sea ${G =(V,E)}$  un ${grafo}$ no dirigido, se dice que el vertice ${u}$ esta conectado al ${v}$ si ${u}$ alcanza a ${v}$.
La anterior relacion binaria definida ${VxV}$ es una relacion binaria de equivalencia en ${V}$.
Se llama ${Componente conexa }$ de ${G}$ a todo ${subgrafo}$ inducido por los ${vertices}$ de una clase de equivalencia.
Se dice  que un ${Grafo}$ es ${Conexo}$ si tiene un unica componente ${conexa}$.
Sea ${G =(V,E)}$  un ${grafo}$ no dirigido, conexo, ${card(V)=n >1}$
(a) ${G}$ posee un ciclo o un vertice de grado 1.
(b) Si la arista e, pertenece a un ciclo, entonces ${G-e}$ es tambien ${conexa}$.
(c) ${card(E)}$ >=${card(V)}$-1. en un ${grafo}$ conexo ${no dirigido}$, siempre hay un numero mayor o igual de aristas que numero de vertices -1.

###                   Conexion en grafos  dirigidos
#####                   Grafos fuertemente conexos
Sea ${G =(V,E)}$  un ${grafo}$  dirigido se dice que el vertice ${u}$ esta fuertemente conectado al ${v}$ si ${u}$ alcanza a ${v}$ y ${v}$ alcanza a ${u}$.
La anterior relacion binaria definida ${VxV}$ es una relacion binaria de equivalencia en ${V}$.
Se llama ${Componente fuertemente conexa }$ de ${G}$ a todo ${subgrafo}$ inducido por los ${vertices}$ de una clase de equivalencia.
Se dice  que un ${Grafo}$ es ${fuertemente Conexo}$ si tiene un unica componente ${conexa}$.

#####                   Equivalencia
Una forma equivalente de definir ${grafo}$ fuertemente ${conexo}$ y componentes fuertemente conexas es la siguiente:
 un ${grafo}$  dirigido ${G}$ es fuertemente conexo si todos los ${vertices}$ se alcanzan mutuamente,
se llama componente fuertemente ${conexa}$ de ${G}$ a todo ${subgrafo}$ maximal fuertemente conexo de ${G}$
Sea ${G =(V,E)}$ un grafo dirigido, fuertemente conexo, ${card}$ (V)=${n>1}$.