###                                    Matriz de Adyacencia

La característica mas importante de un grafo, que distingue a uno de otro, es el conjunto de pares de vértices que están relacionados, 
o que son adyacentes. Por ello, la forma más sencilla de representación es mediante una matriz, de tantas filas/columnas como nodos, 
que permite modelar fácilmente esa cualidad.
Sea `G = (V, A)` un grafo de `n nodos`, siendo `V = {v0, v1 , ... , vn-1}` el conjunto de nodos, y `A = {(vi, vj)}` el conjunto de arcos. 
Los nodos están numerados consecutivamente de 0 a n-1. La representación de los arcos se hace con una matriz A de n x n elementos, denominada
matriz de adyacencia, tal que todo elemento `aij` puede tomar los valores:

`aij{1 si hay un arco(Vi,Vj)}`
`aij{0 si no hay arco(Vi, Vj)}`