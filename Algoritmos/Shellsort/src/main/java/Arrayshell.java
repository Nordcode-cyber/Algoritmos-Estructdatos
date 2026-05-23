import java.util.Random;

public class Arrayshell {
    public static void main(String[] args) {
        	/* Metodo de Ordenamiento Shell.
		 * 
		 * Author Nordeverlop
		 */
		int cont=10000; //cantidad de elementos del array
		int aux;
		int interno;
		int externo;
		int h=1;
	    //generacion del Array
		Random random = new Random();
		int[] arr = new int[10000];
        for(int i=0; i< arr.length;i++){
            arr[i] = random.nextInt(10000);
        }
		System.out.println("Array Desordenado  ");
		for(int i=0;i< cont;i++) {
		    System.out.print(arr[i]);
		    System.out.print(" ");
		}//en for(variable contador i)
		while(h <= cont/3)
			h = h*3 + 1;               // incrementar h
		while(h>0){
		   for(externo=h; externo<cont; externo++){
		       aux = arr[externo];
		       interno= externo;             
	      	       while(interno > h-1 && arr[interno-h] >= aux){
			 		  arr[interno] = arr[interno-h];
			  		  interno -= h;
		       } //end while (interno > h-1 && a[interno-h] >= aux)
			arr[interno] = aux;
		       } // end for (externo=h; externo<cont; externo++)
		   h = (h-1) / 3;      //  reducir h
	        } // fin while condicion (h>0)	
		System.out.println(" ");
		System.out.println("Array Ordenado Con el metodo de Shell Sort");
		for (int j=0;j<cont;j++) {
		    System.out.print(arr[j] +"");
		    System.out.print(" ");
		} //end for(variable contador j)
		  // Registrar el tiempo de fin en nanosegundos
        long tiempoFin = System.nanoTime();

        // --- FIN del algoritmo ---

        // Calcular la diferencia de tiempo transcurrido
        long tiempoInicio = 0;
		long tiempoTranscurridoNano = tiempoFin - tiempoInicio;

        // Convertir el tiempo de nanosegundos a milisegundos para mejor lectura (1 ms = 1,000,000 ns)
        double tiempoTranscurridoMillis = (double) tiempoTranscurridoNano / 1_000_000.0;

        // Imprimir el resultado
        System.out.println();
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoTranscurridoNano + " ns");
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoTranscurridoMillis + " ms");

	
        
    }
}
