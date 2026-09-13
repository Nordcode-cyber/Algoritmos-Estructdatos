import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArbolApp {
    public static void main(String[] args) throws IOException {
		Scanner entra = new Scanner (System.in);
		
			int value;
			Tree theTree = new Tree();
			theTree.insert(50, 1.5);
			theTree.insert(25, 1.2);
			theTree.insert(73, 1.7);
			theTree.insert(12, 1.5);
			theTree.insert(37, 1.2);
			theTree.insert(43, 1.7);
			theTree.insert(18, 1.4);
			theTree.insert(30, 1.5);
			theTree.insert(54, 2.1);
			theTree.insert(56, 2.2);
			theTree.insert(77, 2.3);
			theTree.insert(80, 2.4);
			theTree.insert(10, 2.5);
			theTree.insert(52, 2.6);
			theTree.insert(76, 2.7);
			while(true)
			{
			System.out.print("ingrese inicial de las opciones show, ");
			System.out.print("insert, find, delete, or traverse: ");
			int choice = getChar();
			switch(choice)
			{
			case 's':
			theTree.displayTree();
			break;
			case 'i':
			System.out.print("ingrese valor: ");
			value = getInt();
			theTree.insert(value, value + 0.9);
			break;
			case 'f':
			System.out.print("Ingrese valor a buscar: ");
			value = getInt();
			Nodo12 found = theTree.find(value);
			if(found != null)
			{
			System.out.print("Encontrado: ");
			found.displayNode();
			System.out.print("\n");
			}
			else
			System.out.print("valor no encontrado ");
			System.out.print(value + '\n');
			break;
			case 'd':
			System.out.print("Ingrese valor a eliminar: ");
			value = getInt();
			boolean didDelete = theTree.delete(value);
			if(didDelete)
			System.out.print("Borrado " + value + '\n');
			else
			System.out.print("No se pudo eliminar ");
			System.out.print(value + '\n');
			break;
			case 't':
			System.out.print("Enter type 1[PreOrden], 2[EnOrden] or 3[PostOrden]: ");
			value = getInt();
			theTree.traverse(value);
			break;
			default:
			System.out.print("Valor Invalido \n");
			} // end switch
			} // end while
			} // end main()
			// -------------------------------------------------------------
			public static String getString() throws IOException{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			return s;
			}
			// -------------------------------------------------------------
			public static char getChar()  throws IOException{
			
			String s = getString();
			return s.charAt(0);
			}
			//-------------------------------------------------------------
			public static int getInt() throws IOException{
				String s = getString();
				return Integer.parseInt(s);
				}
			
    

}
