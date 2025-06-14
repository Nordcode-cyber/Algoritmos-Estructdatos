public class Insertsort {
    public static void main(String[] args) {
        /* Metodo de Ordenamiento de Inserccion.
		 * Author Nordeverlop
		 */
		int cont=6; 
		int a[]= {8,3,5,1,4,2}; //generacion del Array
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
    }
}
