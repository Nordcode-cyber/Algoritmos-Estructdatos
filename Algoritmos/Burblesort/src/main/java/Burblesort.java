import java.util.Arrays;

public class Burblesort{
    public static void main(String[] args) {
        
    

    /*Metodo de ordenamiento Burbuja
		*Author Nordevelop
		*/
		int []a= {10,9,8,1,5,0,7,2,4,6,3};
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
		}
		System.out.println("Array ordenado");
		System.out.println(Arrays.toString(a));
    }
		
}