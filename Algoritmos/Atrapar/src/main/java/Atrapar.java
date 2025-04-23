package main.java;

public class Atrapar {
     // Función para encontrar la cantidad de agua que puede quedar atrapada dentro
    // un conjunto dado de barras en tiempo lineal y espacio adicional
    public static int trap(int[] bars)    {
        int n = bars.length;
         // caso base
        if (n <= 2) 
            return 0;
        int water = 0;
 
        //left[i] almacena la altura máxima de una barra a la izquierda
        // de la barra actual
        int[] left = new int[n-1];
        left[0] = Integer.MIN_VALUE;
 
        // procesar barras de izquierda a derecha
        for (int i = 1; i < n - 1; i++) 
            left[i] = Integer.max(left[i - 1], bars[i - 1]);
        /*
         * int[] right = new int[n];
         * right[n - 1] = Integer.MIN_VALUE;
         * for (int i = n - 2; i >= 0; i--) {
         *    right[i] = Integer.max(right[i + 1], bars[i + 1]);
         * }
         *
         * for (int i = 1; i < n - 1; i++) 
         *   if (Integer.min(left[i], right[i]) > bars[i]) 
         *       water += Integer.min(left[i], right[i]) - bars[i];
         */
 
        // right almacena la altura máxima de una barra a la derecha
        // de la barra actual
        int right = Integer.MIN_VALUE;
 
        // procesar barras de derecha a izquierda
        for (int i = n - 2; i >= 1; i--) {
            right = Integer.max(right, bars[i + 1]);
        // comprobar si es posible almacenar agua en la barra actual
            if (Integer.min(left[i], right) > bars[i]) {
                water += Integer.min(left[i], right) - bars[i];
            }
        }//fin  for (int i = n - 2; i >= 1; i--)
 
        return water;
    }// fin metodo trap(int[] bars)
  public static void main(String[] args) {
     int[] heights = { 7, 0, 4, 2, 5, 11, 6, 4, 8, 5 };
 
        System.out.print("La cantidad máxima de agua que se puede atrapar es " +
                                trap(heights));
    }
    
    
}
