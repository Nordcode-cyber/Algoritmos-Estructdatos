
public class Nodo {
    /*Clase Nodo
     * 
     */
     String dato;
    Nodo siguiente;
    Nodo anterior;
    public Nodo(){

    }
    public Nodo(String dato){
        this.dato=dato;
        anterior = siguiente= null;
        
    }
    public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
        throw new UnsupportedOperationException("Unimplemented method 'setDato'");
	}
}
