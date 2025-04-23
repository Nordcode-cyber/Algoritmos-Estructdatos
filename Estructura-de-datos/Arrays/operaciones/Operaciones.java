public class Operaciones {
    public static void main(String[] args) {
        System.out.println("puto");
        int rest = 0;
        int division = 21;
        int []arr = new int []{10,5,3,1};
        int sum = 0;
        int prod = 1;
        for (int i=1;i < arr.length;i++){
          sum = sum + arr[i];
          prod = prod * arr[i];
          rest = rest -arr[i];
          division= division / arr[i];
        }
        for(int n:arr) //for each
          System.out.println(n);
        System.out.println("La suma de los elementos del Array arr: " + sum);
        System.out.println("El producto de los elementos del Array arr: " + prod);
        System.out.println("la resta de los elementos del array es: " + rest);
        System.out.println("la division de los elementos del arrays es: " + division);
        
    }
    
}
