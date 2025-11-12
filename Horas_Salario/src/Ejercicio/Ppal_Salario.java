package Ejercicio;
import java.util.Scanner;

public class Ppal_Salario {
    public static void main(String[]args)
    {
Scanner leer = new Scanner(System.in);
        Horas_Salario Obj;
        Obj = new Horas_Salario();
        int n;
        int v;
        System.out.println("numero de horas es:");
        Obj.seth(Integer.parseInt(leer.nextLine()));
        
        System.out.println("valor de la hora");
        Obj.sets(Integer.parseInt(leer.nextLine()));

System.out.println("el sueldo es:");
System.out.println(Obj.calc_salario());
leer.nextLine();
    }
    }
