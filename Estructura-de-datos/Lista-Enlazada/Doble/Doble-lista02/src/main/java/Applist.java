import java.util.Scanner;

public class Applist {
    public static void main(String[] args) {
		Scanner entra=new Scanner(System.in);
		/*Author Nordevelop
		* Clase donde se dezplaza la lista enlazada simple
		*/
		Listar objLista = new Listar();
		System.out.println("Ingrese 10 Nros enteros");
		for(int i=0;i<10;i++) {			
			objLista.Ingresedato();;
		}
		System.out.println("Lista Original:");
		objLista.VisualizarDatos();
        //si ingresamos 3 nros negativos, 3 veces llamar al metodo EliminarDato
        objLista.EliminarDato();
        objLista.EliminarDato();
        objLista.EliminarDato();
		System.out.println("\n Lista sin los Nros Negativos");
		objLista.VisualizarDatos();
		
    
    }
}
