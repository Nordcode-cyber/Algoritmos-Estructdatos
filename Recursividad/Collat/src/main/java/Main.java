// Conjetura de Collatz
import java.util.Scanner;
public class Main {
	public static int retorno(int numero) {
		if (numero % 2==0) {
		   return numero / 2;
	}
		return numero * 3 +1;
		
	} //fin metodo retorno

	public static void main(String[] args) {
		/*Conjetura de collatz
		 * Author Nordevelop
		 */
		Scanner entra=new Scanner(System.in);
		System.out.println("Test Conjetura de Collatz" );
		int n = 1;
		while (n >=1) {
			System.out.print( "Ingrese un numero entero positivo: ");
			 n = entra.nextInt();
			 if (n >= 1){
			    test(n);
			}	
		}//fin while(n >=1)
		System.out.println("saliendo....");
	
	}//fin main
	public static void test (int n) {
		int round =0, numero = n;
		System.out.println("ingreso = "+ n);
		while (numero > 1) {
			numero = retorno( numero );
			round ++;
			System.out.printf( "%4d: %d%n", round , numero );
			
		}//fin while (numero > 1)
		
		
	}//fin metodo test

}//fin clase Main

