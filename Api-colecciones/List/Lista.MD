####                                                         List

Una lista es una colección ordenada o secuencial de elementos. Sigue una indexación basada en cero, lo que permite insertar,
 eliminar o acceder a los elementos utilizando su posición en el índice.
##### *Mecanismo interno*: 
Una lista se basa internamente en una matriz o en una lista enlazada, dependiendo del tipo de implementación. 
Por ejemplo, una ArrayList utiliza una matriz, mientras que una LinkedList utiliza una lista enlazada internamente. 
Una lista cambia dinámicamente su tamaño al añadir o eliminar elementos. 
La recuperación basada en la indexación la convierte en un tipo de colección muy eficiente.
##### *Duplicados*: 
Se permiten elementos duplicados en una lista, lo que significa que puede haber más de un elemento en una lista,
 con el mismo valor. Se puede recuperar cualquier valor basándose en el índice en el que está almacenado.
##### *Null*: 
También se permiten valores nulos en una lista. Dado que se permiten duplicados, también puede haber varios elementos nulos.
##### *Orden*: 
Una lista mantiene el orden de inserción, lo que significa que los elementos se almacenan,
 en el mismo orden en que se añaden. 
 Esto resulta útil cuando se desea recuperar elementos en el orden exacto en que se insertaron.
##### *Métodos claves*:
Aquí están los métodos para la interface Lista: `add(E element)`, `get(int index)`, `set(int index, E element)`, `remove(int index),` and `size()`.
`List<String> list = new ArrayList<>();`
##### *Rendimiento*: 
Por lo general, las operaciones de inserción y eliminación son rápidas tanto en ArrayList como en LinkedList. 
Sin embargo, la recuperación de elementos puede ser lenta, ya que hay que recorrer todos los nodos.