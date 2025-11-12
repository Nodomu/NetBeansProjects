
package ejercicio4;

import javax.swing.JOptionPane;

public class ejercicio4 {
    private int n;
    private float promedio;

public ejercicio4(){
    n = 0;
    promedio = 0;
}

public void setn(int a){
    n = a;
}

public void setpromedio(float b){
    promedio = 0;
}

public int getn(){
    return n;
}

public float getpromedio(){
    return promedio;
}
  public void Calc_P(){
      int suma = 0;
        int i = 0;
        n=1;
        while (n !=0)
        {
           n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
               suma= suma + n;
               i = i+1;
        }
        promedio=suma / (i-1);
    }
    
    
    
}
