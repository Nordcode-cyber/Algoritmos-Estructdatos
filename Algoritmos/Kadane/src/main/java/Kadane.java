package main.java;
import java.util.Arrays;
import java.math.*;
public class Kadane {
      /**
     * Algoritmo para encontrar la subindice contigua con la mayor suma
     * /* en un conjunto dado de enteros
     * Author Nordevelop
     * 
     * @param args
     * 
     */
    public static int kadane(int[] A) {
        // almacena la suma del subindice máxima encontrado hasta el momento
       int max_so_far = 0;
       // almacena la suma máxima del subarray que termina en la posición actual
       int max_ending_here = 0;
       for (int value : A) { // recorre el array con un for each
           // actualiza la suma máxima de la submatriz "que termina" en el índice i[]
           // (añadiendo el
           // elemento actual a la suma máxima que termina en el índice anterior i[-1])
           max_ending_here = max_ending_here + value;
           // si la suma máxima es negativa,
           // ponerla a 0 (que representa una submatriz vacía)
           max_ending_here = Integer.max(max_ending_here, 0);

           // ctualizar el resultado si la suma actual de la submatriz es mayor
           max_so_far = Integer.max(max_so_far, max_ending_here);
       } // fin for each

       return max_so_far;
   }// fin metodo Kadane
   
   /*  metodo runCircularKadane para encontrar 
    * la suma máxima circular de una subarray en un array dado
   */
   public static int runCircularKadane(int[] A) {
       if (A.length == 0) {
           return 0;
       }

       // encontrar el maximo elemento presente en el vector[]
       int max = Arrays.stream(A).max().getAsInt();
       // si el vector contiene todos los valores negativos devolver el maximo elemento
       if (max < 0) {
           return max;
       }
       // negativo todos los elementos del Vector []
       Arrays.setAll(A, i -> -A[i]);
       // correr Kadane’s algoritmo en el vector [] modificado
       int neg_max_sum = kadane(A);
       Arrays.setAll(A, i -> -A[i]);

       /*
        * Devuelve el máximo de lo siguiente:
        * 1. Suma devuelta por el algoritmo de Kadane sobre el array original.
        * 2. Suma devuelta por el algoritmo de Kadane en el array modificado +
        * la suma de todos los elementos del array.
        */

       return Integer.max(kadane(A), Arrays.stream(A).sum() + neg_max_sum);
   }// fin runCircularKadane

   public static void main(String[] args) {
       int[] A = { 2, 1, -5, 4, -3, 1, -3, 4, -2, -1, 6 }; // vector

       System.out.println("La suma de los elementos con la mayor suma es:  " + runCircularKadane(A));

   }

    
}
