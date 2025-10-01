package Map.src.main.java;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Interpais {
    public static void main(String[] args) {
        Map<String, String>Paismap = new java.util.HashMap<>();
		Paismap.put("Argentina","Ar");
		Paismap.put("Senegal", "Se");
        Paismap.put("Ruanda", "Rw");
        Paismap.put("Nepal", "Np");
        Paismap.put("Espania", "Es");
        Paismap.put("China", "Cn");
        Paismap.put("Israel", "Il");
		Set<String>paises = Paismap.keySet();
		System.out.println("paises" + paises);
		Collection<String>codigodominiopais = Paismap.values();
		System.out.println("codigo para pais: "+codigodominiopais);
    }
    
}
