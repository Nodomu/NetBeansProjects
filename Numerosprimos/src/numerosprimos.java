public class numerosprimos {
    
   private 
           int x;
public numerosprimos() 
{
     x=0;
}
public void setx(int a)
{
    x=a;
}
public int getx()
{
   return x;
}
int calc_numerosprimos(){
    int np=0;
    for(int i = 1; (i<=np); i++)
    { System.out.println("los numero primos son" +i +"es:");
    np = calc_numerosprimos() * getx();
    System.out.println(np);

    }
    return np;
}

public void mostrarResultado(){
System.out.println("los numeros primos son:"+ calc_numerosprimos());
}
}

