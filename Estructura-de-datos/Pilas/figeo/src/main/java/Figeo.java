import java.util.*;
import java.math.*;
public class Figeo {
    public static void main(String[] args) {
        Scanner entra=new Scanner(System.in);
        Cuadrado d=null;
					Rectangulo r=null;
					Cilindro l=null;
					Circulo p=null;
					CajaRectangular q=null;
					Cubo s=null;
					Esfera z=null;
					Pitagoras t1=null;
					int lado4,lado5,lado6,largo,alto,ancho,op = 0;    //todas las propiedadesf de las clases
					float radio,altura,hipo,radio2;
					double lado7,radio1,cateto1, cateto2;
					Stack<Triangulo> Pila_Triangulo=new Stack<Triangulo>();
					Stack<Cuadrado> Pila_Cuadrado = new Stack<Cuadrado>();
					Stack<Rectangulo>Pila_Rectangulo = new Stack<Rectangulo>();
				   Stack<CajaRectangular>Pila_Rectangular= new Stack<CajaRectangular>();
					Stack<Cubo>Pila_Cubo= new Stack<Cubo>();
					Stack<Circulo>Pila_Circulo = new Stack<Circulo>();
					Stack<Cilindro>Pila_Cilindro = new Stack<Cilindro>();
					Stack<Esfera>Pila_Esfera= new Stack<Esfera>();
					Stack<Pitagoras>Pila_Pitagoras = new Stack<Pitagoras>();
                    do
					{
					    System.out.println("Elija la opcion a continuacion");
					    System.out.println("1-Cuadrado. 2-Rectangulo.3-Caja Rectangular.-4.-Cubo.5-Circulo.6-Cilindro. 7-Esfera. 9-Triangulo_Rectangulo-.0-Para terminar");
					    op=entra.nextInt();
                        if (op==1){
                            System.out.println("Ingrese un lado del Cuadrado: ");
                            lado4=entra.nextInt();
                            d=new Cuadrado(lado4);
                            Pila_Cuadrado.push(d);
                            }
                        if (op==2) {
                            System.out.println("Ingrese 1er lado del Rectangulo: ");
                            lado5=entra.nextInt();
                            System.out.println("Ingrese 2do lado del Rectangulo: ");
                            lado6=entra.nextInt();
                            r=new Rectangulo(lado5,lado6);
                            Pila_Rectangulo.push(r);
                            }
                            if (op==3) {
                                System.out.println("Ingrese el largo de la Caja Rectangular: ");
                                largo=entra.nextInt();
                                System.out.println("Ingrese el ancho de la Caja Rectangular: ");
                                 ancho=entra.nextInt();
                                System.out.println("Ingrese el alto de la Caja Rectangular: "); 
                                 alto=entra.nextInt();
                                q= new CajaRectangular(largo, ancho, alto);
                                Pila_Rectangular.push(q);
                            }
                            if (op==4) {
                                System.out.println("Ingrese  lado del Cubo: ");
                                lado7=entra.nextDouble();
                                s= new Cubo(lado7);
                                Pila_Cubo.push(s);
                            }
                            if (op==5) {
                                System.out.println("Ingrese Radio del Circulo: ");
                                radio1=entra.nextDouble();
                                p= new Circulo(radio1);
                                Pila_Circulo.push(p);
                           }
                           if (op==6) {
					    	System.out.println("Ingrese Radio Del Cilindro: ");
						    radio=entra.nextFloat();
						    System.out.println("Ingrese Altura del Cilindro: ");
						    altura=entra.nextFloat();
						    l=new Cilindro(radio, altura);
						    Pila_Cilindro.push(l);
					    }
                        if (op==7) {
					    	System.out.println("Ingrese Radio de la Esfera: ");
					    	radio2=entra.nextFloat();
					    	z= new Esfera(radio2);
					    	Pila_Esfera.push(z);
					    }
					   if(op==9) {
						   System.out.println("ingrese Cateto 1 del Triangulo Rectangulo ");
						     cateto1 = entra.nextDouble();
						  System.out.println("ingrese Cateto 2 del Triangulo Rectangulo");
						     cateto2 = entra.nextDouble();
						  t1 = new Pitagoras(cateto1, cateto2);
						  Pila_Pitagoras.push(t1);
					   }
                    }while(op!=0);
                    while (!Pila_Cuadrado.empty()){ //REF pila
                        d=Pila_Cuadrado.pop();
                        System.out.println("Se Formo un Cuadrado Cuyo Perimetro tiene: " +d.dar_Perimetro_Cuadrado()+"//"+"Su Superficie es de: "+ d.dar_Area_Cuadrado());
                        System.out.println("****************************************************************************************************************************************************************");
                        System.out.println("La Pila de Cuadrados ahora tiene: "+ Pila_Cuadrado.size()+" "+"Cuadrados");
                        }
                        System.out.println("************************************************************************************************************************************************************");
                        while(!Pila_Rectangulo.empty()){ //REF pila
			            r=Pila_Rectangulo.pop();
                        System.out.println("Se formo un Rectangulo cuyo Perimetro tiene: "+r.dar_Perimetro_Rectangulo()+"//"+"Su superficie es de:" + r.dar_Superficie_Rectangulo());
                        System.out.println("**************************************************************************************************************************************************************");
                        System.out.println("La Pila de Rectangulos ahora tiene: " + Pila_Rectangulo.size()+ " " +"Rectangulos");
                        System.out.println("*********************************************************************************************************************************************************");
                         }
                         System.out.println("************************************************************************************************************************************************************");
                         while (!Pila_Rectangular.isEmpty()){
                            q=Pila_Rectangular.pop();
                            System.out.println("Se formo una caja Rectangular cuya Area tiene: "+q.Dar_Area_CajaRectangular()+ "//"+"Cuyo Volumen tiene: "+q.Dar_Volumen_CajaRectangular());
                               System.out.println("************************************************************************************************************************************************************************");
                               System.out.println("La Pila de Cajas Rectangulares ahora tiene: " + Pila_Rectangular.size()+" "+ "Cajas Rectangulares");
                               System.out.println("****************************************************************************************************************************************************************");
                         } 
                        System.out.println("************************************************************************************************************************************************************");
                        while (!Pila_Cubo.empty()){
                            s=Pila_Cubo.pop();
                            System.out.println("Se formo un Cubo cuyo Area tiene: "+s.Dar_Area_Cubo()+"//"+"Cuyo Volumen tiene: "+s.Dar_Volumen_Cubo());
                            System.out.println("*****************************************************************************************************************************************************************");
                            System.out.println("La Pila de Cubos ahora tiene: " + Pila_Cubo.size()+ " " +"Cubos");
                            System.out.println("************************************************************************************************************************************************************");
                        }
                        System.out.println("************************************************************************************************************************************************************");
                        while (!Pila_Circulo.empty()){
                            p=Pila_Circulo.pop();
                            System.out.println("Se formo un Circulo cuyo Perimetro tiene: "+p.Dar_Perimetro_Circulo()+"//"+"Su Superficie es de: "+p.Dar_Superficie_Circulo());
                            System.out.println("*****************************************************************************************************************************************************************");
                            System.out.println("La Pila de Circulos ahora tiene: " + Pila_Circulo.size()+ " " +"Circulos");
                            System.out.println("************************************************************************************************************************************************************");
                        }   
                        System.out.println("************************************************************************************************************************************************************");
                        while (!Pila_Esfera.isEmpty()){//REF pila
                            z=Pila_Esfera.pop();
                            System.out.println("Se Formo una Esfera cuya Superficie tiene: " +z.Dar_Superficie_Esfera()+"//"+"Cuyo Volumen tiene: "+z.Dar_Volumen_Esfera());
                            System.out.println("*******************************************************************************************************************************************************************");
                            System.out.println("La Pila de Esferas ahora tiene: "+ Pila_Esfera.size()+" "+"Esferas");
                            System.out.println("****************************************************************************************************************************************************************");
                        }
                        System.out.println("************************************************************************************************************************************************************");
                        while (!Pila_Cilindro.isEmpty()){
                            l=Pila_Cilindro.pop();
                            System.out.println("Se formo un Cilindro cuyo Area tiene: "+l.Dar_Area_Cilindro()+"//"+"Cuyo Volumen tiene: "+l.Dar_Volumen_Cilindro());
                            System.out.println("*****************************************************************************************************************************************************************");
                            System.out.println("La Pila de Cilindros ahora tiene: " + Pila_Cilindro.size()+ " " +"Cilindros");
                            System.out.println("************************************************************************************************************************************************************");
                        }
                        System.out.println("************************************************************************************************************************************************************");
                        while (!Pila_Pitagoras.isEmpty()){
                            t1=Pila_Pitagoras.pop();
                            System.out.println("Se formo un Triangulo Rectangulo cuyo Area tiene: "+t1.dar_areaTriangulo_rectangulo()+"//"+"Cuyo Perimetro tiene: "+t1.dar_hipotenusa());
                            System.out.println("*****************************************************************************************************************************************************************");
                            System.out.println("La Pila de Triangulos Rectangulos ahora tiene: " + Pila_Pitagoras.size()+ " " +"Triangulos Rectangulos");
                            System.out.println("************************************************************************************************************************************************************");
                        }
                        System.out.println("************************************************************************************************************************************************************");
                        System.out.println("Gracias por usar el programa de Figuras Geometricas, hasta luego.");
                        System.out.println("************************************************************************************************************************************************************");
                        
                        
					


        
    }
    
}
