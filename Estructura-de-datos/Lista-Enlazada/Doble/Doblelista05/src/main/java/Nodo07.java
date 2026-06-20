//import main.java.Nodo;

public class Nodo07 {
    /*propiedades de la clase
	 * author Nordevelop
	 */
	private String nombre;
	private String apellido;
	private int legajo=0;
    Nodo07 siguiente;
    Nodo07 anterior;
    public Nodo07() { // metodo #1 Constructor
    String nombre;
   String apellido;
   int legajo;
    anterior = siguiente = null;
    }
	/*
	*Metodos Getters & Setters
	*/
    public int getlegajo() {
    	return legajo;
    }
    public int setlegajo(int legajo) {
    	return this.legajo= legajo;
    }
    
	public String getnombre() {
		return nombre;
	}
	public String setnombre(String nombre) {
		return this.nombre = nombre;
	}
	public String getapellido() {
    	return apellido;
    }
	public String setapellido(String apellido) {
		return this.apellido= apellido;
	}

   
    
}
