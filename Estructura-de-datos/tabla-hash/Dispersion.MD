###                                             Introducción Tablas de Dispersión

Las tablas de datos permiten el acceso directo a un elemento de una secuencia indicando la posición que ocupa. 
Un diccionario es también una secuencia de elementos, pero éstos son, realmente, `pares formados`, por ejemplo, 
por un identificador y un número entero. Las tablas de dispersión se suelen utilizar para implementar cualquier tipo de diccionario, 
por ejemplo, la tabla de símbolos de un compilador necesaria para generar el código ejecutable. 
La potencia de las tablas hash o dispersas radica en la búsqueda de elementos; conociendo el `campo clave` se puede obtener directamente,
la posición que ocupa y, por consiguiente, la información asociada a dicha clave. 
El estudio de tablas hash acarrea el estudio de `funciones hash` o de `dispersión`, que mediante expresiones matemáticas 
permiten obtener direcciones según una clave, que es el argumento de la función. En este capítulo se estudian diversas,
 funciones hash y cómo resolver el problema de obtener una misma dirección con dos o más claves, lo que se conoce como colisión.

###                                             Tablas Hash

son estructuras de datos que se usan en aplicaciones que manejan una secuencia de elementos, de tal forma que cada elemento tiene
asociado un valor clave, que es un número entero positivo perteneciente a un rango de valores, relativamente pequeño. 
Cada uno de los elementos ha de tener una clave, que identifica de manera unívoca al elemento. Por ejemplo, 
el campo número de matricula del conjunto de alumnos puede considerarse un campo clave para organizar la información relativa,
al alumnado de una universidad. El número de matrícula es único, hay una relación biunívoca, uno a uno, entre el campo y el registro alumno. 
Puede suponerse que no existen, simultáneamente, dos registros con el mismo número de matrícula.