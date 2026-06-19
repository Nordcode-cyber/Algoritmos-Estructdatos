public class MainApp {
    public static void main(String[] args) {
        /*Author Nordevelop
		*saldran de la lista enlazada los datos
		 *  que cumplan la  condicion de ser dvivisores 
		 *  de 3, 4, 5, 7
		 * 
		 */
		Lista1 objLista= new Lista1();
		System.out.println("ingrese 10 Nros enteros");
		for(int i=0;i<10;i++) {			
			objLista.InsertarDato();
		}
		System.out.println("Lista Original:");
		objLista.VisualizarDatos();
		System.out.println("\nLista Sin los elementos que son multiplos de 3, 4 ,5 y 7:");
		for(int i=0;i<10;i++){
			objLista.EliminarDato();
		}
		objLista.VisualizarDatos();
        
    }
}
