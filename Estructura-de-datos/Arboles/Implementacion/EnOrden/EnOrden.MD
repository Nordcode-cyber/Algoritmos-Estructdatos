###                                   Implementacion recorrido EnOrden
por motivo de conflicto en las clases nodo, escribimos en Markdown

```package misclases;```
```import java.util.ArrayList;```
```public class Enorden {```
```public static void Enorden(Nodo nodo, ArrayList<Integer> res) {```
       ``` if (nodo == null)```
          ```  return;```
          ```// atravesar el subarbol izquierdo primero the left subtree first```
          ```Enorden(nodo.izq, res);atravesar el subarbol izquierdo primero```
          ```//Visitar nodo actual```
          ```res.add(nodo.data);```
         ```// atravesar subarbol derecho despues```
        ```Enorden(nodo.der, res);```
    ```}```
    ```public static void main(String[] args) {```
    ```  // Create binary tree```
    ```//       1       ```
   ```//      /  \     ```
  ```//      2    3   ```
    ```//   / \     \  ```
   ```//  4   5      6 ```
   ```Nodo raiz = new Nodo(1);```
   ```raiz.izq = new Nodo(2);```
   ```raiz.der = new Nodo(3);```
   ```raiz.izq.izq = new Nodo(4);```
   ```raiz.izq.der = new Nodo(5);```
   ```raiz.der.der = new Nodo(6);```
   ``` ArrayList<Integer> res = new ArrayList<>();```
       ``` Enorden(raiz, res);```
       ``` for(int node : res)```
       ```     System.out.print(node + " ");```
 ```}```

```}```
