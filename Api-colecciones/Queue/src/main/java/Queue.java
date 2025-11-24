import java.util.LinkedList;
public class Queue {
      public static void main(String[] args) {
         // Create a queue using LinkedList
         //sin errores en Eclipse Ide
          Queue<String> queue = new LinkedList<>();

        //Utiliza el método add para insertar elementos, lanza una excepción si falla la inserción.
        queue.add("Riber");
        queue.add("Boca Juniors");
        queue.add("Independiente");
        queue.add("Estudiantes");

        // Utiliza el método offer para insertar elementos, devuelve false si la inserción falla.
        queue.offer("Atlanta");
        queue.offer("Maccabi");
        // mostrar queue
        System.out.println("Queue: " + queue);

        // quita el primer elemento
        String firstElement = queue.peek();
        System.out.println("Peek: " + firstElement); // outputs "Element1"

        // Poll the first element (retrieves and removes it)
        String polledElement = queue.poll();
        System.out.println("Poll: " + polledElement); // outputs "Element1"
        System.out.println("Queue after poll: " + queue);

       
     }
    
}
