public class CuentaAtras {
    public static void cuentaAtras(int n) {
        if (n <= 0) {
            System.out.println("despegando!");
            return;
        }
        System.out.println(n);
        cuentaAtras(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("--- Caso normal (3) ---");
        cuentaAtras(10);

        System.out.println("--- Caso borde: 0 ---");
        cuentaAtras(0);

        System.out.println("--- Caso borde: negativo (-2) ---");
        cuentaAtras(-2);
    }

}
