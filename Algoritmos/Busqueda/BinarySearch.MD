###                               Algoritmo de busqueda binaria 

El algoritmo de busqueda bianria se utiliza para encontrar la posicion de un valor especifico dentro de un Array. 
El funcionamiento de este algoritmo, es segun el principio de "Divide y Venceras" es considerado el mejor algoritmo de busqueda, 
por la velocidad de ejecucion con un array ordenado, ej. [1, 3, 5, 8, 11, 15, 17, 19, 21] elemento objetivo [15].
Compara el elemento objetivo, con el elemento medio del Array, si el elmento objetivo es mayor que el elemento central, 
la busqueda continuara la mitad izquierda, este proceso se repite hasta que elemento medio==elemento objetivo, 
o el elemento no esta en el Array. Si encuentra el elemento objetivo devolvera subindice, sino devolvera -1.