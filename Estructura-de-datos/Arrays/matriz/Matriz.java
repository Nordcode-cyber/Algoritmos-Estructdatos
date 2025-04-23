import java.lang.ArrayIndexOutOfBoundsException;
public class Matriz {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println("puto");
        int tabla [][] = {{4,9,2},{3,6,7}};
		int cubo [][] = {{11,13,12},{16,19,22},{14,17,24}};
		String nombres [][] = {{"pepe","luis","jose", "beto"},{"norbert","pancho","lucho","guille"},{"bety","dany","romy","telvy"}};
		String iniciales[][] = {{"a","p","o"},{"i"," y","b"},{"x ","g ","k "}};
		double saldo[][] = {{24.87,16.98,22.44,54.66},{34.77,67.88,43.27,94.44},{55.33, 57.87,87.81,22.41}};
		//por mas que la matriz sea de 3Dimensiones se debe anidar solo 2 bucles for
		System.out.println("ciclo for anidado para tabla");
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.println("Edades: "+i+" "+j+": " + tabla[i][j]);
			}
		}
		//ciclo for anidado para cubo
		System.out.println("ciclo for anidado para cubo");
		//for (int k=0;k<cubo.length;k++) {
			for (int l=0;l<cubo.length;l++) {
				for(int m=0;m<cubo[l].length;m++) {
					System.out.println("Edades: "+l+" "+m+": "+ cubo[l][m]);
				}
			}
			//ciclo for anidado para nombres
			System.out.println("ciclo for anidado para nombres\r\n");
			for (int n=0;n<cubo.length;n++) {
				for (int o=0;o<cubo.length;o++) {
					System.out.println("Nombres: "+n+" "+o+": "+nombres[n][o]);
				}
			}
			System.out.println("ciclo for anidado para iniciales\r\n");
			for (int p=0;p<iniciales.length;p++) {
				for (int q=0;q<iniciales.length;q++) {
					System.out.println("Iniciales: "+p+" "+q+": "+iniciales[p][q]);
				}
			}
			System.out.println("ciclo for anidado para saldo \r\n");
			//for (int k=0;k<cubo.length;k++) {
				for (int r=0;r<saldo.length;r++) {
					for(int s=0;s<saldo[s].length;s++) {
						System.out.println("Saldos: "+r+" "+s+": "+ saldo[r][s]);
					}
				}
    }
    
}
