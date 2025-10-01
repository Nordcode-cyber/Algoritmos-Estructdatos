###Java Comparable interface y Ordenaciones

El uso de Java Comparable es uno de los conceptos más fundamentales en cuando a manejo de las APIS básicas . Java soporta el interface Comparable para comparar objetos entre sí y poderlos ordenar.

###Java Comparable y su implementación

Este método es el usado para comparar dos objetos y decidir cuando uno es mayor que otro . Devuelve 1 si el objeto actual es mayor que el que pasamos como parámetro. Devuelve 0 si en la comparación se produce una relación de igualdad y devuelve -1 si es menor . De esta forma podemos apoyándonos en Java Comparable ordenar un ArrayList de objetos de forma rápida.

Qué es el método Java String compareTo()?
El método java string class compareTo() devuelve el valor 0 si ambas cadenas son lexicográficamente iguales. Si la cadena comparada es mayor lexicográficamente, entonces se devuelve el valor positivo; de lo contrario, se devuelve el valor negativo. Entonces, el método Java string compareTo() se utiliza para comparar dos cadenas. Este método siempre utiliza el valor Unicode de cada carácter de la cadena para compararlos. Al comparar las cadenas, si alguna de ellas está vacía, siempre devuelve la longitud de la cadena. Si alguna de las cadenas está vacía, entonces pueden desarrollarse dos escenarios. Si la primera cadena está vacía, devuelve un valor negativo; de lo contrario, devuelve un valor positivo. El método Java string.compareTo() de forma predeterminada distingue entre mayúsculas y minúsculas, pero podemos usar el método compareToIgnoreCase() de la clase Java String para ignorar la distinción entre mayúsculas y minúsculas durante la comparación. Este método también devuelve un número entero negativo, 0 o positivo como se describe anteriormente. 

