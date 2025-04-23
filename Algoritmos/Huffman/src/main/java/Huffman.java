package main.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
     /*
     * Recorrer el Árbol de Huffman y almacenar los Códigos de Huffman
     * en un HashMap.
     * Author Nordevelop
     */
    public static void encode(Nodo raiz, String str,
            Map<Character, String> huffmanCode) {
        if (raiz == null) {
            return;
        }

        // encontrar a la derecha del Nodo
        if (isLeaf(raiz)) {
            huffmanCode.put(raiz.ch, str.length() > 0 ? str : "1");
        }

        encode(raiz.izda, str + '0', huffmanCode);
        encode(raiz.dcha, str + '1', huffmanCode);
    }

    // Recorrer el Árbol Huffman y decodificar la cadena codificada.
    public static int decode(Nodo raiz, int index, StringBuilder sb) {
        if (raiz == null) {
            return index;
        }

        // encontrar a la derecha del Nodo
        if (isLeaf(raiz)) {
            System.out.print(raiz.ch);
            return index;
        }

        index++;

        raiz = (sb.charAt(index) == '0') ? raiz.izda : raiz.dcha;
        index = decode(raiz, index, sb);
        return index;
    }

    // metodo Booleano utilidad para comprobar si el Árbol Huffman contiene un solo
    // Nodo
    public static boolean isLeaf(Nodo raiz) {
        return raiz.izda == null && raiz.dcha == null;
    }

    // Construir Arbol Huffman y decodificar el texto dado
    public static void buildHuffmanTree(String text) {
        if (text == null || text.length() == 0) {
            return;
        }

        // Contar la frecuencia of cada caracter
        // y almacenar estos en un HashMap

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Crar una Cola de prioridad para almacenar Nodos vivos del Arbol de Huffman.
        // Observar que el elemento de mayor prioridad tiene la menor frecuencia

        PriorityQueue<Nodo> pq;
        pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));

        // Crear a la izda Nodo por cada caracter para cada caracter y agregar
        // a la Cola de prioridad.

        for (var entry : freq.entrySet()) {
            pq.add(new Nodo(entry.getKey(), entry.getValue()));
        }

        // do till there is more than one Nodo in the queue
        while (pq.size() != 1) {
            // Remove the two Nodos of the highest priority
            // (the lowest frequency) from the queue

            Nodo izda = pq.poll();
            Nodo dcha = pq.poll();

            // create a new internal Nodo with these two Nodos as children
            // and with a frequency equal to the sum of both Nodos'
            // frequencies. Add the new Nodo to the priority queue.

            int sum = izda.freq + dcha.freq;
            pq.add(new Nodo(null, sum, izda, dcha));
        }

        // `raiz` stores pointer to the raiz of Huffman Tree
        Nodo raiz = pq.peek();

        // Traverse the Huffman tree and store the Huffman codes in a map
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(raiz, "", huffmanCode);

        // Print the Huffman codes
        System.out.println("los codigos Huffman son: " + huffmanCode);
        System.out.println("la cadena String original es: " + text);

        // Print encoded string
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(huffmanCode.get(c));
        }

        System.out.println("la cadena decodificada es: " + sb);
        System.out.print("la cadena codificada es: ");

        if (isLeaf(raiz)) {
            // Special case: For input like a, aa, aaa, etc.
            while (raiz.freq-- > 0) {
                System.out.print(raiz.ch);
            }
        } else {
            // Traverse the Huffman Tree again and this time,
            // decode the encoded string
            int index = -1;
            while (index < sb.length() - 1) {
                index = decode(raiz, index, sb);
            }
        }
    }

    // codigo de algoritmo de Huffman implementacion en Java
    public static void main(String[] args) {
        String text = " Huffman.";
        buildHuffmanTree(text);
    }

    
}
