
package automovil;


public class Automovil {

    private 
            int A;
            int P;
       public Automovil()
       {
           A = 0;
           P = 0;           
       }
       public void setA(int Año)
       {
           A = Año;
       }
       public void setP(int Peso)
       {
           P = Peso;
       }
       public int getA()
       {
           return A;
       }
       public int getP()
       {
           return P;
       }
       public String Calc_Precio()
       {
          String Y = "";
           
           if(getA()<=1970)
           {
               if(getP()<2700)
               {
                   System.out.println("La clase del peso es 1 y la tarifa es 16.50");
               }
           
           else
           {
               if((getP()>=2700)&&(getP()<=3800))
               {
                   System.out.println("La clase del peso es 2 y la tarifa es 25.50");
               }
               else 
               {
                   if(getP()>3800)
                   {
                       System.out.println("La clase del peso es 3 y la tarifa es 46.50");
                   }
               
                   else 
                   {
                       if((getA()>1971)&&(getP()<1979))
                       {
                           if(getP()<2700)
                           {
                               System.out.println("La clase del peso es 4 y la tarifa es 30.50");
                           }
                       
                       else 
                       {
                           if((getP()>=2700)&&(getP()<3800))
                           {
                               System.out.println("La clase del peso es 5 y la tarifa es 30.50");
                           }
                           else
                           {
                               if(getP()>3800)
                               {
                                   System.out.println("La clase del peso es 6 y la tarifa es 52.50");
                               }
                               
                               
                            else 
                               {
                                   if(getA()>1980)
                                   {
                                       if(getP()<3500)
                                       {
                                           System.out.println("La clase del peso es 7 y la tarifa es 19.50");
                                       }
                                       else 
                                       {
                                           if(getP()>3500)
                                           {
                                               System.out.println("La clase del peso es 8 y la tarifa es 52.50");
                                           }
                                       }
                                   }
                               }
                           }
                       }
                           
                   }
                   }
                   }
           }
       }
           return Y;
       }
               
}
