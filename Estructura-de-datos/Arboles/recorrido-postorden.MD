###                                     Recorrido Postorden (IDN)

El recorrido postorden (IDN) procesa el nodo raíz (post) después de que los subárboles izquierdo
y derecho se hayan procesado. Comienza situándose en la hoja más a la izquierda y se procesa. A
continuación, se procesa su subárbol derecho. Por último, se procesa el nodo raíz. Las etapas del
algoritmo, si el árbol no está vacío, son:
`1. Recorrer el subárbol izquierdo (I) en postorden.`
`2. Recorrer el subárbol derecho (D) en postorden.`
`3. Visitar el nodo raíz (N).`
Se visita primero el subárbol izquierdo, siguiendo el orden IDN, luego subárbol derecho, y por ultimo,
el nodo padre o la Raíz.