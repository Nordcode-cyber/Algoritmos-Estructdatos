###                      Introducción a la Recursividad

La Recursividad, es aquella propiedad que posee un método, por lo cual puede llamarse a sí mismo. 
Aunque se puede utilizar la recursividad como una alternativa a la iteración, una
solución recursiva es, normalmente, menos eficiente en términos de tiempo de computadora que
una solución iterativa, debido a las operaciones auxiliares que llevan consigo las invocaciones
suplementarias a los métodos; sin embargo, en muchas circunstancias, el uso de la recursión
permite a los programadores especificar soluciones naturales, sencillas, que serían, en caso contrario,
difíciles de resolver. Por esta causa, la recursión es una herramienta poderosa e importante
en la resolución de problemas y en la programación. Diversas técnicas algorítmicas utilizan la
recursión, como los algoritmos divide y vence y los algoritmos de vuelta atrás.

###                               Metodos Recursivos

Un método recursivo es un método que se invoca a sí mismo de forma directa o indirecta. En
recursión directa, el código del método f() contiene una sentencia que invoca a f(), mientras
que en recursión indirecta, el método f() invoca a un método g() que a su vez invoca al método
p(), y así sucesivamente hasta que se invoca de nuevo al método f().
Un requisito para que un algoritmo recursivo sea correcto es que no genere una secuencia
infinita de llamadas sobre sí mismo. Cualquier algoritmo que genere una secuencia de este tipo
no puede terminar nunca. En consecuencia la definición recursiva debe incluir una condición de
salida, que se denomina componente base, en el que f(n) se defina directamente (es decir, no
recursivamente) para uno o más valores de n.
En definitiva, debe existir una “ forma de salir” de la secuencia de llamadas recursivas.

###                Condición de terminación de la recursión.

Cuando se implementa un método recursivo, es preciso considerar una condición de terminación
ya que, en caso contrario, continuaría indefinidamente llamándose a sí mismo y llegaría un
momento en que la pila que registra las llamadas se desbordaría. En consecuencia, en cualquier
método recursivo se necesita establecer la condición de parada de las llamadas recursivas y
evitar indefinidas llamadas. Por ejemplo, en el caso del método factorial() definido anteriormente,
la condición de parada ocurre cuando n es 1 o 0, ya que en ambos casos el factorial es
1. Es importante que cada llamada suponga un acercamiento a la condición de parada, porque en
el método factorial cada llamada supone un decrecimiento del entero n lo que supone estar más
cerca de la condición n == 1.
