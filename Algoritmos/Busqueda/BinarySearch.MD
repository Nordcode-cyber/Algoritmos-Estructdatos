###                               Algoritmo de búsqueda binaria 

El algoritmo de búsqueda binaria se utiliza para encontrar la posición de un valor especifico dentro de un Array. 
El funcionamiento de este algoritmo, es según el principio de "Divide y Vencerás" es considerado el mejor algoritmo de búsqueda, 
por la velocidad de ejecución con un array ordenado, ej. [1, 3, 5, 8, 11, 15, 17, 19, 21] elemento objetivo [15].
Compara el elemento objetivo, con el elemento medio del Array, si el elemento objetivo es mayor que el elemento central, 
la búsqueda continuara la mitad izquierda, este proceso se repite hasta que elemento medio==elemento objetivo, 
o el elemento no esta en el Array. Si encuentra el elemento objetivo devolverá subíndice, sino devolverá -1.