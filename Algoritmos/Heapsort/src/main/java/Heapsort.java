import java.util.Arrays;
import java.util.Random;
import java.util.random.*;

public class Heapsort {
    /* heapsort Sorting x monticulo
	 * Author Nordevelop
	 */
	// declaracion Hijo izquierdo del Arbol Binario 
    private static int HijoIzqdo(int i) {
        return (2*i + 1);
    }
 // declaracion Hijo derecho del Arbol Binario
    private static int HijoDrcho(int i) {
        return (2*i + 2);
    }
    // Metodo para intercambiar  subíndices del Array arr[]
    private static void intercambio(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }//fin metodo intercambio
    private static void apilar(int[] arr, int i, int tamaño) {
        // Obtener los hijos izquierdo y derecho del nodo() en el índice arr[i]
        int izda = HijoIzqdo(i);
        int drcha = HijoDrcho(i);
 
        int mayor = i;
        if (izda < tamaño && arr[izda] > arr[i]) {
           mayor = izda;
        }
        if (drcha < tamaño && arr[drcha] > arr[mayor]) {
            mayor = drcha;
        }
 
        if (mayor != i){ //mayor != i variable contador
            intercambio(arr, i, mayor);
            apilar(arr, mayor, tamaño);
        }//fin if
    }//fin metodo apilar
        // metodo para eliminar un elemento con la mayor prioridad (presente en la raíz del Arbol)
        public static int sacar(int[] arr, int tamaño){
            // si el monticulo no tiene Elementos
            if (tamaño <= 0) 
                return -1;
             int tope = arr[0];
     	    // sustituir la raíz del montón por el último elemento del Array
             arr[0] = arr[tamaño-1];
            apilar(arr, 0, tamaño - 1);
            return tope;
        }//fin metodo sacar
     
        //Metodo Heapsort ordenamiento de Montículo N() sobre arr[]
        public static void heapsort(int[] arr){
	     // O(n log n) coste del algoritmo	
            // implementar el Array como  cola de prioridad
            int n = arr.length;
            int i = (n - 2) / 2;
            while (i >= 0) {
                apilar(arr, i--, n);
            }
            while (n > 0){
                arr[n - 1] = sacar(arr, n);
                n--;
            }//fin while (n > 0)
        }// fin metodo Heapsort
     
        //Algoritmo de implementación en Java
    public static void main(String[] args) {
        /*Metodo de ordenamiento Heapsort (Monticulo)
		 * Implementacion de Arbol Binario
		 * Author Nordevelop
		 */
        Random random = new Random();
		int[] arr = new int[100000];
        for(int i=0; i< arr.length;i++){
            arr[i] = random.nextInt(100000);
        }
        
		System.out.println("Array original"+Arrays.toString(arr));
		//sacar(arr, 5);
		//System.out.println("se elimino un elemento del Array arr: ");
		//System.out.println("Array "+Arrays.toString(arr));

	        heapsort(arr); 
             // Registrar el tiempo de fin en nanosegundos
      
                System.out.println("Array Ordenado con el metodo Heapsort");
		System.out.println(Arrays.toString(arr)); // mostrar el array ordenado\
          long tiempoFin = System.nanoTime();

        // --- FIN del algoritmo ---

        // Calcular la diferencia de tiempo transcurrido
        long tiempoInicio = 0;
		long tiempoTranscurridoNano = tiempoFin - tiempoInicio;

        // Convertir el tiempo de nanosegundos a milisegundos para mejor lectura (1 ms = 1,000,000 ns)
        double tiempoTranscurridoMillis = (double) tiempoTranscurridoNano / 1_000_000.0;

        // Imprimir el resultado
        
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoTranscurridoNano + " ns");
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoTranscurridoMillis + " ms");


        
    }
}
