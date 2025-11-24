####                                                          Set

Un conjunto es un tipo de colección que no permite elementos duplicados y representa el concepto de un conjunto matemático.

###### *Mecanismo interno*: 
Un conjunto está respaldado internamente por un HashMap. Dependiendo del tipo de implementación, 
está respaldado por un HashMap, un LinkedHashMap o un TreeMap. He escrito un artículo detallado sobre cómo funciona HashMap 
internamente aquí. 
#####  *Duplicados*: 
Dado que un conjunto representa el concepto de conjunto matemático, no se permiten elementos duplicados. 
Esto garantiza que todos los elementos sean únicos, lo que mantiene la integridad de la colección.
#####     *Null*: 
Se permite un máximo de un valor null en un conjunto, ya que no se permiten duplicados. 
Pero esto no se aplica a la implementación TreeSet, donde no se permiten valores null en absoluto.
#####  *Orden*: 
El orden de los elementos en un conjunto depende del tipo de implementación.
#####  *HashSet*: 
El orden no está garantizado y los elementos se pueden colocar en cualquier posición.
##### *LinkedHashSet*: 
Esta implementación mantiene el orden de inserción, por lo que se pueden recuperar los elementos en el mismo orden en que se insertaron.
##### *TreeSet*: 
Los elementos se insertan según su orden natural. Alternativamente, puede controlar el orden de inserción especificando un comparador personalizado.
##### *Sincronización*: 
Un Set no está sincronizado, lo que significa que puede encontrar problemas de concurrencia, como condiciones de carrera, 
que pueden afectar a la integridad de los datos si dos o más subprocesos intentan acceder a un objeto Set simultáneamente.
`Set<String> set = new HashSet<>();`
`  [Apple, Cherry, Orange, Banana]`
`Contains Apple: true`
`Size of the set: 3`
##### *Implementacion*:
`HashSet, LinkedHashSet, TreeSet`
##### *Rendimiento*: 
Las implementaciones de conjuntos ofrecen un rendimiento rápido para operaciones básicas, excepto en el caso de TreeSet, 
donde el rendimiento puede ser relativamente más lento debido a que la estructura de datos interna implica ordenar los elementos durante estas operaciones.
