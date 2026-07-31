####                               Recorrido Preorden (NID) en Árbol Binario

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

######    ```el recorrido Preorden, la raiz se procesa antes que los subarboles izquierdo y derecho```