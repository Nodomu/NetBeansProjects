package Ejercicio;
public class Horas_Salario {
    int h;
    int s;
public Horas_Salario(){
    h=0;
    s=0;
}
public void seth(int x){
    h=x;
}
public void sets(int y){
    s=y;
}
public int geth(){
    return h;
}
public int gets(){
    return s;
}
int calc_horasT(){
    int ht;
    ht=(geth()/6);
    return ht;
}
int calc_salario(){
    int su; 
    int st=0;
     for( int i = 1; (i<=6); i++)
    { System.out.println("el sueldo en el dia" +i +"es:");
    su = calc_horasT() * gets();
    System.out.println(su);
    st=st+su;
    }
    return st;
}

public void mostrarResultado(){
System.out.println("el sueldo es:"+ calc_salario());
}
}
