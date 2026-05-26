###                    Recorrido de un Árbol Binario

Para visualizar o consultar los datos almacenados en un árbol se necesita recorrer el árbol o visitar los nodos del mismo. 
Al contrario que las listas enlazadas, los árboles binarios no tienen realmente un primer valor, un segundo valor, un tercer valor, etc. 
Se puede afirmar que el nodo raíz viene el primero, pero, quién viene a continuación? Existen diferentes métodos de recorrido,
de árbol ya que la mayoría de las aplicaciones con árboles son bastante sensibles al orden en el que se visitan los nodos,
de forma que será preciso elegir cuidadosamente el tipo de recorrido. 

El recorrido de un árbol binario requiere que cada nodo del árbol sea procesado (visitado)
una vez, y sólo una, en una secuencia predeterminada. Existen dos enfoques generales para la
secuencia de recorrido, *profundidad* y *anchura*.

En el recorrido en *profundidad*, el proceso exige un camino desde la raíz a través de un
hijo, al descendiente más lejano del primer hijo antes de proseguir a un segundo hijo. En otras
palabras, en el recorrido en *profundidad*, todos los descendientes de un hijo se procesan antes
del siguiente hijo.
En el recorrido en *anchura*, el proceso se realiza horizontalmente desde el raíz a todos
sus hijos; a continuación, a los hijos de sus hijos y así sucesivamente hasta que todos los nodos
han sido procesados. En el recorrido en *anchura*, cada nivel se procesa totalmente antes de que
comience el siguiente nivel.

 ######    ```el recorrido de un arbol supone visitar cada nodo solo una vez```