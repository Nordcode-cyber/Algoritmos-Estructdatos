import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Colacomp {
    public static void main(String[] args) {
         Set<Simpson> set = new TreeSet<>();
        set.add(new Simpson("Homero"));
        set.add(new Simpson("Marget"));
        set.add(new Simpson("Lisa"));
        set.add(new Simpson("Bart"));
        set.add(new Simpson("Maggie"));
        set.add(new Simpson("Ned"));

        List<Simpson> list = new ArrayList<>(set);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    static class Simpson implements Comparable<Simpson> {
        String name;

        public Simpson(String name) {
            this.name = name;
        }

        public int compareTo(Simpson simpson) {
            return simpson.name.compareTo(this.name);
        }

        public String toString() {
            return this.name;
        }
        
    }
}
