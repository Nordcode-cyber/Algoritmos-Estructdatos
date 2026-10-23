###                               Introducción a las tablas de 

Las tablas de datos permiten el acceso directo a un elemento de una secuencia indicando la posición que ocupa. 
Un diccionario es también una secuencia de elementos, pero éstos son, realmente, pares formados, por ejemplo, 
por un identificador y un número entero. Las tablas de dispersión se suelen utilizar para implementar, 
cualquier tipo de diccionario, por ejemplo, la tabla de símbolos de un compilador necesaria para generar el código ejecutable. 
La potencia de las tablas ${hash}$ o dispersas radica en la búsqueda de elementos; conociendo el campo clave se puede 
obtener directamente la posición que ocupa y, por consiguiente, la información asociada a dicha clave. 
Sin embargo, no permiten algoritmos eficientes para acceder a todos los elementos de la tabla en su recorrido. 
El estudio de tablas ${hash}$ acarrea el estudio de funciones ${hash}$ o de dispersión, que mediante expresiones matemáticas, 
permiten obtener direcciones según unan clave, que es el argumento de la función.
Existen diversas funciones ${hash}$ y cómo resolver el problema de obtener una misma dirección con dos o más claves, 
lo que se conoce como colisión.

###                               Tabla de Dispersión

Las tablas de dispersión o, simplemente tablas ${hash}$, son estructuras de datos que se usan en aplicaciones que manejan, 
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

###                             Definicion de una tabla de dispersión

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
Las funciones de transformación de claves, funciones ${hash}$, permiten que el rango posible de índices esté en proporción al número real de registros.
Las funciones que transforman números grandes en otros más pequeños se conocen como funciones de dispersión o funciones ${hash}$.

###                             Operaciones de tablas de dispersión

Las tablas dispersas implementan eficientemente los tipos de datos denominados Diccionarios. Un diccionario asocia una clave con un valor, por ejemplo, 
el diccionario de inglés asocia una palabra con la traducción en inglés. La operación búsqueda de una palabra se realiza frecuentemente;
dada una palabra, se localiza su posición y se obtiene la traducción correspondiente (el valor asociado).
La primera operación relativa a una tabla dispersa consiste en su creación, esto es, dar de alta elementos. La operación de insertar añade un elemento, 
en la posición que le corresponde según la clave del elemento. De igual manera, también pueden darse de baja elementos: la operación
eliminar extrae un elemento de la tabla que se encuentra en la posición que le corresponde según su clave.
En las tablas dispersas no se utiliza directamente la clave para indexar, el índice se calcula con una función matemática, función ${hash}$   ${h(x)}$, 
que tiene como argumento la clave del elemento y devuelve una dirección o índice en el rango de la tabla según esto, considerando ${h(x)}$ la función
hash, se pueden especificar las operaciones del tipo Tabla dispersa:
```Buscar(Tabla T, clave x)```
```devuelve el elemento de la tabla T[h(x)]```
```Insertar(Tabla T, elemento k)```
```añade el elemento k, T[h(clave(k)] ← k)```
```Eliminar(Tabla T, clave x)```
```retira de la tabla el elemento con clave x, T[h(x)] ← LIBRE```

La ventaja de utilizar tablas de dispersión radica en la eficiencia de estas operaciones. Si la función ${hash}$ es de complejidad constante, 
la complejidad de cada una de las tres operaciones también es constante, ${0(1)}$. Un problema potencial de la función de dispersión es el de las, colisiones, esto es dadas dos claves distintas ${xi, xj}$ se obtenga la misma dirección o índice: ${h(xi)}$ = ${h(xj)}$. 
La operación de insertar tiene que incorporar el proceso de resolución de colisiones, no pueden estar dos elementos en la misma posición. 
De igual forma, los procesos de búsqueda y eliminación también quedan afectados por la resolución de colisiones.
Las tablas dispersas se diseñan considerando el problema de las colisiones. Siempre se reservan mas posiciones de memoria, m, que elementos previstos a almacenar, n. 
Cuantas más posiciones haya, menor es el riesgo de colisiones, pero mas huecos libres quedan (memoria desaprovechada).
El parámetro que mide la proporción entre el número de elementos almacenados, n, en una tabla dispersa y el tamaño de la tabla, m, 
se denomina factor de carga, λ = n/m. Se recomienda elegir m de tal forma que el factor de carga sea ${λ}$ ${≤}$ 0.8.

###                               Funciones de dispersión

Una función de dispersión convierte el dato considerado campo clave (tipo entero o cadena de caracteres) en un índice dentro del rango de definición, 
del array o vector que almacena los elementos, de tal forma que sea adecuado para indexar el array.
La idea que subyace es utilizar la clave de un elemento para determinar su dirección o posición en un almacenamiento secuencial, pero sin desperdiciar mucho espacio. 
Para ello, se realiza una transformación, mediante una función hash, del conjunto ${K}$ de claves sobre el conjunto ${L}$ de direcciones de memoria.
```h(x): K -> L```
Ésta es la función de direccionamiento ${hash}$ o función de dispersión. Si x es una clave, entonces ${h(x)}$ se denomina direccionamiento ${hash}$ de la ${clave}$ x, y además es el índice de la tabla donde se guardará el registro con esa clave. Así, si la tabla tiene un tamaño de tamTabla = 199, la función ${hash}$ que se elija tiene que,
generar índices en el rango 0 ... tamTabla-1. Si la clave es un entero, por ejemplo, el número de serie de un artículo (hasta 6 dígitos), y se dispone de una tabla de
tamTabla elementos, la función de direccionamiento tiene que ser capaz de transformar valores pertenecientes al rango 0 ... 999999 en valores pertenecientes,
al subrango 0 ... tamTabla-1. La clave elegida también puede ser una cadena de caracteres, en ese caso se hace una transformación previa a valor entero. 
La función ${hash}$ más simple utiliza el operador módulo (resto entero).

```x % tamTabla = genera un número entero de 0 a tamTabla-1```

Es necesario valorar el hecho de que la función ${hash}$, h(x), no genere valores distintos, es posible (según la función elegida) que dos claves diferentes, ${c1}$ y ${c2}$, den la misma dirección, ${h(c1)}$ = ${h(c2)}$. Entonces se produce el fenómeno de la ${colisión}$, y se debe usar algún método para resolverla. Por tanto, el estudio del direccionamiento,
${hash}$ implica dos hechos: la elección de funciones ${hash}$ y resolución de colisiones.
Existe un número considerable de funciones ${hash}$. Dos criterios deben considerarse a la hora de seleccionar una función. En primer lugar, que la función, ${h(x)}$, sea fácil de evaluar (lo que dependerá del campo clave) y que su tiempo de ejecución sea mínimo, de ${complejidad}$ constante, ${O(1)}$. En segundo lugar, ${h(x)}$ debe distribuir uniformemente las direcciones sobre el conjunto${L}$ (direcciones de memoria), de forma que se minimice el número de colisiones. Nunca existirá una garantía plena de que no haya colisiones, y más sin conocer de antemano las claves y las direcciones. La experiencia enseña que siempre habrá que preparar la resolución de colisiones para cuando éstas se produzcan.
Algunas de las funciones hash de cálculo más fácil y rápido se exponen en las secciones siguientes. Para todas ellas se sigue el criterio de considerar x una clave cualquiera, m el tamaño de la tabla y, por tanto, los índices de la tabla varían de 0 a m-1; y, por último, el número de elementos es ${n}$.

###                                Aritmetica modular

Una ${función}$ de ${dispersión}$ que utiliza la aritmética modular genera valores dispersos calculando
el resto de la división entera entre la clave x y el tamaño de la tabla m.
```h(x)= x modulo m```
Normalmente, la clave asociada con un elemento es de tipo entero. A veces, los valores de la clave no son enteros; entonces, previamente, 
hay que transformar la clave a un valor entero. Por ejemplo, si la clave es una cadena de caracteres, se puede transformar considerando el valor
ASCII de cada carácter como si fuera un dígito entero de base 128.
La operación resto(módulo) genera un numero entre 0 y m-1 cuando el segundo operando es m. Por tanto, esta función de dispersión proporciona valores enteros dentro del rango,
 0 ... m-1.
Con el fin de que esta función disperse lo más uniformemente posible, es necesario tener ciertas precauciones con la elección del tamaño de la tabla, ${m}$. Así, no es recomendable escoger el valor de ${m}$ múltiplo de 2 ni tampoco de 10. Si m = 2 j, entonces la distribución de ${h(x)}$ se basa únicamente en los ${j}$ dígitos menos significativos; y si m = 10 
${j}, ocurre lo mismo. En estos casos, la distribución de las claves se basa sólo en una parte, los j dígitos menos significativos, de la información que suministra la clave, y esto sesgará la dispersión hacia ciertos valores o índices de la tabla. Si, por ejemplo, el tamaño elegido para la tabla es m = 100 (10 2 ), entonces
h(128) = h(228) = h(628) = 28. Las elecciones recomendadas del tamaño de la tabla, ${m}$, son números primos mayores, aunque cercano al número de elementos, ${n}$ , que tiene previsto que almacene la tabla.

#####                                Ejemplo
Considerar una aplicación en la que se deben almacenar n = 900 registros. El campo ${clave}$ elegido es el número de identificación. Elegir el tamaño de la tabla de dispersión y calcular la  posición que ocupan los elementos cuyo número de identificación es:
```245643 245981 257135```
Una buena elección de ${m}$, en este supuesto, es 997 al ser un número primo próximo y tener como factor de carga (n/m) aproximadamente 0.8 cuando se hayan guardado todos los elementos.Teniendo en cuenta el valor de ${m}$, se aplica la función hash de aritmética modular y se obtienen
estas direcciones:
```h(245643) = 245643 modulo 997 = 381```
```h(245981) = 245981 modulo 997 = 719```
```h(257135) = 257135 modulo 997 = 906```

