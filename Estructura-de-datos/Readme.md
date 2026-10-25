###                                           Complejidad Temporal de Estructuras de Datos

###                                          EVALUACIÓN DE LA MEMORIA

La complejidad en relación al espacio de un programa es la cantidad de memoria que se necesita para ejecutarse. La evaluación de la memoria estática es muy fácil de realizar: se calcula sumando la memoria que ocupan las variables simples, los campos de los registros y las componentes de los vectores. La memoria dinámica depende de la cantidad de datos y del funcionamiento del programa. Se calcula de forma similar a como se hace la evaluación del tiempo. Basta con tener en cuenta las órdenes de reserva y liberación de memoria y la posición que ocupan en el programa.
###                                             EVALUACIÓN DEL TIEMPO

La complejidad en relación al tiempo de un programa es la cantidad de tiempo que se necesita para su ejecución, para lo cual
es necesario considerar el "principio de la invarianza" (la eficiencia de dos implementaciones distintas de un mismo algoritmo
difiere tan sólo en una constante multiplicativa). El enfoque matemático considera el consumo de tiempo por parte del algoritmo
como una función del total de sus datos de entrada.
Se define el tamaño de un ejemplar de datos de entrada, como el número de unidades lógicas necesarias para representarlo
en la computadora de una manera razonablemente compacta. Para la evaluación de un algoritmo es importante considerar
que el tiempo que tarda un programa en ejecutarse depende del tamaño del ejemplar de entrada. Hay que tener en cuenta que
el tiempo de ejecución puede depender también de la entrada concreta.
###                                              NOTACION O-GRANDE
Si se ha escrito y depurado un programa y se ha seleccionado la entrada específica de tamaño n para considerar su ejecución. El tiempo de ejecución de un programa se expresa normalmente utilizando la notación "O-grande" que está diseñada para expresar factores constantes tales como:
• Número medio de instrucciones máquina que genera un compilador determinado.
• Número medio de instrucciones máquina por segundo que ejecuta una computadora específica.
Así, se dirá que un algoritmo determinado emplea un tiempo O(n) que se lee "O grande de n" o bien "O de n" y que informalmente significa "algunos tiempos constantes n".

###                                             RANKING DE  EFICIENCIA 

| Complejidad   | Nombre             | Calificación              | Que pasa si n crece                                |
| ------------- | ------------------ | ------------------------- | -------------------------------------------------- |
| $O(1)$.       | Constante          | la mas deseada            | el tiempo no cambia                                |
| ${0(log n)}$ | Logaritmica        | muy buena                 | el tiempo crece de forma extremadamente lenta      |
| ${0(n)}$      | Lineal             | aceptable                 | el tiempo crece en proporsion directa a los datos  |
| $O(n log n)$  | Lineal-Logarítmica | El límite de lo eficiente | mejor  para ordenar datos en MergeSort y QuickSort |
| $O(n^2)$      | Cuadrática         | Mala                      | el tiempo se dispara (bucles anidados)             |
| $O(2^n)$      | Exponencial        | Horrible                  | Se vuelve imposible de ejecutar                    |


####                        Tabla Comparativa de funciones de Complejidad


| ${n}$ | ${log(n)}$ | ${n}$ | ${nlog(n)}$ | $n2$ | ${n3}$ | ${n4}$ | ${2n}$  |
| ----- | ---------- | ----- | ----------- | ---- | ------ | ------ | ------- |
| 1     | 0          | 1     | 0           | 1    | 1      | 1      | 2       |
| 5     | 0.7        | 0     | 3.5         | 25   | 125    | 625    | 32      |
| 10    | 1          | 10    | 10          | 100  | 1000   | 10000  | 1024    |
| 20    | 1.3        | 20    | 26          | 400  | 8000   | 160000 | 1048576 |





###             FUNCIONES DE COMPLEJIDAD DE ESTRUCTURA DE DATOS 
##### Complejidad temporal promedio

| Estructura de Datos | acceso       | busqueda     | inserccion   | borrado      |
| ------------------- | ------------ | ------------ | ------------ | ------------ |
| Array               | ${0(1)}$     | ${0(N)}$     | ${0(N)}$     | ${0(N)}$     |
| ArrayList           | ${0(1)}$     | ${0(N)}$     | ${0(N)}$     | ${0(N)}$     |
| LinkedListSingly    | ${0(N)}$     | ${0(N)}$     | ${0(1)}$     | ${0(1)}$     |
| DoubleLinkedList    | ${0(N)}$     | ${0(N)}$     | ${0(1)}$     | ${0(1)}$     |
| Stack               | ${0(N)}$     | ${0(N)}$     | ${0(1)}$     | ${0(1)}$     |
| Queue               | ${0(N)}$     | ${0(N)}$     | ${0(1)}$     | ${0(1)}$     |
| HashTable           | ${0(1)}$     | ${0(1)}$     | ${0(1)}$     | ${0(1)}$     |
| BinarySearchTree    | ${0(log N)}$ | ${0(log N)}$ | ${0(log N)}$ | ${0(log N)}$ |

