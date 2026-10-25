
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class HashTableApp {
    /**
     * HashTable
     */
    public static void main(String[] args)  throws IOException {
    Scanner entra=new Scanner(System.in);
    DataItem aDataItem;
    int aKey, size, n, keysPerCell;
    int n1 = 0;
// get sizes
System.out.print("Ingrese tamaño de la tabla de hash: ");
size = getInt();
System.out.print("Ingrese cantidad nicial de claves: ");
n = getInt();
keysPerCell = 10;
// make table
HashTable theHashTable = new HashTable(size);
for(int j=0; j<n; j++){
    System.out.println("ingrese un numero entero : ");
    aKey = entra.nextInt();
//aKey = (int)(java.lang.Math.random() * keysPerCell * size);
aDataItem = new DataItem(aKey);
theHashTable.insert(aDataItem);
}
while(true){
System.out.print("ingrese primera letra de la opcion: ");
System.out.print("mostrar, ingresar, borrar, o encontrar: ");
char choice = getChar();
switch(choice){
case 'm':
theHashTable.displayTable();
break;
case 'i':
System.out.print("ingrese una clave:");
aKey = getInt();
aDataItem = new DataItem(aKey);
theHashTable.insert(aDataItem);
break;
case 'b':
System.out.print("ingrese una clave a borrar:");
aKey = getInt();
theHashTable.delete(aKey);
break;
case 'e':
System.out.print("ingrese una clave a borrar:");
aKey = getInt();
aDataItem = theHashTable.find(aKey);
if(aDataItem != null){
System.out.println("Found" + aKey);
}
else
System.out.println("Clave no encontrada" + aKey);
break;
default:
System.out.print("caracter Invalido\\n");
} // end switch
} // end while
} // end main()
//--------------------------------------------------------------
public static String getString() throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();
return s;
}
//--------------------------------------------------------------
public static char getChar() throws IOException
{
String s = getString();
return s.charAt(0);
}
//-------------------------------------------------------------
public static int getInt() throws IOException{
   String s = getString();
   return Integer.parseInt(s);
  }
 }


