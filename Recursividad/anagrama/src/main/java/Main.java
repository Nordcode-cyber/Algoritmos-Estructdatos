package main.java;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*Anagramas
         * Author Nordevelop
         */
        Scanner entra=new Scanner(System.in);
        System.out.println("Test Anagramas" );
        String palabra = " ";
        while (!palabra.equals("")) {
            System.out.print( "Ingrese una palabra: ");
             palabra = entra.nextLine();
             if (!palabra.equals("")){
                test(palabra);
            }	
        }//fin while(!palabra.equals(""))
        System.out.println("saliendo....");
    
    }//fin main
    public static void test (String palabra) {
        System.out.println("ingreso = "+ palabra);
        anagrama("", palabra);
        
    }//fin metodo test
    public static void anagrama(String prefijo, String palabra) {
        int n = palabra.length();
        if (n == 0) {
            System.out.println(prefijo);
        } else {
            for (int i = 0; i < n; i++) {
                anagrama(prefijo + palabra.charAt(i), palabra.substring(0, i) + palabra.substring(i + 1, n));
            }
        }
        
    }//fin metodo anagrama

    
}
