import java.util.Stack; //importamos la libreria stack para poder usarla en el programa
import java.lang.Math; //importamos la libreria de matematicas
public class Esfera {
    /*Author Nordevelop
	 * 
	 */
	private float radio2;
	private Stack <Float>Pila_Esfera=null;
	public Esfera(float radio2){ //clase constructor con argumentos
	   this.radio2=radio2;
	  Stack<Float> Pila_Esfera = new Stack<Float>();
	}
	public float Dar_Superficie_Esfera(){ //metodo
		return (float) (4*Math.PI*Math.pow(radio2, 2)); //superficie devuelve S= 4πr**2
	}
	public float Dar_Volumen_Esfera(){
		return (float)(4*Math.PI*Math.pow(radio2, 3))/3;  //volumen  devuelve V=(4πr**3) / 3
	}
    
}
