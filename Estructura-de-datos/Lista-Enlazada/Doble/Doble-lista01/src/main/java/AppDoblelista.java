public class AppDoblelista {
    public static void main(String[] args) {
        System.out.println( "FRASE DE NIKLAUS WIRTH ");
        Listadoble objetoLista = new Listadoble();
        System.out.println("Ingrese 16 mensajes a mostrar: ");
        for (int i=0;i<17;i++)
            objetoLista.agregarDato();
        objetoLista.VisualizarDatos();    
       
}
        
    }
    

