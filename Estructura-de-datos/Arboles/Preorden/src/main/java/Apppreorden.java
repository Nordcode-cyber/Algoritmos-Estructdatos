import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Apppreorden {
     static List<Integer> preOrder(Nodo09 raiz) {
        List<Integer> res = new ArrayList<>();
        if (raiz == null) return res;

        Stack<Nodo09> s = new Stack<>();
        Nodo09 curr = raiz;

        while (!s.isEmpty() || curr != null) {
            while (curr != null) {
                res.add(curr.data);
                if (curr.der != null) s.push(curr.der);
                curr = curr.izq;
            }

            if (!s.isEmpty()) {
                curr = s.pop();
            }
        }

        return res;
     }
     public static void main(String[] args) {
         Nodo09 raiz = new Nodo09(1);
        raiz.izq = new Nodo09(2);
        raiz.der = new Nodo09(3);
        raiz.izq.izq = new Nodo09(4);
        raiz.izq.der = new Nodo09(5);
        raiz.izq.izq.izq = new Nodo09(6);
        raiz.izq.izq.der = new Nodo09(7);
        raiz.der.izq = new  Nodo09(8);
        raiz.der.der = new  Nodo09(9);
        raiz.izq.der.izq = new Nodo09(10);
        raiz.izq.der.der = new Nodo09(11);
        raiz.der.izq.izq = new Nodo09(12);
        raiz.der.izq.der = new Nodo09(13);
        raiz.der.der.izq = new Nodo09(14);
        raiz.der.der.der = new Nodo09(15);
       

        List<Integer> res = preOrder(raiz);

        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
        
     }
    
}
