import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        System.out.println("hola");
         List<String> list = new ArrayList<>();

         // add(E element)
         list.add("Apple");
         list.add("Banana");
         list.add("Cherry");
         System.out.println(list);

         // get(int index)
         String secondElement = list.get(1); // "Banana"
         System.out.println(secondElement);
         // set(int index, E element)
         list.set(1, "Blueberry");

         // remove(int index)
         list.remove(0); // Removes "Apple"

         // size()
         int size = list.size(); // 2

         // Print the list
         System.out.println(list); // Output: [Blueberry, Cherry]

         // Print the size of the list
         System.out.println(size); // Output: 2
    }
    
}
