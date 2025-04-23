public class Nodo {
    // clase Nodo() Lista enlazada simple Ordenada
    public long Data1; // elemento dato de la lista
    public Nodo siguiente; // Nodo() Siguiente
    public Nodo(){
        
    }
    public Nodo(long d1){ // constructor
       //d1 argumento del metodo constructor	
    Data1 = d1; 
    }
    
    public void mostrarNodo(){ 
    System.out.print(Data1 + " "); 
    }

}