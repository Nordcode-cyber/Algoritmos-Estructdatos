### Algoritmo de Seleccion
se trata de ordenar los valores del array de modo que a[0]
sea el valor más pequeño, el valor almacenado en a[1] sea el siguiente más pequeño, y así
hasta a[n-1] que ha de contener el elemento de mayor valor. El algoritmo se apoya en las
pasadas que intercambian el elemento más pequeño, sucesivamente con el elemento de la
lista, a[], que ocupa la posición igual al orden de pasada (hay que considerar el índice 0). La
pasada inicial busca el elemento más pequeño de la lista y se intercambia con a[0], primer
elemento de la lista.
Después de terminar esta primera pasada, el frente de la lista está ordenado y el resto de
la lista a[1], a[2]...a[n-1] permanece desordenado. La siguiente pasada busca en esta lista
desordenada y selecciona el elemento más pequeño, que se almacena entonces en la posición
a[1]. De este modo, los elementos a[0] y a[1] están ordenados y la sublista a[2], a[3]...
a[n-1] desordenado; entonces, se selecciona el elemento más pequeño y se intercambia con
a[2]. El proceso continúa hasta realizar n-1 pasadas, en ese momento la lista desordenada se
reduce a un elemento (el mayor de la lista) y el array completo queda ordenado.
