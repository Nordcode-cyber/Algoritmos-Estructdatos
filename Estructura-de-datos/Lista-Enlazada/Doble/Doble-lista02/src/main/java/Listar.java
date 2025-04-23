import java.util.Scanner;
import main.java.*;

public class Listar {
    Scanner entra=new Scanner(System.in);
	int n1;
	/*Author Nordevelop
	* Clase donde se dezplaza la lista enlazada
	*/
	Nodo01 comienzo;
	public Listar() { //constructor
		comienzo =null;
	}
	public void Ingresedato(){
        System.out.println("ingrese un numero entero : ");
	    n1 = entra.nextInt();
	Nodo01 NuevoNodo;
	NuevoNodo = new Nodo01();
	NuevoNodo.dato=n1;
	NuevoNodo.siguiente =comienzo;
	if (comienzo != null)
	   comienzo.anterior = NuevoNodo;
	comienzo = NuevoNodo;
	}
    public void EliminarDato(){
        Nodo01 NodoActual;
		Nodo01 NodoAnterior;
		NodoActual = comienzo;
		NodoAnterior = null;
		while (NodoActual != null){
		    if ((NodoActual.dato <0))
		        break;
		    NodoAnterior = NodoActual;
		    NodoActual = NodoActual.siguiente;
		}//fin while
		if (NodoActual != null ){
		   if (comienzo == NodoActual){
			comienzo = NodoActual.siguiente;
			NodoActual.siguiente = null;
	   }
	   else if(NodoActual.siguiente == null){
	    	 NodoAnterior.siguiente = null;
	   }
	  else{
		   NodoAnterior.siguiente = NodoActual.siguiente;
		   NodoAnterior.siguiente.anterior = NodoActual.anterior;
	 }
	     }//fin if
		
	}//fin metodo Eliminar
    public void VisualizarDatos(){
        Nodo01 Nodo;
        for(Nodo = comienzo;Nodo != null;Nodo = Nodo.siguiente)
           System.out.print(" " + Nodo.dato +" ");
        }//fin metodo visualizar
   



    
    }

    

