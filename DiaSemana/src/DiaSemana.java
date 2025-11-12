public class DiaSemana
{
    private int n;

  
    public DiaSemana()
    {
        n = 0;
    }

    public void setn(int a)
    {
        n = a;
    }
    
    public int getn()
    { return n;
    }
    
    public String calcD()
     { String a = " ";
              if(getn() < 1)
              {
                 a = "ERROR";
                }
                else
              if (getn() == 1)
                { a = "lunes"; 
                 }
              else 
               {  if (getn() == 2)
                  { a = "martes";
                   }
               else 
                  if (getn() == 3)
                   { a = "miercoles";
                    }
               else 
                 if (getn() == 4)
                   { a = "jueves";
                    }
               else 
                 if (getn() == 5)
                   { a = "viernes";
                    } 
               else 
                  if (getn() ==6)
                  { a = "sabado";
                    }
               else 
                  if (getn() ==7)
                  { a = "domingo";
                    } 
                    else
                        if (getn() > 7)
                        {
                        a = "ERROR, La Semana Tiene 7 Días";
                    }
            }
             return a;
        }
       
    
    
   public void mostar_resultado()
         { System.out.println("el dia de semana es:" +calcD());
         } 
           
            
        } 
