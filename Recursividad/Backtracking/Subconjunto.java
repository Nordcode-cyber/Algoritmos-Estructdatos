import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subconjunto {
      public static void backtrack(int inicio, int[] nums, List<Integer> actual, List<List<Integer>> resultado) {
        // En cada estado válido del árbol, guardamos una copia del subconjunto actual
        resultado.add(new ArrayList<>(actual));

        for (int i = inicio; i < nums.length; i++) {
            // PODA DE DUPLICADOS:
            // Si el elemento actual es igual al anterior Y no es el primero que evaluamos en este nivel
            if (i > inicio && nums[i] == nums[i - 1]) {
                continue; // Saltamos este elemento para no duplicar ramas
            }

            // Elegir
            actual.add(nums[i]);
            
            // Explorar (avanzamos i + 1)
            backtrack(i + 1, nums, actual, resultado);

            // Deshacer (Backtrack)
            actual.remove(actual.size() - 1);
        }
    }

    public static List<List<Integer>> subconjuntosSinDuplicados(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>();
        
        // 1. ORDENAR es obligatorio para agrupamiento de duplicados
        Arrays.sort(nums);
        
        backtrack(0, nums, new ArrayList<>(), resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3};
        List<List<Integer>> resultado = subconjuntosSinDuplicados(nums);
        
        System.out.println(resultado);
        // Salida: [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
    }
    
}
