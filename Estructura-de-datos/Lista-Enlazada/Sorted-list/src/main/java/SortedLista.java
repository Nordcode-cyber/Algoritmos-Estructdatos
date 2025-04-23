public class SortedLista {
	/* Author Nordevelop
	 *
	 */
	private Nodo primero; 
	public SortedLista(){ // constructor
	 primero = null;
	 }
	public boolean isEmpty(){   // Metodo Booleano 
	    return (primero==null); 
	 }//fin Metodo isEmpty
	
	public void agregar(long clave){
	   Nodo nuevonodo = new Nodo(clave); 
	   Nodo anterior = null; 
	   Nodo actual = primero; 
	while(actual != null && clave > actual.Data1){  
	anterior = actual;
	actual = actual.siguiente; // ir al siguiente elemento
	}
	//condicional con una sola instruccion sin {}	
	if(anterior==null) 
		primero = nuevonodo;
	else 
		anterior.siguiente = nuevonodo; 
	nuevonodo.siguiente = actual; 
	} // fin metodo agregar()
	
	public Nodo borrar(){ //retorna variable temporal(no siempre) y borra el primer puntero
	 // (contempla que la lista no esta vacia )
	Nodo temp = primero; // guardar primero
	primero = primero.siguiente; // borrar primero
	return temp; // return value
	} // fin metodo borrar
	
	public void mostrarLista(){
		System.out.print("Lista Ordenada (primero-->ultimo): ");
		Nodo actual = primero; 
		while(actual != null){ 
			actual.mostrarNodo(); //mostrarNdnodo metodo de la clase Nodo
			actual = actual.siguiente; 
	}
	System.out.println(" ");
	}// fin metodo mostrar lista
}