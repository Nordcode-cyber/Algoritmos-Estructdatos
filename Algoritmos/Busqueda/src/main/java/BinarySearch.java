
//import java.util.Arrays;
public class BinarySearch {
    /*Metodo de busqueda binaria
     * Author Nordevelop
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Elemento encontrado
            } else if (arr[mid] < target) {
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; // Elemento no encontrado
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,8,10,12,17,23,33, 40 };
        int target = 17; // Elemento a buscar
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Elemento no encontrado en el array.");
        } else {
            System.out.println("Elemento encontrado en el índice: " + result);
        }
    }

}