package main.java;

import java.util.Arrays;

public class Rotar {
      /*
     * Metodo para girar a la derecha un array en una posición
     * Author Nordevelop
     */
    public static void rightRotateByOne(int[] A) {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) 
            A[i + 1] = A[i];
        A[0] = last;
        }//fin metodo rightRotateByOne

    // metodo para girar a la derecha el vector en A[] posiciones
    public static void rightRotate(int[] A, int k) {
        if (k < 0 || k >= A.length) {
            return;
        }

        for (int i = 0; i < k; i++) {
            rightRotateByOne(A);
        }
    }//fin metodo rightRotate(int[] A, int k)

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        System.out.print("Array sin rotar");
        System.out.println(Arrays.toString(A));
        rightRotate(A, k);
        System.out.print("Array con rotacion a la derecha");
        System.out.println(Arrays.toString(A));
    }
    
}
