public class Knapsack {
     /*
     * Algoritmo de Knapsack
     * author Nordevelop
     * Valores almacenados en el Vector v[]
     * Pesos almacenado Vector w[]
     * Total numero de distintos elementos n de Vector v[]
     */

     public static int knapsack(int[] v, int[] w, int n, int W) {
        // caso base: capacidad Negativa
        if (W < 0) {
            return Integer.MIN_VALUE;
        }
        // caso base: no hay elementos o la capacidad es 0
        if (n < 0 || W == 0) {
            return 0;
        }
        /*
         * Caso 1. Incluir la posición actual del vector v[n] en la mochila y
         * recurrir a las posiciones restantes v[n-1] con capacidad reducida W-w[n].
         */
        int include = v[n] + knapsack(v, w, n - 1, W - w[n]);
        /*
         * Caso 2. Excluir el elemento actual v[n] de la mochila
         * y recurrir a los elementos restantes v[n]
         */

        int exclude = knapsack(v, w, n - 1, W);

        // dewvolver maximo valor return maximum valor
        // cuando obtenemos al incluir o excluir el elemento actual
        return Integer.max(include, exclude);
    }

    //fin metodo Knapsack 
  public static void main(String[] args) {
    // entrada: un conjunto de elementos, cada uno con un peso y un valor
        int[] v = { 20, 5, 10, 40, 15, 25 };
        int[] w = { 1, 2, 3, 8, 7, 4 };

        // knapsack capacidad
        int W = 10;

        System.out.println("Resultado de Algoritmo Knapsack: " + knapsack(v, w, v.length - 1, W));
    
  }
    
}
