import java.util.Arrays;

public class Burblesort{
    public static void main(String[] args) {
        
    

    /*Metodo de ordenamiento Burbuja
		*Author Nordevelop
		*/
		int []a= {10,9,8,1,5,11,0,7,14,2,4,6,3};
		int aux=0;
		System.out.println("Array sin ordenar ");
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++) {
		    for (int j=0;j<a.length-1;j++) {
		       if (a[j]>a[j+1]) {
			     aux =a[j];
			     a[j]=a[j+1];
		   	     a[j+1]=aux;
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
    }//fin for(int j=0; j<maxSize; j++)
		
		System.out.println("Array ordenado");
		System.out.println(Arrays.toString(a));
    }
		
}