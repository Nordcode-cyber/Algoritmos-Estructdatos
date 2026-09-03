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

###                               Métodos Recursivos

Un método recursivo es un método que se invoca a sí mismo de forma directa o indirecta. En
recursión directa, el código del método ${f()}$ contiene una sentencia que invoca a ${f}$, mientras
que en recursión indirecta, el método ${f()}$ invoca a un método ${g()}$ que a su vez invoca al método
${p()}$, y así sucesivamente hasta que se invoca de nuevo al método ${f()}$.
Un requisito para que un algoritmo recursivo sea correcto es que no genere una secuencia
infinita de llamadas sobre sí mismo. Cualquier algoritmo que genere una secuencia de este tipo
no puede terminar nunca. En consecuencia la definición recursiva debe incluir una condición de
salida, que se denomina componente base, en el que ${f(n)}$ se defina directamente (es decir, no
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
cerca de la condición ${n == 1}$.

###                         ALGORITMOS DIVIDE Y VENCERÁS

Una de las técnicas más importantes para la resolución de muchos problemas de computadora
es la denominada ${divide}$ ${y}$ ${vencerás}$. El diseño de ${algoritmo}$ basados en esta técnica
consiste en transformar ${(dividir)}$ un problema de tamaño  ${n}$ en problemas más pequeños,
de tamaño menor que  ${n}$ , pero similares al problema original, de modo que resolviendo los
subproblemas y combinando las soluciones se pueda construir fácilmente una solución del
problema completo ${vencerás}$
Normalmente, el proceso de división de un problema en otros de tamaño menor va a dar lugar
a que se llegue al caso base, cuya solución es inmediata. A partir de la obtención de la solución
del problema para el caso base, se combinan soluciones que amplían el tamaño del problema
resuelto, hasta que el problema original queda también resuelto.
Por ejemplo, se plantea el problema de dibujar un segmento que está conectado por los puntos
en el plano (x1,y1) y (x2,y2). El problema puede descomponerse así: determinar el punto
medio del segmento, dibujar dicho punto y dibujar los dos segmentos mitad obtenidos al dividir
el segmento original por el punto mitad. El tamaño del problema se ha reducido a la mitad, el
hecho de dibujar un segmento se ha transformado en dibujar dos segmentos con un tamaño de
justamente la mitad. 
Sobre cada segmento mitad se vuelve aplicar el mismo procedimiento, de tal forma que llega un momento en que, 
a base de dividir el segmento, se alcanza uno de longitud cercana a cero, se ha llegado al caso base, 
y se dibuja un punto. Cada tarea realiza las mismas
acciones, por lo que se puede plantear con llamadas recursivas al proceso de dibujar el segmento
cada vez con un tamaño menor, exactamente la mitad.
Un  `algoritmo divide y vencerás`  se define de manera recursiva, de tal modo que se llama a sí
mismo sobre un conjunto menor de elementos. Normalmente, se implementan con dos llamadas
recursivas, cada una con un tamaño menor, se alcanza el caso base, cuando el problema se resuelve directamente.

###                            Norma

Un algoritmo divide y vencerás consta de dos partes. La primera, divide recursivamente, el problema original, 
en subproblemas cada vez mas pequeños. La segunda, soluciona (vencerás) el problema dando respuesta a los subproblemas. 
Desde el caso base se empieza a combinar soluciones de subproblemas hasta que queda resuelto el problema completo.
