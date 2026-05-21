###                                          MAP Colección en Java API Collection Framework

Un mapa representa una colección de pares clave-valor, en la que cada clave se asigna a un único valor. Aunque el mapa forma parte del marco Java Collection, 
no amplía la interfaz java.util.Collection.

###### *Mecanismo interno*: 
un mapa funciona internamente utilizando una tabla hash basada en el concepto de hash. He escrito un artículo detallado sobre este tema, 
así que le recomiendo que lo lea para comprenderlo mejor.

###### *Duplicados*: 
Un mapa almacena datos como pares clave-valor. Aquí, cada clave es única, por lo que no se permiten claves duplicadas. 
Sin embargo, sí se permiten valores duplicados.

###### *Nulo*: 
Dado que no se permiten claves duplicadas, un mapa solo puede tener una clave nula. Como se permiten valores duplicados, 
puede tener varios valores nulos. En la implementación de TreeMap, las claves no pueden ser nulas porque ordena los elementos,
 en función de las claves. Sin embargo, se permiten valores nulos.

###### *Ordenación*: 
El orden de inserción de un mapa varía según la implementación:

###### *HashMap*: 
El orden de inserción no está garantizado, ya que se determina en función del concepto de hash.
###### *Sincronización*: 
Un mapa no está sincronizado de forma predeterminada. Sin embargo, se pueden utilizar las implementaciones `Collections.synchronizedMap()`,
 o ConcurrentHashMap para lograr la seguridad de los subprocesos.

###### *Métodos clave*: 
Estos son algunos métodos clave de una interfaz Map: `put(K key, V value)`, `get(Object key)`, `remove(Object key)`, `containsKey(Object key)` y `keySet()`.

