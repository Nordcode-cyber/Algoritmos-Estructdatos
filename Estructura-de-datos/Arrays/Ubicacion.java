public class Ubicacion {
    public static void main(String[] args) {
         int []arr = new int []{0,1,2,3,4,5,6,7,8,9,10};
		     System.out.println(" los elementos del Array Completo. ");
		     for (int i=0; i<arr.length; i++ )
		        System.out.print(arr[i] + " ");
		     System.out.println(" ");    
		     System.out.println("Los elementos del Array en los subindices Par: "); //|x|_|x|
		     for(int j =0; j<arr.length; j=j+2)
		        System.out.print(arr[j] + " ");
		     System.out.println("Los elementos del Array en los subindices Impar: "+" ");  
		     for(int k=1; k<arr.length; k=k+2)
		        System.out.print(arr[k] + " ");
        
      }
    }
    

