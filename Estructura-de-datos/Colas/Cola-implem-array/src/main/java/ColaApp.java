public class ColaApp {
    public static void main(String[] args) {
        Cola lacola = new Cola(6);
        lacola.ingresar(10);
        lacola.ingresar(20);
        lacola.ingresar(30);
        lacola.ingresar(40);
        lacola.ingresar(50);
        lacola.ingresar(60);
        while(!lacola.isEmpty()){
            int n = lacola.remover();
            System.out.println(n);
        }
       System.out.print(" ");
  }
}
