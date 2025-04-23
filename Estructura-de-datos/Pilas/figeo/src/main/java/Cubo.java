import java.util.Stack;
import java.lang.Math; //importa la libreria de matematicas
public class Cubo {
    /*propiedades de la clase cubo() 
	 * encapsulados con acceso restringido 
	 * fuera de la clase Cubo
	 * author Nordevelop
	 */
	private double lado7;
	private Stack<Double>Pila_Cubo = null;
	public Cubo(double lado7){ //constructor con argumento
	   this.lado7=lado7;
	  Stack<Double> Pila_Cubo = new Stack<Double>();
	}
	/*
	 * Metodos
	 */
	public double Dar_Area_Cubo(){
		return (6*Math.pow(lado7, 2));
	}
	public double Dar_Volumen_Cubo(){
		return (Math.pow(lado7, 3));
	}
    
}
