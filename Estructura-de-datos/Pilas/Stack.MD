###                             Una pila (stack) 
Es una colección ordenada de elementos a los cuales sólo se puede acceder por un único lugar,
 o extremo de la pila. Los elementos se añaden o se quitan (borran) de la pila sólo por su parte superior (cima). 
 Este es el caso de una pila de platos, una pila de libros, etc. Cuándo se dice que la pila está ordenada, 
 lo que se quiere decir es que hay un elemento al que se puede acceder primero (el que está encima de la pila), 
 otro elemento al que se puede acceder en segundo lugar (justo el elemento que está debajo de la cima), un tercero, etc.
 No se requiere que las entradas se puedan comparar utilizando el operador “menor que” (<) y pueden ser de
cualquier tipo. Las pilas son estructuras ${LIFO}$ *(last in, first out)*
###                            Operaciones con pilas(stack)


| Crear Pila | Stack<Float> Pila_Cilindro=null | declaración de la pila                   |
| ---------- | ------------------------------- | ---------------------------------------- |
| Ingresar   | Pila_Cilindro.push()            | agregar elementos a la pila              |
| Quitar     | Pila_Cilindro.pop()             | sacar elementos de la pila               |
| comprobar  | Pila_Cilindro.isEmpty()         | Comprueba si la pila no tiene elementos  |
| tamaño     | Pila_Cilindro.size()            | devuelve cuantos elementos tiene la pila |


 
