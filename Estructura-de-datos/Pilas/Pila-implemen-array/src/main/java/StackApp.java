public class StackApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StackX pila = new StackX(9);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60);
        pila.push(70);
        pila.push(80);
        pila.push(90);
        while (!pila.isEmpty()){
            double value = pila.pop();
            System.out.println(value);
            System.out.println(" ");
        }   
    }
}
