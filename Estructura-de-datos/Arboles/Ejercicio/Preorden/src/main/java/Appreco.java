import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Appreco {
    static List<String> preOrder(Nodo11 raiz) {
        List<String> res = new ArrayList<>();
        if (raiz == null) return res;

        Stack<Nodo11> s = new Stack<>();
        Nodo11 curr = raiz;

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
        /* Recorrido Preorden
         *       +
         *      / \  
         *     *  /
         *    ikii
         */
        Nodo11 raiz = new Nodo11("+");
        raiz.izq = new Nodo11("*");
        raiz.der = new Nodo11("/");
        raiz.izq.izq = new Nodo11("a");
        raiz.izq.der = new Nodo11("b");
        raiz.der.izq = new Nodo11("c");
        raiz.der.der = new Nodo11("d");
        List<String> res = preOrder(raiz);
        for (String x: res)
            System.out.print(x + " ");
        System.out.println();



        
    }
    
}
