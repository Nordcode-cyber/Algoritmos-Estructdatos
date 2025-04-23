import java.util.Stack; // importar la libreria de pilas
import java.lang.Math; // importar la libreria de matematicas
public class Circulo {
    private double radio1;
	private Stack<Float>Pila_circulo=null;
	public Circulo(double radio1){ // metodo constructor 
	
		this.radio1= radio1;
		Stack<Float>Pila_Circulo = new Stack<Float>();
	}
    public double Dar_Perimetro_Circulo(){
    	return (double) Math.PI*2*radio1; // radio1 para no repetir el la propiedad de la clase cilindro
    }
    public double Dar_Superficie_Circulo(){ //DarSuperficie1 para no repetir el metodo del cuadrado
       	return (float) Math.PI*Math.pow(radio1, 2);
    }

    
}
