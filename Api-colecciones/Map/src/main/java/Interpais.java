import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Interpais {
    public static void main(String[] args) {
        Map<String, String> metromap = new java.util.HashMap<>();
        Map<String, String>Paismap = new java.util.HashMap<>();
		Paismap.put("Argentina","Ar");
		Paismap.put("Senegal", "Se");
        Paismap.put("Ruanda", "Rw");
        Paismap.put("Nepal", "Np");
        Paismap.put("Espania", "Es");
        Paismap.put("China", "Cn");
        Paismap.put("Israel", "Il");
        Paismap.put("Somaliland", "Sl");
		Set<String>paises = Paismap.keySet();
		System.out.println("paises" + paises);
		Collection<String>codigodominiopais = Paismap.values();
		System.out.println("codigo para pais: "+codigodominiopais);
        metromap.put("1", "Buenos Aires");
        metromap.put("2", "Mexico ");
        metromap.put("3", "San Pablo");
        metromap.put("4", "Santiago");
        metromap.put("5", "Rio de Janeiro");
        metromap.put("6", "Caracas");
        metromap.put("7", "Porto Alegre");
        Set<String> ciudades = metromap.keySet();
        System.out.println("primeras ciudades con metro: "+ciudades);
        Collection<String>ordencrono = metromap.values();
        System.out.println("orden cronologico"+ ordencrono);
    }
    
}
