import java.util.Arrays;

public class Recurinsert {

    // Metodo de performance insercion sort en arr[]
	public static void insertionSort(int[] arr){
		// empezar desde el segundo elemento de arr[]
		// (el elemento indice arr[0] esta ordenado)
		for (int i = 1; i < arr.length; i++){  //|_|_|_|_|_|_|_|
			int value = arr[i];
			int j = i;
     	//encontrar con indice J ordenar subvector arr[0…i-1]
	    while (j > 0 && arr[j - 1] > value){      //<----------->
		 arr[j] = arr[j - 1];                //|_|_|_|_|_|_|_|
		  j--;
	}//fin while
      arr[j] = value;
		  }// fin for
	}//fin Metodo insertionSort(int[] arr)
    public static void main(String[] args) {
        int[] arr = { 3, 8, 5, 4, 1, 9,  };
        System.out.println("Array Desordenado");
        System.out.println(Arrays.toString(arr));
	insertionSort(arr);
        System.out.println("Array Ordenado Metodo Recursivo Insercion  "+Arrays.toString(arr));
        
    }
    
}
