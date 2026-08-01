###                               Elemento de máxima prioridad


La operaciones `elementoMin` y `quitarMin` buscan, en primer lugar, el elemento de `máxima prioridad`; 
es una búsqueda de un elemento mínimo, ya que el convenio establecido es que la `máxima prioridad` se corresponde con `0`, 
y así sucesivamente. Una vez encontrado el `índice de la cola con mayor prioridad`, las operaciones frente y quitar, 
respectivamente, para `elementoMin` y `quitarMin` de la cola terminan el proceso.

```public Tarea elementoMin()throws Exception {```     
```    int i = 0;```
```    int indiceCola = -1;```
```    // búsqueda de la primera cola no vacía```
``` do {```
```    if (!tabla[i].colaVacia()){```
```        indiceCola = i;```
```        i = maxPrioridad +1; // termina el bucle```
```   }```
```  else```
```     i++;```
``` }while (i <= maxPrioridad);```
```      if (indiceCola != -1)```
```        return (Tarea) tabla[indiceCola].frenteCola();```
     ``` else```
    ```  throw new Exception("Cola de prioridades vacía");```
```}```
La operación `quitarMin` sigue los mismos pasos que `elementoMin`, con la diferencia de que devuelve y retira,
 el elemento frente de la cola de mayor prioridad:${return}$ ${(Tarea)}$ ${tabla[indiceCola]}$.${quitar();}$
La complejidad de las operaciones frenteCola y quitar de una cola es constante, y el proceso de búsqueda,
de la cola de máxima prioridad es lineal, por esa razón la complejidad de `elementoMin` y `quitarMin` es lineal.