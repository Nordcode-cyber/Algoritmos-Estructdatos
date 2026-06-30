###                         ALGORITMOS DIVIDE Y VENCERÁS

Una de las técnicas más importantes para la resolución de muchos problemas de computadora
es la denominada `divide y vencerás`. El diseño de algoritmos basados en esta técnica
consiste en transformar `(dividir)`  un problema de tamaño  ` n ` en problemas más pequeños,
de tamaño menor que  ` n` , pero similares al problema original, de modo que resolviendo los
subproblemas y combinando las soluciones se pueda construir fácilmente una solución del
problema completo ( `vencerás` ).
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