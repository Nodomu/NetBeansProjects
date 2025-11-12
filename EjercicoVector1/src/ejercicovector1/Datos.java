
package ejercicovector1;

public class Datos {
    private 
            int tam;
            int vector[];
            
    public Datos()
    {
        tam = 0;
        vector = null;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getVector(int v) {
        return vector[v];
    }

    public void setVector(int v, int dato) {
        vector[v]=dato;
    }
    
    void CrearV()
    {
        vector = new int[getTam()];
    }
    String Mostrar()
    {
        String D = "|";  
        
        for(int i=0; i<getTam(); i++)
            if(i==getTam()-1)
            {
                D += +getVector(i) + "]";
            }
            else
            {
                D += +getVector(i) + "|";
            }    
         return D;   
    }
}

        