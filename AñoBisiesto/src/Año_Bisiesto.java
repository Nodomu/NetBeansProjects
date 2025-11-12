public class Año_Bisiesto
{
    private int x;

 
    public Año_Bisiesto()
    {
        x = 0;
    }
    
    public void setx(int y)
    {
        x = y;
    }
     
    public int getx()
    { return x;
    } 
    
    public String deta_B()
    { String año_B = " ";
       
        if (getx() % 100 == 0)
        
          { if (getx() % 400 == 0)
           { año_B = "año bisiesto";
            }
               
           
        
         else
          { año_B = "año no bisiesto";
            }
        }
     
         else 
           { if (getx() % 4 ==0)
            { año_B = "año bisiesto";
            }
            else 
            { año_B = "año no bisiesto";
            }
            
        }return año_B;
    }
    
    public void mostrar_resultado()
    { System.out.println("el año es:" +deta_B());
    }
    
}