public class Cola {
    private int maxtamanio;
    private int[] ColaArray;
    private int frente; //frente
    private int atras;//atras
    private int nElementos;
    public Cola(){

    }
    public Cola(int s){//metodo constructor con parametros
        maxtamanio=s;
        ColaArray = new int[maxtamanio];
        frente=0;
        atras=-1;
        nElementos =0;
   }
   public void ingresar(int j){
    if(atras == maxtamanio-1)
        atras=-1;
    ColaArray[++atras]=j;
    nElementos++;
   }
   public int remover(){
    int aux = ColaArray[frente++];
    if(frente == maxtamanio)
        frente=0;
    nElementos--;
    return aux;
   }
   public int peekFrente(){
    return ColaArray[frente];
   }
   public boolean isEmpty(){//verdadero si nElementos==0
    return(nElementos==0);
   }
   public boolean isFull(){
     return (nElementos==maxtamanio);
   }
   public int size(){
    return nElementos;
   }
}
