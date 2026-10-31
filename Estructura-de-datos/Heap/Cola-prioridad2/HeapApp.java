
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapApp {
    public static void main(String[] args)  throws IOException{
        int value, value2;
        Heap Heap = new Heap(31); // el monticulo con tamanio maximo de 31; max size 31
        boolean success;
        Heap.insert(70);
        Heap.insert(40);
        Heap.insert(50);
        Heap.insert(20);
        Heap.insert(60);
        Heap.insert(16);
        Heap.insert(80);
        Heap.insert(30);
        Heap.insert(10);
        Heap.insert(90);
       
        while(true){ // until [Ctrl]-[C]
        System.out.print("Enter first letter of");
        System.out.print("show, insert, remove, change:");
int choice = getChar();
switch(choice){
case 's': // show
Heap.displayHeap();
break;
case 'i': // insert
System.out.print("Enter value to insert:");
value = getInt();
success = Heap.insert(value);
if( !success )
System.out.println("Cant insert; heap full");
break;
case 'r': // remove
if( !Heap.isEmpty() )
Heap.remove();
else
System.out.println("Can’t remove; heap empty");
break;
case 'c': // change
System.out.print("Enter current index of item:");
value = getInt();
System.out.print("Enter new key:");
value2 = getInt();
success = Heap.change(value, value2);
if( !success )
System.out.println("Invalid index");
break;
default:
System.out.println("Invalid entry\n");
} // end switch
} // end while   
}
public static String getString() throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();
return s;
}
public static char getChar() throws IOException{
String s = getString();
return s.charAt(0);
}
public static int getInt() throws IOException{
String s = getString();
return Integer.parseInt(s);
}
//--------------------
}
