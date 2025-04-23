import java.util.Scanner;
public class Listadoble {
    Scanner entra = new Scanner(System.in);
    String mensaje;
    Nodo comienzo;
    public Listadoble(){
        comienzo=null;
    }
    public void agregarDato(){ //agregar datos a la lista
	    System.out.println("ingrese un mensaje : ");
        mensaje = entra.next();
        Nodo NuevoNodo;
        NuevoNodo = new Nodo();
        NuevoNodo.setDato(mensaje);
        NuevoNodo.siguiente =comienzo;
        if (comienzo != null)
           comienzo.anterior = NuevoNodo;
        comienzo = NuevoNodo;
    }//fin metodo agregarDato
    public void VisualizarDatos(){
        Nodo Nodo;
        for(Nodo = comienzo;Nodo != null;Nodo = Nodo.siguiente)
           System.out.print(" " + Nodo.getDato() +" ");
        }//fin metodo #3 visualizar
   

    
}
