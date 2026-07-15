import java.util.ArrayList;

public class Apppostorden {
    static void postOrden(Nodo10 nodo, ArrayList<Integer> res){
        if (nodo == null)
            return;
        //atravesar subarbol izquierdo
        postOrden(nodo.izq, res);
        //atravesar subarbol derecho
        postOrden(nodo.der, res);
        //visitar nodo 
        res.add(nodo.data);

    }
    public static void main(String[] args) {
        //representar arbol
        //            1
        //       /        \
        //      2           3
        //     /  \      /    \
        //    4    5     6     7
        //   / \  / \   / \   / \
        //  8  9 10 11 12 13 14 15
        Nodo10 raiz = new Nodo10(1);
        raiz.izq = new Nodo10(2);
        raiz.der = new Nodo10(3);
        raiz.izq.izq = new Nodo10(4);
        raiz.izq.der = new Nodo10(5);
        raiz.der.izq = new Nodo10(6);
        raiz.der.der = new Nodo10(7);
        raiz.izq.izq.izq = new Nodo10(8);
        raiz.izq.izq.der = new Nodo10(9);
        raiz.izq.der.izq = new Nodo10(10);
        raiz.izq.der.der = new Nodo10(11);
        raiz.der.izq.izq = new Nodo10(12);
        raiz.der.izq.der = new Nodo10(13);
        raiz.der.der.izq = new Nodo10(14);
        raiz.der.der.der = new Nodo10(15);


        ArrayList<Integer> result = new ArrayList<>();
        postOrden(raiz, result);
        System.out.println("recorrido PostOrden del Arbol: ");
        for (int val: result)
            System.out.print(val + " ");
    }
    
}
