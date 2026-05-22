import java.util.Random;
public class Mergerandom {
    // 1. Función principal que inicia la recursión
    public static void mergeSort(double[] arr) {
        if (arr == null || arr.length <= 1) {
            return; 
        }
        // Creamos un arreglo auxiliar una sola vez para optimizar memoria
        double[] temp = new double[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    // Sobrecarga interna: divide el arreglo usando los índices 'izq' y 'der'
    private static void mergeSort(double[] arr, double[] temp, int izq, int der) {
        if (izq < der) {
            int medio = izq + (der - izq) / 2; // Evita desbordamiento de enteros

            // Dividimos la mitad izquierda y la derecha
            mergeSort(arr, temp, izq, medio);
            mergeSort(arr, temp, medio + 1, der);

            // Mezclamos ambas mitades ya ordenadas
            merge(arr, temp, izq, medio, der);
        }
    }

    // Función auxiliar que mezcla las dos mitades en orden
    private static void merge(double[] arr, double[] temp, int izq, int medio, int der) {
        // Copiamos la sección que nos interesa al arreglo temporal
        for (int i = izq; i <= der; i++) {
            temp[i] = arr[i];
        }

        int i = izq;       // Índice para la mitad izquierda
        int j = medio + 1; // Índice para la mitad derecha
        int k = izq;       // Índice para escribir en el arreglo original

        // Comparamos elementos de ambas mitades y los reubicamos en 'arr'
        while (i <= medio && j <= der) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Si quedaron elementos en la mitad izquierda, los copiamos
        // (Los de la derecha no hace falta, ya están en su posición correcta al final)
        while (i <= medio) {
            arr[k] = arr[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int N = 10000;
        double[] datos = new double[N];
        Random random = new Random();

        // Llenamos el arreglo con números aleatorios entre 0.0 y 1.0 (equivalente a Math.random)
        for (int i = 0; i < N; i++) {
            datos[i] = random.nextDouble();
        }

        System.out.println("Arreglo original creado con " + N + " elementos.");
        System.out.print("Primeros 10 elementos antes de ordenar: ");
        imprimirPrimerosElementos(datos, 10);

        // 3. Medimos el tiempo de ejecución en nanosegundos
        long startTime = System.nanoTime();
        mergeSort(datos);
        long endTime = System.nanoTime();

        // Convertimos a milisegundos para que sea más legible
        double durationMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("\n--- ¡Ordenamiento Completo! ---");
        System.out.printf("Tiempo de ejecución: %.3f ms\n", durationMs);
        System.out.print("Primeros 10000 elementos después de ordenar: ");
        imprimirPrimerosElementos(datos, 10);
    }

    // Método simple para mostrar los primeros N elementos en consola
    private static void imprimirPrimerosElementos(double[] arr, int cantidad) {
        System.out.print("[");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%.5f", arr[i]);
            if (i < cantidad - 1) System.out.print(", ");
        }
        System.out.println("...]");
    }
}
