
###                                                    ALGORITMO DE KERNIGHAN

El algoritmo de Brian Kernighan para mejorar el rendimiento del algoritmo ingenuo anterior. La idea es considerar sólo los bits de conjunto de un número entero apagando su bit de conjunto más a la derecha (después de contarlo), de modo que la siguiente iteración del bucle considere el siguiente bit más a la derecha.
 
#####                                                       IMPLEMENTACION   

La expresión n & (n-1) se puede utilizar para desactivar el bit de conjunto más a la derecha de un número n. Esto funciona como la expresión n-1 voltea todos los bits después del bit de conjunto más a la derecha de n, incluyendo el propio bit de conjunto más a la derecha. Por lo tanto, n & (n-1) da como resultado el último bit volteado de n.

######                                                 CODIFICACIÓN DEL METODO 
                                         public static int countSetBits(int n) {
                                                 int count = 0;
                                                 while (n != 0) {
                                                       count += (n & 1); // chequear hasta el ultimo bit
                                         w              //log On
                                                       n >>= 1;
                                                }//fin while
                                           }//fin metodo contar bits `    
  
                                                    

