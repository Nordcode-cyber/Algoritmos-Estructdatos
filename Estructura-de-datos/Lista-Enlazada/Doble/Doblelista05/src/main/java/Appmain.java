import java.util.Scanner;

public class Appmain {
    public static void main(String[] args) {
         Scanner entra=new Scanner(System.in);
		Lista2 objetoLista = new Lista2();
		 System.out.println( "Nombre, Apellido y legajo de los Alumnos ");
		 System.out.println("Ingrese listado de  alumnos a Inscripción de Final ");
	         for (int i=0;i<3;i++)
	             objetoLista.agregarDato();
	         System.out.print("Listado de alumnos: ");
	         objetoLista.VisualizarDatos(); 
		 //objetoLista.EliminarDato();
		// System.out.print("Listado de alumnos: ");
    }
}
