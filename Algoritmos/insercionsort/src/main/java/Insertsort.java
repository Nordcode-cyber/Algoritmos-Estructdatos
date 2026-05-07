public class Insertsort {
    public static void main(String[] args) {
        /* Metodo de Ordenamiento de Inserccion.
		 * Author Nordeverlop
		 */
		int cont=22; 
		int a[]= {8,5,4,1,2,9,3,10,7,19,12,11,15,13,20,14,16,22,17,24,23,21}; //generacion del Array
		int entrada, salida;
		int aux;
		 int valor=0;
		 System.out.println("Array Desordenado ");
		for(int i=0;i< cont;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		} //end for
		for (salida=1; salida< cont; salida++) {
			aux=a[salida];
			entrada=salida;
			while (entrada >0 && a[entrada -1] >= aux) {
				a[entrada] = a[entrada-1];
				--entrada;
			} //end while
			a[entrada]=aux;
			} //end for
		System.out.println(" ");
		System.out.println("Array Ordenado Con el metodo de Inserccion ");
		for (int j=0;j<cont;j++) {
			System.out.print(a[j] +"");
			System.out.print(" ");
			
			
		}// end for
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
        System.out.println("Tiempo de ejecución metodo inserccion en nanosegundos: " + tiempoTranscurridoNano + " ns");
        System.out.println("Tiempo de ejecución metodo inserccion en milisegundos: " + tiempoTranscurridoMillis + " ms");
    }
}
