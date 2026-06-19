import java.util.Scanner;



public class Lista1 {
    Scanner entra=new Scanner(System.in);
	int n1;
	Nodo05 comienzo;
	
	public Lista1(){
		comienzo = null;
	}
	
	public void InsertarDato(){
		System.out.println("ingrese un numero entero : ");
		   n1=entra.nextInt();
		
		Nodo05 NuevoNodo;
		
		NuevoNodo = new Nodo05(n1);
		NuevoNodo.dato=n1;
		NuevoNodo.siguiente =comienzo;
		
		if (comienzo != null)
			comienzo.anterior = NuevoNodo;
		
		comienzo = NuevoNodo;
	}
	
	public void EliminarDato(){
		Nodo05 NodoActual;
		Nodo05 NodoAnterior;
		
		NodoActual = comienzo;
		NodoAnterior = null;
		
		while (NodoActual != null){
			if ((NodoActual.dato%3==0 || NodoActual.dato%4==0 || NodoActual.dato%5==0  || NodoActual.dato%7==0))
				break;
			NodoAnterior = NodoActual;
			NodoActual = NodoActual.siguiente;
		}
		
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
		}
		
	}
	
	public void VisualizarDatos()
	{
		Nodo05 Nodo;
		
		for(Nodo = comienzo;Nodo != null;Nodo = Nodo.siguiente)
			System.out.print(" " + Nodo.dato +" ");
	}
    
}
