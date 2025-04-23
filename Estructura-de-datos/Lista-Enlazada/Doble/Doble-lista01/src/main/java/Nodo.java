public class Nodo {
    /*Clase Nodo
     * 
     */
    private String dato;
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
	}
}
