import java.util.ArrayList;

//import main.java.Nodo;

//import main.java.Nodo06;

public class Appenorden {
    public static void Enorden(Nodo06 nodo, ArrayList<Integer> res) {
        if (nodo == null)
            return;
        
        // atravesar el subarbol izquierdo primero
        Enorden(nodo.izq, res);
        
        // Visitar nodo actual
        res.add(nodo.data);
        
        // atravesar subarbol derecho
        Enorden(nodo.der, res);
    }
    public static void main(String[] args) {
          // Create binary tree
        //       1
        //      /  \
        //    2     3
        //   / \     \
        //  4   5     6
         Nodo06 raiz = new Nodo06(1);
        raiz.izq = new Nodo06(2);
        raiz.der = new Nodo06(3);
        raiz.izq.izq = new Nodo06(4);
        raiz.izq.der = new Nodo06(5);
        raiz.der.der = new Nodo06(6);
        ArrayList<Integer> res = new ArrayList<>();
        Enorden(raiz, res);
        for(int node : res)
            System.out.print(node + " ");
		
		
    }
    
}
