
import java.util.Scanner;
public class Instancia8 {
   
    public static void main(String[]args)
    {
        double lg;
        Ejercicio8 medida;
        Scanner Lec;
        medida=new Ejercicio8();
        Lec=new Scanner(System.in);
        System.out.println("Ingrese el valor de la medida");
        lg=Lec.nextLong();
        medida.setLongitud(lg);
        System.out.println("LOS RESULTAODS OBTENIDOS SON:");
        System.out.println("El area del cuadrado es: " +medida.calcAreaCuadrado());
        System.out.println("El perimetro del cuadrado es: " +medida.calcPcuadrado());
        System.out.println("El area de la circunferencia es: " +medida.calcAreaC());
        System.out.println("El perimetro de la circunferencia es: " +medida.calcPerimetroC());
        System.out.println("ADIOS");
    }
}
