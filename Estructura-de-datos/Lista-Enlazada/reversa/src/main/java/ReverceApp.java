public class ReverceApp {
     // Metodo de utilidad para empujar un nodo al principio
    // de la lista doblemente enlazada.
    /*
     *Author Nordevelop
     */
    public static Nodo push(Nodo head, int key) {
        Nodo nodo = new Nodo();
        nodo.data = key;
        nodo.anterior = null;
        nodo.siguiente = head;

        // cambiar previo del nodo cabeza existente para que apunte al nuevo nodo
        if (head != null) {
            head.anterior = nodo;
        }

        // actualizar nodo y devolver
        head = nodo;
        return head;
    }

    // Metodo para imprimir los nodos de una lista doblemente enlazada
    public static void printDDL(String msg, Nodo head) {
        System.out.print(msg);
        while (head != null) {
            System.out.print(head.data + " —> ");
            head = head.siguiente;
        }

        System.out.println("null");
    }

    // Metodo de intercambio de  los punteros anterior(prev) siguiente(next)
    public static void swap(Nodo node) {
        Nodo prev = node.anterior;
        node.anterior = node.siguiente;
        node.siguiente = prev;
    }

    // Metodo para invertir la Doble lista enlazada
    public static Nodo reverseDDL(Nodo head) {
        Nodo anterior = null;
        Nodo actual = head;

        // atravesar la lista
        while (actual != null) {
            //intercambiar punteros siguiente(next) y anterior(prev)para el nodo actual
            swap(actual);
              // actualizar el nodo anterior antes de pasar al siguiente nodo
            anterior = actual;
              //pasar al siguiente nodo de la lista doblemente enlazada
            actual = actual.anterior;
        }// fin while
       if (anterior != null) {
            head = anterior;
        }

        return head;
    }//fin Nodo reverseDDL(Nodo head)

	public static void main(String[] args) {
		int[] claves = { 1, 2, 3, 4, 5,6,7,8,9};

        Nodo head = null;
        for (int clave : claves) {//For each
            head = push(head, clave);
        }

        printDDL("lista Original: ", head);
        head = reverseDDL(head);
        printDDL("Lista reversa: ", head);

	}
}