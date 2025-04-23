import java.util.Stack;

public class Pitagoras {    
    /*author nordevelop
	 *propiedades de la clase con especificado de acceso Private
	 */
	private Stack <Double>Pila_Pitagoras = null;
	private double cateto1;
	private double cateto2;
	public Pitagoras( double cateto1, double cateto2) {//Constructor con argumentos
		Stack<Double>Pila_Pitagoras = new Stack<Double>();	
		this.cateto1=cateto1;
		this.cateto2=cateto2;
	}
	public double dar_hipotenusa() {
		return(double)Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	public double dar_areaTriangulo_rectangulo() {
		return(double)(cateto1 * cateto2)/2;
	}
  
}
