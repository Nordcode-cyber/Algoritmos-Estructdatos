import java.util.HashSet;
public class Longitud {
    static int tamanioCiclo(Nodo08 head){
        HashSet<Nodo08> visited = new HashSet<>();
         Nodo08 actual=null;
        actual = head;
        int count =0;
        while (actual !=null){
            if(visited.contains(actual)){
                Nodo08 inicioDeCiclo = actual;
            }
            Nodo08 inicioDeCiclo = null;
            do {
                count++;
                actual =actual.siguiente;

            }while (actual != inicioDeCiclo);
            return count;

        }
        visited.add(actual);
        actual= actual.siguiente;
        return 0;
    
    }
    public static void main(String[] args) {
        Nodo08 head = new Nodo08(25);
        head.siguiente = new Nodo08(14);
        head.siguiente.siguiente = new Nodo08(19);
        head.siguiente.siguiente.siguiente=new Nodo08(33);
        head.siguiente.siguiente.siguiente.siguiente =new Nodo08(10);
       // head.siguiente.siguiente.siguiente.siguiente.siguiente = head.siguiente.siguiente;
       System.out.println("cantidad de elementos de la lista enlazada");
        System.out.println(tamanioCiclo(head));
   













































      
        
    }
}
