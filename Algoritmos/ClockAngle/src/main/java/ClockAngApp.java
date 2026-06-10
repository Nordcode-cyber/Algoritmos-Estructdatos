public class ClockAngApp {
    // metodo para calcular el ángulo entre la manecilla de las horas y la de los minutos
    public static int findAngle(int hh, int mm){
        // manejar la notación de 24 horas
        hh = hh % 12;
 
        // Encuentre la posición de la manecilla de las horas.
        int h = (hh * 360) / 12 + (mm * 360) / (12 * 60);
 
        // encuentre la posicion de la manecilla de los minutos
        int m = (mm * 360) / (60);
 
        // calcular la diferencia del angulo
        int angle = Math.abs(h - m);
 
        // considera el ángulo más corto y retornar
        if (angle > 180) {
            angle = 360 - angle;
        }
 
        return angle;
    }
 
    // Clock Angle Problem
    public static void main(String[] args)
    {
        int hh = 4;
        int mm = 15;
 
        System.out.println(findAngle(hh, mm));
    }
    
    
}
