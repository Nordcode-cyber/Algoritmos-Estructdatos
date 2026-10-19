###                               Introducción a las tablas de Hash

Las tablas de datos permiten el acceso directo a un elemento de una secuencia indicando la posición que ocupa. 
Un diccionario es también una secuencia de elementos, pero éstos son, realmente, pares formados, por ejemplo, 
por un identificador y un número entero. Las tablas de dispersión se suelen utilizar para implementar, 
cualquier tipo de diccionario, por ejemplo, la tabla de símbolos de un compilador necesaria para generar el código ejecutable. 
La potencia de las tablas hash o dispersas radica en la búsqueda de elementos; conociendo el campo clave se puede 
obtener directamente la posición que ocupa y, por consiguiente, la información asociada a dicha clave. 
Sin embargo, no permiten algoritmos eficientes para acceder a todos los elementos de la tabla en su recorrido. 
El estudio de tablas hash acarrea el estudio de funciones hash o de dispersión, que mediante expresiones matemáticas, 
permiten obtener direcciones según unan clave, que es el argumento de la función.
Existen diversas funciones hash y cómo resolver el problema de obtener una misma dirección con dos o más claves, 
lo que se conoce como colisión.

###                               Tabla de Dispersion

Las tablas de dispersión o, simplemente tablas hash, son estructuras de datos que se usan en aplicaciones que manejan, 
una secuencia de elementos, de tal forma que cada elemento tiene asociado un valor clave, que es un número entero positivo,
perteneciente a un rango de valores, relativamente pequeño. En estas organizaciones, cada uno de los elementos ha de tener una clave,
que identifica de manera unívoca al elemento. Por ejemplo, el campo número de matricula del conjunto de alumnos puede considerarse,
un campo clave para organizar la información relativa al alumnado de una universidad. 
El número de matrícula es único, hay una relación biunívoca, uno a uno, entre el campo y el registro alumno. 
Puede suponerse que no existen, simultáneamente, dos registros con el mismo número de matrícula.

#####                             Diccionario

Un diccionario es un tipo abstracto de dato en el que los elementos tienen asociada una clave unica en el conjunto de los numeros,
enteros positivos de tal forma que para cualquier par de elementos distintos, sus claves tambien son distintas.
Con las tablas de dispersion se implementa el tipo abstracto de datos diccionario.

###                             Definicion de una tabla de dispersion

Las tablas de dispersión son estructuras de datos que tienen como finalidad realizar las operaciones fundamentales de búsqueda y 
eliminación de un registro en un tiempo de ejecución constante complejidad ${O(1)}$. La organización ideal de una tabla es de tal,
forma que el campo clave de los elementos se corresponda directamente con el índice de la tabla. Por ejemplo, una compañía tiene 300 empleados, 
cada uno identificado con un número de nómina de 0 a 999. La forma de organizar la tabla es con un array de 1000 registros:
```Empleado[] tabla = new Empleado[1000]```
El elemento tabla[i] almacena al empleado cuya nómina es i. Con esta organización, la búsqueda de un empleado es directa, con un único acceso, 
debido a que el número de nómina es la posición en la tabla. La eficiencia se puede expresar como tiempo constante, ${O(1)}$.
Sin embargo, muchas posiciones de la tabla están vacías, se corresponden con números de nómina que no existen. Y eso que el rango, 
del campo clave es relativamente pequeño; si los números de nómina fueran de 5 dígitos, las posiciones vacías estarían en clara desproporción, 
y la memoria ocupada por la tabla queda desaprovechada. Pero enseguida se puede plantear una solución: tomar los tres primeros dígitos del número de la nómina, 
campo clave, como índice del array o tabla de registros, de este modo se ha hecho una transformación del campo clave en un entero de 3 dígitos:
```h(numero de nomina)->indice```
Se puede concluir que el primer problema que plantea esta organización: ¿cómo evitar que el array o vector utilizado esté en una proporción adecuado al número de registros? 
Las funciones de transformación de claves, funciones hash, permiten que el rango posible de índices esté en proporción al número real de registros.
Las funciones que transforman números grandes en otros más pequeños se conocen como funciones de dispersión o funciones hash.

