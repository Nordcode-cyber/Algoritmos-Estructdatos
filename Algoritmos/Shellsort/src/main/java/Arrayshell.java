public class Arrayshell {
    public static void main(String[] args) {
        	/* Metodo de Ordenamiento Shell.
		 * 
		 * Author Nordeverlop
		 */
		int cont=8; //cantidad de elementos del array
		int aux;
		int interno;
		int externo;
		int h=1;
		int a[]= {7,8,3,1,2,4,5,6}; //generacion del Array
		System.out.println("Array Desordenado  ");
		for(int i=0;i< cont;i++) {
		    System.out.print(a[i]);
		    System.out.print(" ");
		}//en for(variable contador i)
		while(h <= cont/3)
			h = h*3 + 1;               // incrementar h
		while(h>0){
		   for(externo=h; externo<cont; externo++){
		       aux = a[externo];
		       interno= externo;             
	      	       while(interno > h-1 && a[interno-h] >= aux){
			 		  a[interno] = a[interno-h];
			  		  interno -= h;
		       } //end while (interno > h-1 && a[interno-h] >= aux)
			a[interno] = aux;
		       } // end for (externo=h; externo<cont; externo++)
		   h = (h-1) / 3;      //  reducir h
	        } // fin while condicion (h>0)	
		System.out.println(" ");
		System.out.println("Array Ordenado Con el metodo de Shell Sort");
		for (int j=0;j<cont;j++) {
		    System.out.print(a[j] +"");
		    System.out.print(" ");
		} //end for(variable contador j)
        
    }
}
