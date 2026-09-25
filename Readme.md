### ALGORITMOS Y ESTRUCTURA DE DATOS

En este repositorio aprenderemos el maravilloso mundo del los algoritmos y estructura de datos, conoceremos diferentes  algoritmos, estructuras de datos, recorremos su complejidad, y la implementación en el lenguaje Java.

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

### 1. Estructuras de Datos (`/Estructura-de-datos`)
- *Lineales:*
  - `Vectores` / (Arrays, matrices)
  - `ListasEnlazadas` / (Simples, Doblemente Enlazada, ordenada, reversa)
  - `Pilas` / (implementacion arrays, reversa, recursiva)
  - `Colas` / (implemententacion arrays, implementacion linked list)
- *No Lineales:*
  - `TablaHash` / (Manejo de colisiones, funcion hash)
  - `Cola de Prioridad` / (Arbol Binario, Prioridad maxima, TAD Cola de Prioridad)
  - `Árboles Binarios` / (Equilibrio, Recorrido, Binario de Busqueda, Nodos TAD Arbol Binario)
  - `Grafos` / (Camino,Ciclo,Recorrido, Matriz de adyacencia y Lista de adyacencia. TAD Grafo)
- *Complejidad temporal en estructuras de datos:*
### 2. Algoritmos (`/Algoritmos`)
-  *Ordenamiento simple:*
    -Burbuja.
    -Seleccion.
    -Inserccion.
-  *Ordenamiento complejo:*
    -Shell.
    -Mergesort.
    -Heapsort.
    -Quicksort.
-  *Programacion dinamica*.
-  *manipulacion de bits*.
-  *Recursividad*.
- *Complejidad temporal en algoritmos:*
## 🛠️ Requisitos Previos del repositorio.
Para ejecutar los ejemplos necesitas:
- **JDK:** Versión 17 o superior.
- **IDE / Editor:** IntelliJ IDEA, Eclipse, NetBeans o VS Code.
## 🛠️ Requisitos Previos como programador.
- **Programacion estructurada: ** C o similar.
   - Fundamentos de Programacion.
   - Expresiones.
   - Bucles, funciones.
   - Tipos de datos.
   - Estuctura.
   - Vectores (arrays)


  
 

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
estos números se denominan valores índice o ${subíndice}$ del array. El término ${subindice}$  especifica, 
igual que en matemáticas, una secuencia tal como ${arr =}$ ${a0}$, ${a1, a2...n}$ Estos números localizan,
 la posición del elemento, dentro del array, proporcionando acceso directo al array.
Si el nombre del array es a, entonces a[0] es el nombre del elemento que está en la posición
0, a[1] es el nombre del elemento que está en la posición 1, etc. En general, el elemento i-ésimo
está en la posición i-1, de modo que si el array tiene n elementos, sus nombres son a[0],
a[1],...,a[n-1]. Gráficamente, se representa así el array a con seis elementos.
Se accede a los ${subíndice}$ del array, a traves de los ciclos ${For}$, ${For each}$.

####                                           Arrays Multidimensionales
Los arrays vistos anteriormente se conocen como arrays unidimensionales (una sola dimensión) y se caracterizan por tener un solo subíndice. Estos arrays se conocen también por el término listas. 
Los arrays multidimensionales son aquellos que tienen más de una dimensión y, en consecuencia, más de un índice. Los más usuales son los de dos dimensiones, conocidos también por el nombre de tablas o matrices. Sin embargo, es posible crear arrays de tantas dimensiones como requieran sus aplicaciones, ya sean tres, cuatro o más. Un array de dos dimensiones (m × n) equivale a una tabla con múltiples filas y múltiples columnas. 
 pantalla = new char[80][24]; // matriz con 80 filas y 24 columnas puestos = new int[10][5]; 
 // matriz de 10 filas por 5 columnas final int N = 4; matriz = new double[N][N]; // matriz cuadrada de NN elementos*

Clave
Java requiere que cada dimensión esté encerrada entre corchetes.



      
