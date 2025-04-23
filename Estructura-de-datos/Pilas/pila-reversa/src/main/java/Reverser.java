public class Reverser {
    private String input;       // input string
    private String output=" ";       // output string
    public Reverser(){

    }
    public Reverser(String in){     // constructor
     input = in; 
    }
    public String doRev(){       // metodo reverse palabra
    int stackSize = input.length(); 
    StackReverse pila = new StackReverse(stackSize);
    for(int j=0; j<input.length(); j++){
    char ch = input.charAt(j); 
    pila.push(ch); // push it
    }//fin for
    while( !pila.isEmpty()){
    char ch = pila.pop(); // pop a char,
    output = output + ch; // append to output
    }//fin while
    return output;
    }
}
