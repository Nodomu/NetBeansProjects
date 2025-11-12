package Ejemplo;
public class Total_Estudiantes
{
    private int e_1; 
    private int e_4; 
    
public Total_Estudiantes()
 { int   e_1 = 0;  
   int   e_4 = 0; 
    } 
 
public void pedirE_1 (int x)
 {   e_1 = x;
    } 
 
public void pedirE_4 (int y) 
{   e_4 = y;
} 
 
public int obtE_1 () 
{   return e_1;
} 
 
public int obtE_4 ()
 {   return e_4; 
    } 
 
public int calcular_Est_2 () 
{    int g_2 ;  
    g_2 = (obtE_1() / 3); 
    return g_2; 
} 

 public int calcular_Est_3 () 
 {    int g_3;  
     g_3 = calcular_Est_2() * 2;   
     return g_3; 
    } 
 
public int calcular_Est_5 () 
{    int g_5;  
    g_5 = (1/2 * obtE_4())+ calcular_Est_2();  
    return g_5;
} 
 
public int calcular_Est_6 ()
 {    int g_6; 
     int pa;  
     pa = (obtE_1()+calcular_Est_2()+calcular_Est_3()+obtE_4()+calcular_Est_5()); 
     g_6 = (1/8) * pa;  
     return g_6;
    } 
 
public int calcTotal_E () 
{    int te; 
    te = obtE_1()+calcular_Est_2()+calcular_Est_3()+  obtE_4()+calcular_Est_5()+calcular_Est_6(); 
    return te; } 
 
public void mostrar_Resultados()
 {   System.out.println("No Estudiantes Grado 1 es : " +obtE_1 ( ));  
     System.out.println("No Estudiantes Grado 2 es : " +calcular_Est_2 ( ));   
     System.out.println("No Estudiantes Grado 3 es : " +calcular_Est_3 ( ));   
     System.out.println("No Estudiantes Grado 4 es : " +obtE_4( ));  
     System.out.println("No Estudiantes Grado 5 es : " +calcular_Est_5 ( ));  
     System.out.println("No Estudiantes Grado 6 es : " +calcular_Est_6 ( ));  
     System.out.println("El Total de Estudiantes 6 es : " +calcTotal_E ( ));
    } 
 
} 
