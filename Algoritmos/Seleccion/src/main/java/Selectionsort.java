import java.util.Random;

public class Selectionsort {
    public static void main(String[] args) {
        /* Algoritmo de Ordenamiento por metodo Seleccion
    *  Author Nordevelop
    */
    int cont= 10000; 
    long aux;
    //int a[]= {51,21,39,80,36,6}; //generacion del Array
    int temp;
    int entrada, salida, minimo;
    Random random = new Random();
		int[] arr = new int[10000];
        for(int i=0; i< arr.length;i++){
            arr[i] = random.nextInt(10000);
        }	  
    System.out.println("Array Desordenado ");
    for(int i=0;i< cont;i++) {
	    System.out.print(arr[i]);
	    System.out.print(" ");
    } //end for (i)
    for(salida=0; salida<cont-1; salida++){ 
        minimo = salida; // minimo
        for(entrada=salida+1; entrada<cont; entrada++) { 
	    if(arr[entrada] < arr[minimo] )   // if minimo es mayor al nElemento de a[],
                 minimo = entrada;
	} //end for entrada
      /* Intercambiar el elemento con valor mínimo --> 
      * por la primera posición del array que todavia no está ordenado. 
      */
       temp = arr[minimo]; 
       arr[minimo] = arr[salida]; 
       arr[salida] = temp; 		 
       } // end for salida
       System.out.println(" ");
       System.out.println("Array Ordenado Con el metodo de Selección ");
       for (int j=0;j<cont;j++) {
            System.out.print(arr[j] +" ");
            System.out.print(" ");
            
       } //end for (j)
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
