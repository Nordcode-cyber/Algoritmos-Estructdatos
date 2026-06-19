public class Nodo02 {
    // clase Nodo() Lista enlazada simple Ordenada
    public long Data1; // elemento dato de la lista
    public Nodo02 siguiente; // Nodo() Siguiente
    public Nodo02 anterior;
    public Nodo02(){
        
    }
    public Nodo02(long d1){ // constructor
       //d1 argumento del metodo constructor	
    Data1 = d1; 
    }
    
    public void mostrarNodo(){ 
    System.out.print(Data1 + " "); 
    }

}