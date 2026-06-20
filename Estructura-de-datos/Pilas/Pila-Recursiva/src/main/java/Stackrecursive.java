import java.util.Stack;

public class Stackrecursive {
     // Agregar elemento dentro pila ordenada
    static void sortedInsert(Stack<Integer> st, int x) {
        
        // si la pila esta vacia o elemento top es mas pequenio
        // push x
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int top = st.pop();

        // Recursivamente agrega x en orden
        sortedInsert(st, x);
        st.push(top);
    }

    // Ordenar la pila recursivamente
    static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();

        // Recursivamente ordena el  remanente de la pila stack
        sortStack(st);

        sortedInsert(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(16);
        st.push(22);
        st.push(41);
        st.push(14);
        st.push(3);
        st.push(32);
        st.push(5);
        st.push(2);
        st.push(11);
        st.push(7);
        System.out.println("Pila Original");
        System.out.println(st);
         System.out.println("Pila ordenada descendente con recursividad");
        sortStack(st);
        while(!st.isEmpty()){
            System.out.print(st.pop()+ " ");
        }

        
        
    }
    
}
