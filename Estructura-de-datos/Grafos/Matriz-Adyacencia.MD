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

 ####                                   Nota

 La matriz de adyacencia representa los arcos, relaciones entre un par de nodos de un grafo. 
 Es una matriz de unos y ceros, que indican si dos vértices son adyacentes o no.
En un grafo valorado, cada elemento representa el peso de la arista, y por ello se la
denomina matriz de pesos.
Ver Matriz-adyacencia.SVG



