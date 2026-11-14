#                                  Concepto Básico de Grafos

##             `Definicion de Grafos subgrafos, caminos y ciclos`

 Un Grafo ${G}$ es una pareja de conjuntos (${V,E}$) donde:
${V}$ es distinto de vacío, y ${E}$ es conjunto de pares de elementos de ${V}$.  
los elementos de ${V}$ se llaman ${vértices}$ o ${nodos}$.
${Grafos}$ ${ no}$ ${dirigidos }$
los pares de ${E}$ No ordenados, se llaman ${Aristas}$, y se representan con puntos y líneas.
${Grafos}$ ${dirigidos}$ 
los pares de ${E}$ son ordenados, se llaman ${Arcos}$, y se representan con puntos y flechas.
###                                Mas Notaciones
  ${Grafos}$ ${no}$ ${dirigidos}$
 Si $(Vi, Vj)$ representa una ${arista}$
 ${Vi}$ y ${Vj}$ son ${extremos}$ de ${Vi, Vj}$ ,
 ${Vi, Vj}$ son ${adyacente}$ porque están unidos por una arista.
##### ${(Vi, Vj)}$ es incidente de Vi, Vj.
##### Si ${Vi=Vj}$, ${(Vi,Vj)}$ se llama: ${Bucle}$
 Un ${grafo}$ sin `bucle` se llama ${simple}$
####  Grafos  dirigidos ,
#### ${Vi}$ es extremo inicial de ${Vi,Vj}$
#### ${Vj}$ es extremo  final  de ${Vi,Vj}$
##### Si ${Vi=Vj}$, ${(Vi,Vj)}$ se llama: ${bucle}$
##### Un ${grafo}$ sin ${bucle}$ se llama ${simple}$

 ###                      Multígrafo
 Decimos que ${G}$ es un  ${multigrafo}$ si se permite, que entre un mismo par de vértices, se trace,
 mas de una arista, y un ${pseudografo}$ si se permiten aristas de ${(v, v)}$ , bucles.

 ####                    Caminos, cadenas y ciclos
 _Cadena_: a toda sucesión finita alterna de vértices y aristas (resp. arcos).
 _Cadena_ _cerrada_: a toda cadena en la que los vértices inicial y final  coinciden.
 _Camino_: a toda cadena en la que no se repiten ni vértices, ni aristas(resp. arcos).
 _Ciclo_: Cadena en la que no se repiten ninguna arista(resp. arcos), ni vértices a excepción del inicial y final.
${Ciclo(simple)}$ Un camino que comienza y termina en el mismo vértice,(sin repetir arcos)
${Ciclo (camino)}$ dirigido un ciclo (camino) donde las aristas, tienen dirección y son recorridas en su dirección.
 _Longitud de cadena_: numero de aristas(resp. arcos), que la forman.
###                        Camino

Un camino ${P}$ de longitud ${n}$ desde el ${vertice}$ V0 a $Vn$ en un ${Grafo}$ ${G}$ es la secuencia de ${n +1}$ ${vertices}$,
En un grafo valorado, la longitud del camino con pesos es la suma de los pesos de los arcos en el camino.
$V0$, $V1$, $V2$, ... $Vn$ tal que  $(Vi,Vi+1) \in A$ (arcos) para ${0}$ ${≤i≤n}$. Matemáticamente.
${P}$ = $V0$, $V1$, $V2$, ... $Vn$.
En algunos grafos se dan arcos desde un vértice a sí mismo, ${(v,v)}$; entonces, el camino ${v}$ ${→}$ ${v}$
es un bucle. Normalmente, en los grafos no hay nodos relacionados con sí mismo, no es frecuente encontrarse grafos con bucles.
Un camino P = ${(v1 ,v2 ,v3 ,..., vn )}$ es simple si todos los nodos que forman el camino son 0 distintos, 
pudiendo ser iguales ${v , v}$ , es decir, los extremos del camino. 
En un ${G}$ ${grafo dirigido}$, un ciclo es un camino simple cerrado. Por tanto, un ciclo empieza y 
termina en el mismo ${nodo}$, o ${vertice}$ ${V0 = Vn}$ , y además, debe tener más de un ${arco}$. 
Un ${G}$ ${grafo}$ dirigido sin ciclos ${(acíclico)}$ se acostumbra a denominar ${GDA}$ (Grafo Dirigido Acíclico). 
La Figura Camino-grafodir.SVG muestra un ${grafo dirigido}$ en el que los ${vértices}$ ${(A, E, B, F, A)}$ forman un ciclo de longitud 4. 
En general, un ciclo de longitud ${k}$ se denomina ${k-ciclo}$.


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

 ${aij}$  1 si hay un arco  ${(Vi, Vj)}$
 ${aij}$  0 si no hay arco  ${(Vi, Vj)}$

`En los Grafos no dirigidos la matriz de adyacencia siempre es simétrica` ya que las relaciones entre vértices no son ordenadas
 si ${Vi}$ `está relacionado con ${Vj}$, entonces ${Vj}$ está relacionado con  ${Vi}$.
Los ${grafos}$ que modelan problemas en los que un arco tiene asociado una magnitud, un factor de peso, también se representan,
 mediante una matriz de tantas filas/columnas como ${nodos}$. 
 Ahora un elemento cualquiera, ${Aij}$ representa el coste o factor de peso del arco ${(Vi, Vj)}$.
 La matriz de adyacencia representa los arcos, relaciones entre un par de nodos de un grafo. 
 Es una matriz de unos y ceros, que indican si dos vértices son adyacentes o no.
En un grafo valorado, cada elemento representa el peso de la arista, y por ello se la
denomina matriz de pesos.
Ver Matriz-adyacencia.drawio.SVG

###                                    Matriz de incidencia

Dado  un ${grafo}$  ${G}$=${(V, E)}$ de ${n}$ ${vertices}$ ,  $v1,v2,...vn \in V$,  $e1,e2,...en\in E$ 
llamaremos matriz de incidencia ${A}$ del ${grafo}$ ${G}$ a una matriz de,
incidencia ${A}$ =  $[aij] \in A$ ${M}$ ${n}$ ${(R)}$ que cumple:
Las columnas de la matriz representan las ${aristas}$ del  ${Grafo}$.
Las filas de la matriz representan a los ${vertices}$.
por cada ${vertice}$ unido por una ${arista}$

${aij}$ 1, si ${vi}$ es adyacente a ${ei}$
${aij}$ 0, si ${vi}$ no es adyacente a ${ei}$

###                             Lista de adyacencia

La representación de un ${Grafo}$ con matriz de ${adyacencia}$ no es eficiente cuando el grafo es poco denso `(disperso)`, 
es decir, `tiene pocos arcos, y por tanto la matriz de adyacencia tiene muchos ceros.` 
Para grafos dispersos, la matriz de adyacencia ocupa el mismo espacio que si el ${grafo}$ tuviera muchos arcos (grafo denso). 
Cuando esto ocurre, se elige la representación del ${grafo}$ con ${listas}$ ${enlazadas}$, denominadas ${listas}$ de ${adyacencia}$.
Las ${listas}$ de ${adyacencia}$ son una estructura multienlazada formada por una tabla directorio en la que cada elemento representa,
un vértice del grafo, del cual emerge una lista enlazada con todos sus `vértices adyacentes`.
Es decir, cada lista representa los arcos con el vértice origen del nodo de la lista directorio, por eso se llama lista de adyacencia.
Ver Lista-adyencia.drawio.svg
###                                Función de adyacencia

Sea ${G=(V,E)}$ , con ${|V|}$
Llamamos una _Función gamma_ de ${G}$ que va del conjunto de vértices, al conjunto de partes,
de vértices.
$\Gamma$: ${V -> P(V)}$ definida
$\Gamma$: ${(u)}$= {v $\in$ V / (u,v)$\in$ E
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

###                   Conexión en grafos no dirigidos
Sea ${G =(V,E)}$  un ${grafo}$ no dirigido, se dice que el vértice ${u}$ esta conectado al ${v}$ si ${u}$ alcanza a ${v}$.
La anterior relación binaria definida ${VxV}$ es una relación binaria de equivalencia en ${V}$.
Se llama ${Componente conexa }$ de ${G}$ a todo ${subgrafo}$ inducido por los ${vertices}$ de una clase de equivalencia.
Se dice  que un ${Grafo}$ es ${Conexo}$ si tiene un única componente ${conexa}$.
Sea ${G =(V,E)}$  un ${grafo}$ no dirigido, conexo, ${card(V)=n >1}$
(a) ${G}$ posee un ciclo o un vértice de grado 1.
(b) Si la arista e, pertenece a un ciclo, entonces ${G-e}$ es también ${conexa}$.
(c) ${card(E)}$ >=${card(V)}$-1. en un ${grafo}$ conexo ${no dirigido}$, siempre hay un numero mayor o igual de aristas que numero de vértices -1.
Ver Conexion-grafo-nodir.svg

###                   Conexión en grafos  dirigidos
#####                   Grafos fuertemente conexos
Sea ${G =(V,E)}$  un ${grafo}$  dirigido se dice que el vértice ${u}$ esta fuertemente conectado al ${v}$ si ${u}$ alcanza a ${v}$ y ${v}$ alcanza a ${u}$.
La anterior relación binaria definida ${VxV}$ es una relación binaria de equivalencia en ${V}$.
Se llama ${Componente fuertemente conexa }$ de ${G}$ a todo ${subgrafo}$ inducido por los ${vertices}$ de una clase de equivalencia.
Se dice  que un ${Grafo}$ es fuertemente ${Conexo}$ si tiene un única componente ${conexa}$.
Ver Conexion-grafo-dir.svg

#####                   Equivalencia
Una forma equivalente de definir ${grafo}$ fuertemente ${conexo}$ y componentes fuertemente conexas es la siguiente:
 un ${grafo}$  dirigido ${G}$ es fuertemente conexo si todos los ${vertices}$ se alcanzan mutuamente,
se llama componente fuertemente ${conexa}$ de ${G}$ a todo ${subgrafo}$ maximal fuertemente conexo de ${G}$
Sea ${G =(V,E)}$ un grafo dirigido, fuertemente conexo, ${card}$ (V)=${n>1}$.

#####                  Grafo débilmente conexo

Sea ${G =(V,E)}$  un ${grafo}$  dirigido

Se dice que el vértice ${u}$ esta débilmente conectado al ${v}$ si ${u}$ y ${v}$ están conectado en el ${grafo}$ subyacente $\bar{G}$
La anterior relación binaria definida ${VxV}$ es una relación binaria de equivalencia en ${V}$.
se llama componente  débilmente ${conexa}$ de ${G}$  a todo ${Subgrafo}$ inducido por los vertices de una clase de equivalencia, o 
de forma equivalente a todo ${Subgrafo}$ ta que su ${subyacente}$ sea una componente conexa en $\bar{G}$
####                  Puntos de Articulación y puentes

######                     Vertice de corte

Sea ${G}$ un  ${Grafo}$  no ${dirigido}$. 
Se dice que el ${vertice}$ v de ${G}$ es ${vertice}$ de corte si el numero de componentes conexas crece al eliminar el ${vertice}$ del ${grafo}$,ie si
${comp(G-{v})>}$ ${comp(G)}$. ${Vertice}$ de corte tambien llamado punto de Articulación.

######                     Arista de corte
Sea ${G}$ un  ${Grafo}$  no ${dirigido}$. 
Se dice que la ${arista}$ ${e}$ de ${G}$ es ${arista}$ de corte, si el numero de componentes conexas crece al eliminar la ${arista}$ del ${grafo}$,ie., si
${comp(G-{e})>}$ ${comp(G)}$. ${Arista}$ de corte tambien llamado puente.

###                        RECORRIDO DE UN GRAFO

En general, recorrer una estructura consiste en visitar (procesar) cada uno de los ${nodos}$ a partir
de uno dado. Se puede recorrer una lista, o un ${arbol}$ en, por ejemplo, *`preorden `* partiendo del *` nodo raíz`* . 
De igual forma, recorrer un ${grafo}$ consiste en visitar todos los ${vértices}$ alcanzables a partir
de uno dado. Muchos de los problemas que se plantean con los ${grafos}$ exigen examinar las ${aristas}$ o ${arcos}$
de que consta y procesar los ${vértices}$.
Siendo *` V`*  el conjunto de ${vértices}$ del ${grafo}$, los algoritmos de recorrido de ${grafo}$s parten de
un nodo, *v*, y mantienen un conjunto de nodos marcados (procesables), *` W`*, que inicialmente es el
*` nodo o vértice de partida`*, v. Cada pasada del algoritmo retira un nodo *` w`* , del conjunto *` w`*, que se
procesa y para cada una de las aristas cuyo origen es *` w`*, *` (w,u)`*, su vértice adyacente *` u`* se añade
a W si no está marcado. El algoritmo continúa hasta que el conjunto W se queda vacío, en ese
momento todo vértice no marcado no es accesible desde el nodo de partida v. Si se necesita un
recorrido completo, se puede continuar desde cualquier vértice no marcado.

###                                   Nota
*Hay dos formas de recorrer un ${grafo}$: recorrido en profundidad y recorrido en anchura. Si
el conjunto de nodos marcados se trata como una ${cola}$, el recorrido es en anchura; si se
trata como una ${pila}$, el recorrido es en profundidad.*

###                            Recorrido en Anchura
Se utiliza una ${cola}$ como estructura en la que se mantienen los ${vértices}$ marcados que se van a
procesar posteriormente. El proceso de los elementos en una ${cola}$ (First in, First out ) hace que, 
a partir del vértice de partida v se procesen primero todos los ${vértices}$ adyacentes a
v, después los adyacentes de éstos que no estuvieran ya marcados o visitados, y así sucesivamente
con los adyacentes de los adyacentes.
El orden en que se visitan los nodos en el recorrido en anchura se expresa de manera más
concisa en los siguientes pasos:
1. Marcar el vértice de partida v.
2. Meter en la ${cola}$ el vértice de partida v.
3. Repetir los pasos 4 y 5 hasta que se cumpla la condición ${cola}$ vacía.
4. Quitar el nodo frente de la ${cola}$, w, visitar w.
5. Meter en la ${cola}$ todos los vértices adyacentes a w que no estén marcados y, a continuación
marcar esos vértices.
6. Fin del recorrido.
###                             Recorrido en Profundidad
La búsqueda de los vértices y aristas de un ${grafo}$ en profundidad persigue el mismo objetivo que
el recorrido en anchura: visitar todos los vértices del ${grafo}$ alcanzables desde un vértice dado.
Difiere este recorrido con el recorrido en anchura sólo en el orden en que se procesan los vértices
adyacentes. El orden en el recorrido en profundidad es el que determina la estructura ${pila}$.
El recorrido empieza por un vértice v del ${grafo}$, se marca como visitado y se mete en la ${pila}$.
Después se recorre en profundidad cada vértice adyacente a v no visitado; hasta que no haya
más vértices adyacentes no visitados. Esta estrategia de examinar los vértices se denomina en
profundidad porque la dirección de visitar es hacia adelante mientras resulta posible; al contrario
que la búsqueda en anchura que primero visita todos los vértices posibles en amplitud.




