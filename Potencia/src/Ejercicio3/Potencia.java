package Ejercicio3;

public class Potencia {

 private int m;
         int n;
         
public Potencia()
{ m = 0; n = 0;

}
public void setm(int numero)
{ m = numero;
}
public int getm()
{ return m;
}
public void setn(int exponente)
{ n = exponente;
}
public int getn()
{ return n;
}
public double calc_m()
{ double f;
f = Math.pow(getm(),getn());
return f;
}
public double calc_p()
{ double p;
 p = getm() + getn();
while (p < calc_m())
{
 ++p;

} return p;
}
public void mostrar()
{System.out.println("el resultado de la potencia" +calc_m());
System.out.println("la suma es:" +calc_p());
}
}
