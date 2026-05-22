public class QuicksortApp {
    public static void main(String[] args) {
        long tiempoInicio = System.nanoTime();
        
		/* Algoritmo de ordenamiento 
		 *  Metodo de QuickSort (Ordenacion rapida) 
		 *  Con Recursividad para la particion.
		 * Author Nordevelop
		 */
		int maxSize = 10000; // array size
		Qarray arr;
		arr = new Qarray(maxSize); // create array
		for(int j=0; j<maxSize; j++) { 
			long n = (int)(java.lang.Math.random()*99);//generar pseudoaleatoriamente numeros enteros
			arr.agregar(n);
			//arr.mostrar();
			arr.quickSort();
			arr.mostrar();
             try {
            // Simulación de un algoritmo (ej: una tarea que tarda un tiempo)
            for (int i = 0; i < 16; i++) {
                // Algoritmo de ejemplo: suma simple
                int suma = i + i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }//fin for(int j=0; j<maxSize; j++)
    // Registrar el tiempo de fin en nanosegundos
        long tiempoFin = System.nanoTime();

        // --- FIN del algoritmo ---

        // Calcular la diferencia de tiempo transcurrido
        long tiempoTranscurridoNano = tiempoFin - tiempoInicio;

        // Convertir el tiempo de nanosegundos a milisegundos para mejor lectura (1 ms = 1,000,000 ns)
        double tiempoTranscurridoMillis = (double) tiempoTranscurridoNano / 1_000_000.0;

        // Imprimir el resultado
        
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoTranscurridoNano + " ns");
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoTranscurridoMillis + " ms");
		}
    }
    

