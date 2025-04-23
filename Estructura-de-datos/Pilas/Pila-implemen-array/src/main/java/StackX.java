public class StackX {
  private int maxSize; //tamanio de stack-array
  private double[] stackArray;
  private int top;//cima de la pila
  public StackX(){

  }
  public StackX(int s){
    maxSize =s;
    stackArray = new double[maxSize];//creamos el array
    top=-1;  
 }
 public void push(double j){
    stackArray[++top] = j;//incrementar top, ingresando datos
 }
 public double pop(){//debe devolver variable mismo tipo de dato del metodo
    return stackArray[top--];
 }
 public double peek(){
     //permite ver el elemento en la parte superior de la pila sin eliminarlo
    return stackArray[top];
 }
 public boolean isEmpty(){//verdadero si la pila esta vacia
    return (top==-1);
 }
 public boolean isFull(){ //verdadero si la pila esta llena
    return(top == maxSize-1);
 }


}
