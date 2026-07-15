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
        //         1
        //      /     \
        //    2         3
        //   /  \     /   \
        //  4    5    6     7
        // /\    /\   /\    /\
        //8 9  10 11 12 13 14 15
         Nodo06 raiz = new Nodo06(1);
        raiz.izq = new Nodo06(2);
        raiz.der = new Nodo06(3);
        raiz.izq.izq = new Nodo06(4);
        raiz.izq.der = new Nodo06(5);
        raiz.der.izq = new Nodo06(6);
        raiz.der.der = new Nodo06(7);
        raiz.izq.izq.izq = new Nodo06(8);
        raiz.izq.izq.der = new Nodo06(9);
        raiz.izq.der.izq = new Nodo06(10);
        raiz.izq.der.der = new Nodo06(11);
        raiz.der.izq.izq = new Nodo06(12);
        raiz.der.izq.der = new Nodo06(13);
        raiz.der.der.izq = new Nodo06(14);
        raiz.der.der.der = new Nodo06(15);
        ArrayList<Integer> res = new ArrayList<>();
        Enorden(raiz, res);
        for(int node : res)
            System.out.print(node + " ");
		
		
    }
    
}

