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
        //        1
        //       /  \
        //      2    3
        //     / \  / \
        //    4  5 6   7
        Nodo10 raiz = new Nodo10(1);
        raiz.izq = new Nodo10(2);
        raiz.der = new Nodo10(3);
        raiz.izq.izq = new Nodo10(4);
        raiz.izq.der = new Nodo10(5);
        raiz.der.izq = new Nodo10(6);
        raiz.der.der = new Nodo10(7);

        ArrayList<Integer> result = new ArrayList<>();
        postOrden(raiz, result);
        for (int val: result)
            System.out.print(val + " ");


        
    }
    
}
