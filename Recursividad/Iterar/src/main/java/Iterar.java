public class Iterar {
    static void print1toN(int n) {
        if (n == 0)
            return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
         /* Recursividad Vs Iteracion
         *Author Nordevelop
         * algoritmo recursivo Vuelta Atras Vs Ciclo For
         */
        int n = 10;
        System.out.print("Recursividad: ");
        print1toN(n);
        System.out.println(" ");
        System.out.print("Iterador For: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
