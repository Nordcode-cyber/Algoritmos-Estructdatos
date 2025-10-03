##                                                ALGORITMO RADIX SORT 

Analizaremos el ordenamiento por radix en términos de aritmética normal en base 10, que es más fácil de visualizar. 
Sin embargo, una implementación eficiente del ordenamiento por radix utilizaría aritmética en base 2 para 
aprovechar la velocidad del ordenador en la manipulación de bits. Analizaremos el ordenamiento por radix en lugar ,
del ordenamiento por intercambio de radix, que es similar pero algo más complejo. La palabra radix significa la base de un 
sistema numérico. Diez es la base del sistema decimal y 2 es la base del sistema binario. 
El ordenamiento consiste en examinar cada dígito de la clave por separado, comenzando por el dígito 1 (el menos 
significativo).
1. Todos los elementos de datos se dividen en 10 grupos, según el valor de su dígito 1.
2. A continuación, estos 10 grupos se vuelven a agrupar: todas las claves que terminan en 0 van primero, seguidas de todas las 
claves que terminan en 1, y así sucesivamente hasta el 9. A estos pasos los llamaremos subclasificación.
3. En la segunda subclasificación, todos los datos se dividen de nuevo en 10 grupos, pero esta vez según el 
valor de su dígito 10. Esto debe hacerse sin cambiar el orden de la clasificación anterior. Es decir,
 dentro de cada uno de los 10 grupos, el orden de los elementos sigue siendo el mismo que después del paso 
2; las subclasificaciones deben ser estables.
4. De nuevo, se vuelven a combinar los 10 grupos, primero los que tienen un dígito de las decenas 0, luego los que 
tienen un dígito de las decenas 1, y así sucesivamente hasta el 9.
5. Este proceso se repite para los dígitos restantes. Si algunas claves tienen menos dígitos que otras, 
sus dígitos de orden superior se consideran 0.
421 240 035 532 305 430 124 // array desordenado
(240 430) (421) (532) (124) (035 305) // ordenado en 1s digito
(305) (421 124) (430 532 035) (240) // sorted on 10s digito
(035) (124) (240) (305) (421 430) (532) // sorted on 100s digito
035 124 240 305 421 430 532 //  array ordenado
####                                             A TENER EN CUENTA
Los paréntesis delimitan los grupos. Dentro de cada grupo, los dígitos en la posición adecuada
son los mismos. Para convencerse de que este enfoque realmente funciona, pruébelo
en un papel con algunos números que invente.
Diseño de un programa, en la práctica, los datos originales probablemente comienzan en una matriz ordinaria. ¿Dónde deben
ir los 10 grupos? Hay un problema con el uso de otra matriz o una matriz de 10.
En la práctica, los datos originales probablemente comienzan en una matriz ordinaria. ¿Dónde deben
ir los 10 grupos? Hay un problema con el uso de otra matriz o una matriz de 10
 En la práctica, los datos originales probablemente comienzan en una matriz ordinaria. ¿Dónde deben
ir los 10 grupos? Hay un problema con el uso de otra matriz o una matriz de 10. Clasificación avanzada
matrices. No es probable que haya exactamente el mismo número de 0, 1, 2, etc. en
cada posición de dígito, por lo que es difícil saber qué tamaño deben tener las matrices. Una forma de
resolver este problema es utilizar 10 listas enlazadas en lugar de 10 matrices. Las listas enlazadas se expanden
y contraen según sea necesario. Utilizaremos este enfoque.
Un bucle externo examina cada dígito de las claves por turno. Hay dos bucles internos: el
primero toma los datos de la matriz y los coloca en las listas; el segundo los copia de
las listas de vuelta a la matriz. Es necesario utilizar el tipo adecuado de lista enlazada. Para mantener la
estabilidad de los subordenamientos, es necesario que los datos salgan de cada lista en el mismo orden en que entraron.
 ¿Qué tipo de lista enlazada facilita esto? Dejaremos los detalles de la codificación como
ejercicio.

