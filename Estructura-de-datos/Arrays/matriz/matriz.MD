###                        Arrays Multidimensionales

Los arrays vistos anteriormente se conocen como arrays unidimensionales (una sola dimensión)
y se caracterizan por tener un solo subíndice. Estos arrays se conocen también por el término
listas. Los arrays multidimensionales son aquellos que tienen más de una dimensión y, en consecuencia,
más de un índice. Los más usuales son los de dos dimensiones, conocidos también por
el nombre de tablas o matrices. Sin embargo, es posible crear arrays de tantas dimensiones como
requieran sus aplicaciones, ya sean tres, cuatro o más.
Un array de dos dimensiones (m × n) equivale a una tabla con múltiples filas y múltiples
columnas.
*<tipo de datoElemento> <nombre array> [][];*

*pantalla = new char[80][24]; // matriz con 80 filas y 24 columnas*
*puestos = new int[10][5]; // matriz de 10 filas por 5 columnas*
*final int N = 4;*
*matriz = new double[N][N]; // matriz cuadrada de N*N elementos*

######                        Clave
Java requiere que cada dimensión esté encerrada entre corchetes.