public class StackReverse {
    private int maxSize;
private char[] stackArray;
private int top;
public StackReverse(){

}
public StackReverse(int max){ // constructor
    maxSize = max;
    stackArray = new char[maxSize];
    top = -1;
}
public void push(char j){ // put item on top of stack
    stackArray[++top] = j;
}
public char pop(){ // take item from top of stack
    return stackArray[top--];
}
public char peek(){
    return stackArray[top];
}
public boolean isEmpty(){//verdadero si la pila esta vacia
    return (top == -1);
}
}
