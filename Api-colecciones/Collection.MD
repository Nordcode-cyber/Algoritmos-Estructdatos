###                                           API Collection Framework

En sus aplicaciones Java, normalmente trabajará con varios tipos de objetos. Y es posible que desee realizar operaciones como ordenar, buscar e iterar sobre estos objetos.

Antes de la introducción del marco Collections en JDK 1.2, habría utilizado matrices y vectores para almacenar y gestionar un grupo de objetos. Pero estos tenían sus propios inconvenientes.

El marco Java Collections tiene como objetivo superar estos problemas proporcionando implementaciones de alto rendimiento de estructuras de datos comunes. Esto le permite centrarse en escribir la lógica de la aplicación en lugar de centrarse en operaciones de bajo nivel.

Luego, la introducción de Generics en JDK 1.5 mejoró significativamente el marco Java Collections. Generics le permite aplicar la seguridad de tipos para los objetos almacenados en una colección, lo que mejora la robustez de sus aplicaciones. Puede leer más sobre Java Generics aquí.

En este artículo, le guiaré a través del uso del Java Collections Framework. Analizaremos los diferentes tipos de colecciones, como listas, conjuntos, colas y mapas. También proporcionaré una breve explicación de sus características clave, tales como:

Mecanismos internos.

Manejo de duplicados.

Compatibilidad con valores nulos.

Ordenación.

Sincronización.

Rendimiento.

Métodos clave.

Implementaciones comunes.

####                                                         List

Una lista es una colección ordenada o secuencial de elementos. Sigue una indexación basada en cero, lo que permite insertar, eliminar o acceder a los elementos utilizando su posición en el índice.
Mecanismo interno: una lista se basa internamente en una matriz o en una lista enlazada, dependiendo del tipo de implementación. 
Por ejemplo, una ArrayList utiliza una matriz, mientras que una LinkedList utiliza una lista enlazada internamente. Una lista cambia dinámicamente su tamaño al añadir o eliminar elementos. La recuperación basada en la indexación la convierte en un tipo de colección muy eficiente.
Duplicados: se permiten elementos duplicados en una lista, lo que significa que puede haber más de un elemento en una lista con el mismo valor. Se puede recuperar cualquier valor basándose en el índice en el que está almacenado.
Null: también se permiten valores nulos en una lista. Dado que se permiten duplicados, también puede haber varios elementos nulos.
Orden: una lista mantiene el orden de inserción, lo que significa que los elementos se almacenan en el mismo orden en que se añaden. Esto resulta útil cuando se desea recuperar elementos en el orden exacto en que se insertaron.

`List<String> list = new ArrayList<>();`

####                                                          Set

Un conjunto es un tipo de colección que no permite elementos duplicados y representa el concepto de un conjunto matemático.

Mecanismo interno: un conjunto está respaldado internamente por un HashMap. Dependiendo del tipo de implementación, está respaldado por un HashMap, un LinkedHashMap o un TreeMap. He escrito un artículo detallado sobre cómo funciona HashMap internamente aquí. 
Duplicados: dado que un conjunto representa el concepto de conjunto matemático, no se permiten elementos duplicados. Esto garantiza que todos los elementos sean únicos, lo que mantiene la integridad de la colección.

Null: se permite un máximo de un valor null en un conjunto, ya que no se permiten duplicados. Pero esto no se aplica a la implementación TreeSet, donde no se permiten valores null en absoluto.
Orden: el orden de los elementos en un conjunto depende del tipo de implementación.
HashSet: el orden no está garantizado y los elementos se pueden colocar en cualquier posición.
LinkedHashSet: esta implementación mantiene el orden de inserción, por lo que se pueden recuperar los elementos en el mismo orden en que se insertaron.
TreeSet: Los elementos se insertan según su orden natural. Alternativamente, puede controlar el orden de inserción especificando un comparador personalizado.
Sincronización: Un Set no está sincronizado, lo que significa que puede encontrar problemas de concurrencia, como condiciones de carrera, que pueden afectar a la integridad de los datos si dos o más subprocesos intentan acceder a un objeto Set simultáneamente.

####                                                           Queue

Es una colección lineal de elementos que se utiliza para almacenar varios elementos antes de su procesamiento, normalmente siguiendo el orden FIFO (primero en entrar, primero en salir). Esto significa que los elementos se añaden por un extremo y se eliminan por el otro, de modo que el primer elemento añadido a la cola es el primero en eliminarse.

Mecanismo interno: El funcionamiento interno de una cola puede variar en función de su implementación específica.
Lista enlazada: utiliza una lista doblemente enlazada para almacenar elementos, lo que significa que se puede recorrer tanto hacia adelante como hacia atrás, lo que permite operaciones flexibles.
Cola de prioridad: está respaldada internamente por un montón binario, que es muy eficiente para las operaciones de recuperación.
ArrayDeque: se implementa utilizando una matriz que se expande o se contrae a medida que se añaden o eliminan elementos. Aquí, los elementos se pueden añadir o eliminar desde ambos extremos de la cola.
Duplicados: en una cola, se permiten elementos duplicados, lo que permite insertar varias instancias del mismo valor.
Nulo: no se puede insertar un valor nulo en una cola porque, por diseño, algunos métodos de una cola devuelven nulo para indicar que está vacía. Para evitar confusiones, no se permiten valores nulos.
Orden: Los elementos se insertan según su orden natural. Alternativamente, puede controlar el orden de inserción especificando un comparador personalizado.
Sincronización: Una cola no está sincronizada de forma predeterminada. Sin embargo, puede utilizar una implementación ConcurrentLinkedQueue o BlockingQueue para lograr la seguridad de los subprocesos.





