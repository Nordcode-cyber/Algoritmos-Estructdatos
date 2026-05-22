public class Mergesort {
    public static void main(String[] args) {
        /* Author Nordevelop 
		* Algoritmo de ordenamiento Mergesort
		* Con Recursividad
		*/
		int maxSize = 10000; 
		Darray arr; 
		
		arr = new Darray(maxSize); // creacion del vector
		for(int j=0; j<maxSize; j++) { 
			long n = (int)(java.lang.Math.random()*99);//generar pseudoaleatoriamente numeros enteros
			arr.agregar(n);
			arr.mostrar();
			arr.mergeSort();
			arr.mostrar();
			try {
				// Simulación de un algoritmo (ej: una tarea que tarda un tiempo)
	            for (int i = 0; i < 10000; i++) {
	                // Algoritmo de ejemplo: suma simple
	                int suma = i + i;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


		//System.out.println("Array Desordenado: ");
		//arr.mostrar(); // mostrar el vector
		arr.mergeSort(); //vector arr[] ordenado con el algoritmo de Mergesort
		System.out.println("Array Ordenado con el metodo Merge-sort: ");
		arr.mostrar(); // mostrar el vector ordenado
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
}
