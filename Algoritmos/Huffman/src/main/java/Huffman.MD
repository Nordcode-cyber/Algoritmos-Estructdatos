##                                       ALGORITMO DE CODIFICACIÓN Y COMPRESIÓN DE DATOS HUFFMAN

La codificación *Huffman*  es un algoritmo para hacer la compresión de datos, y constituye la idea básica detrás de la compresión de archivos. Esta entrada habla de la codificación de longitud fija y variable, de los códigos decodificables de forma única, de las reglas del prefijo y de la construcción del Árbol de Huffman.

Ya sabemos que cada carácter es una secuencia de 0 y 1 y se almacena con 8 bits. Esto se conoce como "codificación de longitud fija", ya que cada carácter utiliza el mismo número de bits fijos de almacenamiento. Dado un texto, ¿cómo reducir la cantidad de espacio necesario para almacenar un carácter?Algoritmo de la codificación Huffman La idea es utilizar una "codificación de longitud variable". Podemos aprovechar el hecho de que algunos caracteres aparecen con, más frecuencia que otros en un texto (véase esto) para diseñar un algoritmo que pueda representar el mismo trozo de texto, utilizando un número menor de bits. En la codificación de longitud variable, asignamos un número variable de bits a los caracteres, en función de su frecuencia en el texto.

###                                           CODIFICACIÓN DE UNA SECUENCIA

Así, algunos caracteres pueden acabar ocupando un solo bit, otros dos, otros pueden codificarse con tres bits, etc. El problema de la codificación de longitud variable radica en su descodificación. Dada una secuencia de bits, ¿cómo decodificar de forma única? Consideremos la cadena aabacdab. Tiene 8 caracteres y utiliza 64 bits de almacenamiento (utilizando la codificación de longitud fija). Si nos fijamos, la frecuencia de los caracteres a, b, c y d son 4, 2, 1, 1, respectivamente. Intentemos representar aabacdab utilizando un número menor de bits aprovechando el hecho de que a ocurre más frecuentemente que b, y b ocurre más frecuentemente que c y d. Comenzamos asignando aleatoriamente un código de un solo bit 0 a a, un código de 2 bits 11 a b, y un código de 3 bits 100 y 011 a los caracteres c y d, respectivamente.

###                                             IMPLEMENTACIÓN DE LOS NODOS DEL ÁRBOL

                                                  class Nodo{
                                                      Character ch;
                                                      Integer freq;
                                                      Nodo left = null, right = null;
                                                      Nodo(Character ch, Integer freq){
                                                      this.ch = ch;
                                                      this.freq = freq;
                                                      }
                                                        public Nodo(Character ch, Integer freq, Nodo left, Nodo right){//método constructor
                                                           this.ch = ch;
                                                           this.freq = freq;
                                                           this.left = left;
                                                           this.right = right;
                                                          }
                                                      }
                                                      
####                                                      IMPLEMENTACIÓN DE ESTRUCTURA DE DATOS

                                                           COLA DE PRIORIDAD
                                                         PriorityQueue<nodo> pq;
                                             pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));
                                                                HASHMAP
                                                Map<Character, String> huffmanCode = new HashMap<>(); 