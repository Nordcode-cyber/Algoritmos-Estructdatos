##                             Algoritmo de ordenamiento Quicksort

El algoritmo de ordenamiento Quicksort(Ordenación Rápida) es más rápido y fácil de ordenar dos listas pequeñas que una lista grande. 
Se denomina método de ordenación rápida porque, en general, puede ordenar una lista de datos mucho más rápidamente que cualquiera
de los otros métodos de ordenación .

###                                      divide and conquer

El método se basa en la estrategia típica de “divide y vencerás” (divide and conquer). La lista a clasificar almacenada
en un vector o array se divide (parte) en dos sublistas: una con todos los valores menores o iguales a un
cierto valor específico y otra con todos los valores mayores que ese valor. El valor elegido puede ser cualquier valor
arbitrario del vector. En ordenación rápida se llama a este valor pivote.

###                                      Implementación
#####     ```Vector original: ```  ```[8,1,4,9,6,3,5,2,7,0]```
#####   ```pivote(elemento central )```     ```6```

*La etapa 2 requiere mover todos los elementos menores que el ```pivote``` a la parte izquierda*
*del vector y los elementos mayores a la parte derecha. Para ello, se recorre la lista de izquierda*
*a derecha utilizando un ```índice i``` que se inicializa a la posición más baja (inferior) buscando*
*un elemento mayor al ```pivote```. También se recorre la lista de derecha a izquierda buscando un elemento menor. *
*Para hacer esto se utilizará un ```índice j``` inicializado a la posición más alta (superior).*
*El ```índice i``` se detiene en el elemento 8 (mayor que el pivote) y el ```índice j``` se detiene en el*
*elemento 0 (menor que el pivote)*
[8,1,4,9,{6},3,5,2,7,0]
 i                   j
*Ahora se intercambian 8 y 0 para que estos dos elementos se sitúen correctamente en cada*
*sublista; y se incrementa el ```índice i```, y se decrementa el  ```indice j``` para seguir los intercambios.*
[0,1,4,9,{6},3,5,2,7,8]
   i               j
*A medida que el algoritmo continúa, ```indice i``` se detiene en el elemento mayor, 9, y ```indice j``` se detiene en el elemento menor, 2.
[0,1,4,9,{6},3,5,2,7,8]
       i         j
*Se intercambian los elementos mientras que ```indice i``` y ```indice j``` no se crucen. En caso contrario, se detiene*
*este bucle. En el caso anterior, se intercambian 9 y 2.*
[0,1,4,2,{6},3,5,9,7,8]
       i         j
*Continúa la exploración y ahora el contador ```indice i``` se detiene en el elemento 6 (que es el ```pivote```) y*
*el ```índice j``` se detiene en el elemento menor 5*.
[0,1,4,2,{6},3,5,9,7,8]
          i    j
*Los índices tienen actualmente los valores ```i = 5```, ```j = 5```. Continúa la exploración hasta que*
```i > j```, acaba con ```i = 6```, ```j = 5```.
[0,1,4,2,{6},3,5,9,7,8]
            ij
En esta posición, los ```índices i y j``` han cruzado posiciones en el array. Se detiene la búsqueda
y no se realiza ningún intercambio, ya que el elemento al que accede j está ya correctamente
[0,1,4,2,5,3,{6},9,7,8]
            ij

situado. Las dos sublistas ya han sido creadas, la lista original se ha dividido en dos particiones:
```sublista_izquierda```    ```pivote```   ```sublista_derecha```
  [0,1,4,2,5,3]                 [6]               [9,7,8]
*intercambio 4 x 2                           intercambio 9x7*
  [0,1,2,4,5,3]                 [6]               [7,9,8]
*intercambio 5 x 3                           intercambio 9x8*
  [0,1,2,4,3,5]                 [6]               [7,8,9]
*intercambio 4 x 3
[0,1,2,3,4,5]                   [6]               [7,8,9]
##### Array Ordenado por Quicksort
[0,1,2,3,4,5,6,7,8,9]
 






