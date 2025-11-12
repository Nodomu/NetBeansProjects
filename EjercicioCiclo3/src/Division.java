
public class Division {
    private
          double dd;
          double ds;
          
        public  Division()
        { 
          dd = 0; 
          ds = 0;
        }
        
        void set_dividendo(double x)
        { 
            dd = x;
        }
        
        void set_divisor(double y)
        { 
            ds = y;
        }
             
        double get_dividendo()
        { 
            return dd ;
        }
                  
         public double get_divisor()
        {
            return ds ;
        }
         
         public double calular_Cociente()
         {
             int c = 0;
             double r = 0;
             while (dd >= ds)
             { 
                 dd = dd - ds;
                 c++;
             }
         return c;}
}
    
   

