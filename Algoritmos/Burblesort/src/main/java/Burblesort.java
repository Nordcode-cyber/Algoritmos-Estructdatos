import java.util.Arrays;
import java.util.Random;

public class Burblesort{
    public static void main(String[] args) {
    /*Metodo de ordenamiento Burbuja
		*Author Nordevelop
		*/
		//int []a= {10,9,8,1,5,11,0,7,14,2,4,6,3};
		int aux=0;
          Random random = new Random();
		int[] arr = new int[10000];
        for(int i=0; i< arr.length;i++){
            arr[i] = random.nextInt(10000);
        }
		System.out.println("Array sin ordenar ");
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length;i++) {
		    for (int j=0;j<arr.length-1;j++) {
		       if (arr[j]>arr[j+1]) {
			     aux =arr[j];
			     arr[j]=arr[j+1];
		   	     arr[j+1]=aux;
			 }

		    }
			 try {
            // Simulación de un algoritmo (ej: una tarea que tarda un tiempo)
            for (int k = 0; k < i; k++) {
                // Algoritmo de ejemplo: suma simple
                int suma = k + i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

       
    }//fin for(int j=0; j<maxSize; j++)
		
		System.out.println("Array ordenado");
		System.out.println(Arrays.toString(arr));
         // Registrar el tiempo de fin en nanosegundos
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