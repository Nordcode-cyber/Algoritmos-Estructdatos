  Algortimh knapsack
                                                                  Problema de la mochila      
                                              El algoritmo de programación dinámica por espacio 
Es una forma de resolver el problema de la mochila que utiliza una matriz de tamaño n x m, donde n es el número de objetos y m es el peso máximo permitido en la mochila. Cada elemento de la matriz se calcula de la siguiente forma:

Se inicializa la matriz con ceros en todas sus posiciones.

Para cada objeto i desde 1 hasta n:

Para cada peso máximo j desde 1 hasta m:

Si el peso del objeto i es mayor que el peso máximo j, entonces el valor del elemento en la posición (i, j) es igual al valor del elemento en la posición (i-1, j).
Si el peso del objeto i es igual o menor que el peso máximo j, entonces el valor del elemento en la posición (i, j) es el máximo entre el valor del elemento en la posición (i-1, j) y el valor del objeto i más el valor del elemento en la posición (i-1, j-peso_i).
El valor del elemento en la última posición de la matriz (n, m) contiene la solución óptima al problema de la mochila.

Ejemplo:

Supongamos que queremos resolver el problema de la mochila con una mochila que puede contener un peso máximo de 10 kg y una serie de objetos con diferentes pesos y valores, como por ejemplo una computadora de 2 kg que vale $800, una cámara de 1 kg que vale $300 y un libro de 0,5 kg que vale $20. La matriz se inicializa con ceros en todas sus posiciones y se calcula de la siguiente forma:



                                                    El algoritmo de programación dinámica por tiempo 
Es una forma de resolver el problema de la mochila que utiliza un vector de tamaño m, donde m es el peso máximo permitido en la mochila. Cada elemento del vector se calcula de la siguiente forma:

Se inicializa el vector con ceros en todas sus posiciones.

Para cada objeto i desde 1 hasta n:

Para cada peso máximo j desde peso_i hasta m:

El valor del elemento en la posición j es el máximo entre el valor del elemento en la posición j y el valor del objeto i más el valor del elemento en la posición j-peso_i.
El valor del elemento en la última posición del vector (m) contiene la solución óptima al problema de la mochila.

Ejemplo:

Supongamos que queremos resolver el problema de la mochila con una mochila que puede contener un peso máximo de 10 kg y una serie de objetos con diferentes pesos y valores, como por ejemplo una computadora de 2 kg que vale $800, una cámara de 1 kg que vale $300 y un libro de 0,5 kg que vale $20. El vector se inicializa con ceros en todas sus posiciones.