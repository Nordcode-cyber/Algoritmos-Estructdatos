import java.util.Stack;
import java.lang.Math; //importa la libreria de matematicas
import java.util.Scanner; //importa la libreria de Scanner
public class Cilindro {
    /*
	 * Author Nordevelop
         * 
	 */
	private Stack<Float> Pila_Cilindro = null;
	private float radio; 
	private float altura; 
	public Cilindro (float radio, float altura ){ //metodo constructor con argumentos
        //   Stack<Integer> Pila_cuadrada = new Stack<Integer>();
	   Stack<Float>Pila_Cilindro = new Stack<Float>();
	   this.radio= radio;
	   this.altura=altura;
	}
	public float Dar_Area_Cilindro(){ //metodo area del Cilindro
	   return (float) (2*Math.PI*(radio + altura)); //devuelve 2π*(radio+altura)
	}
	public float Dar_Volumen_Cilindro(){ //Metodo Volumen del Cilindro
	    return (float) (Math.PI*Math.pow(this.radio, 2)*altura); //devuelve π * r**2
	}
    
}
