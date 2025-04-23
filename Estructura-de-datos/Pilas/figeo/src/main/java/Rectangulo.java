import java.util.Stack;

public class Rectangulo {
    private int lado5;//encapsulamiento de objetos
private int lado6;
private Stack<Integer>Pila_Rectangulo=null;  
public Rectangulo (int lado5, int lado6){
  this.lado5=lado5;//argumentos
  this.lado6=lado6;
Stack<Integer>Pila_Rectangulo = new Stack<Integer>();  
}
public int dar_Perimetro_Rectangulo(){ //Metodo para hallar el perimetro del cuadrado
  return (this.lado5*2+this.lado6*2); //l1 * 2 + l2 *2
}
public int dar_Superficie_Rectangulo(){
  return (this.lado5*this.lado6);
}
    
}
