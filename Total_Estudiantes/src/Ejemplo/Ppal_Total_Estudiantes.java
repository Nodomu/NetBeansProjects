package Ejemplo;
import java.io.*;
public class Ppal_Total_Estudiantes
{
    public static void main(String[] args)
    { Total_Estudiantes alumno;
        alumno = new Total_Estudiantes();
        int e, f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try 
        { System.out.println("digite los estudiantes del grado 1");
          e = Integer.parseInt(br.readLine());
          alumno.pedirE_1(e);
          System.out.println("digite los estudiantes del grado 4");
          f = Integer.parseInt(br.readLine());
          alumno.pedirE_4(f);
        }
        catch(IOException vaerror){System.out.println("error");}
        
        System.out.println("los estudiantes de los grados y total son");
        alumno.mostrar_Resultados();
    }
       
}