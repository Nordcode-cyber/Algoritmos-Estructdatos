public class Digito {       
    public static void main(String[] args) {
        /*Digitos
         * Author Nordevelop
         */
        System.out.println("Test Digitos" );
        long n =965532;
        System.out.println("El numero es: " + n);
        System.out.println("La suma de los digitos es: " + sumaDigitos(n));
    } //fin main

    public static long sumaDigitos(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumaDigitos(n / 10);
        }
    } //fin metodo sumaDigitos
    
}   //fin clase Digito
