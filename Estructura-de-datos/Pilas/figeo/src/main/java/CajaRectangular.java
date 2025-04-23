import java.util.Stack;

public class CajaRectangular {
    private Stack<Integer>Pila_CajaRectangular=null;
	//Pila c
	private int largo;  
	private int ancho;
	private int alto;   
	
public CajaRectangular (int largo, int ancho, int alto) { 
	/* metodo constructor 
	 * con declaracion de parametros  
	 *
	 */
	Stack<Integer>Pila_CajaRectangular = new Stack<Integer>();
	this.largo=largo;
	this.ancho=ancho;
	this.alto=alto;
	}
public int Dar_Area_CajaRectangular(){
   return (2*this.alto*this.largo+2*this.alto*this.ancho+2*this.largo*this.ancho);
      }
public int Dar_Volumen_CajaRectangular(){
   return (this.largo*this.ancho*this.alto);  //
      }
    
}
