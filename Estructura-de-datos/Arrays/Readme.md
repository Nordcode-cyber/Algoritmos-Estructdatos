###                             Arrays (Vectores)

Un array o vector (lista o tabla) es una secuencia de datos del mismo tipo. Los datos se llaman
elementos del array y se numeran consecutivamente ${0, 1, 2, 3 ...n}$ El tipo de elementos almacenados,
en el array puede ser cualquier dato simple de Java o de un tipo previamente declarado como una clase. 
Normalmente, el array se utiliza para almacenar tipos tales como ${char}$, ${int}$ o ${float}$.
Un array puede contener, por ejemplo, la edad de los alumnos de una clase, las temperaturas
de cada día de un mes en una ciudad determinada o el número de personas que residen en cada una
de las diecisiete comunidades autónomas españolas. Cada ítem del array se denomina elemento.
####                             Subíndices
Los elementos de un array se numeran, como ya se ha comentado, consecutivamente `0, 1, 2, 3,...n`,
estos números se denominan valores índice o ${subíndice}$ del array. El término “subíndice”  especifica, 
igual que en matemáticas, una secuencia tal como ${arr =}$ ${a0}$, ${a1, a2...n}$ Estos números localizan,
 la posición del elemento, dentro del array, proporcionando acceso directo al array.
Si el nombre del array es a, entonces a[0] es el nombre del elemento que está en la posición
0, a[1] es el nombre del elemento que está en la posición 1, etc. En general, el elemento i-ésimo
está en la posición i-1, de modo que si el array tiene n elementos, sus nombres son a[0],
a[1],...,a[n-1]. Gráficamente, se representa así el array a con seis elementos.

#####                           Declaración de un Array

```int[] arr = { 2,3,4,5,8,9);```
```char[] arrchar = {"a","i","k","n"};```
```String[] words = {"C++","Java", "python"};```