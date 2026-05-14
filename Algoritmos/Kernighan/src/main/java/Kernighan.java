public class Kernighan {

        /*Algoritmo de Brian Kernighan
   *Solución de  ingenio para contar el 
   * número total de bits establecidos en n()
   * Author Nordevelop
   */
    public static int countSetBits(int n){
        int count = 0;
        while (n != 0){
            count += (n & 1);    // chequear el ultimo bit
            n >>= 1;
        }//fin while
    return count;
    }//fin metodo countSetBits(int n)
   public static void main(String[] args) {
       int n = 15;
       System.out.println("el numero entero: " + n + " " + " : en binario es: " + Integer.toBinaryString(n));
    }
    }
    

