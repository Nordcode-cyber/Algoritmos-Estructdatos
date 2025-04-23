import java.util.Stack;

public class Cuadrado {
    private int lado4;
	private Stack<Integer>Pila_cuadrada=null;
	public Cuadrado (int lado4) { //Constructor
		//(int lado4) argumento del constructor
	   Stack<Integer> Pila_cuadrada = new Stack<Integer>();
	   this.lado4=lado4; 
	}
	public int dar_Area_Cuadrado(){
		return (this.lado4*this.lado4);
	}
	public int dar_Perimetro_Cuadrado(){
		return(this.lado4*4);
	}
}
