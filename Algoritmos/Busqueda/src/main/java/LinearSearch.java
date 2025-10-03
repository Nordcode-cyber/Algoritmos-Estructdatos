import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
		/*********************************
		 * algoritmo Busqueda lineal    *
		 * Author Nordevelop             *
		 *                               *
		 * objetivo==elemento del array  *
		 * a buscar la posicion del      *
		 * elemento objetivo             *
		 * ******** **********************/
		 int[] arr = {32,13,2,7, 22,12, 15, 11, 46, 19, 45};
	        int objetivo = 15;
	        System.out.println("El Array completo"+Arrays.toString(arr));
	        System.out.print("Elemento del Array a buscar:  "+objetivo+" "+" :"+"fue encontrado en la posicion: ");
	        System.out.println(buscar(arr, objetivo));
	}
		 static int buscar(int[] arr, int objetivo) {	 //metodo de busqueda
	        for (int i = 0; i < arr.length; i++) {  //recorrer  dentro del Array |_|_||_||_||_||_|_|(nums)con un ciclo for
	            if (arr[i] == objetivo) {
	                return i;
	            }
	        } //fin ciclo for
	        return -1;
		

	}//fin metodo search()

	
    
}
