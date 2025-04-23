public class ListApp {
    public static void main(String[] args) {
        /*
         * 
         */
        Listasim lista= new Listasim();
		lista.ingreso_primero(13);
		lista.ingreso_primero(21);
		lista.ingreso_primero(34);
		lista.ingreso_ultimo(55);
		lista.ingreso_ultimo(89);
		lista.ingreso_ultimo(144);
        lista.mostrarListasim();
		lista.borrar_primero();
		lista.mostrarListasim();

       
    }
    
}
