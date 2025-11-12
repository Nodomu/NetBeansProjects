
package metodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class vector {
    ArrayList <productos> vec;
    
    vector()
    {
            vec = new ArrayList();
            JOptionPane.showInputDialog("Vector inicializado");
    }
    
    int getPos(int cod)
    {
        int i;
        productos aux=null;
        for(i=0; i<vec.size(); i++)
        {
            aux=(productos) vec.get(i);
            if(aux.codp==cod)
                return i;
        }
        return -1;
    }
    
    void setAdd()
    {
        int cod, pos=1;
        String nom;
        float valor;
        productos aux=null;
        do
        {
            cod=Integer.parseInt(JOptionPane.showInputDialog("Igrese el codigo a registrar: "));
            pos=getPos(cod);
            if(pos>=0)
                JOptionPane.showMessageDialog(null, "Este codigo ya existe!!! INTENTE NUEVAMENTE");
        }while(pos!=-1);
        
        nom = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        valor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del producto: "));
        aux = new productos(cod, nom, valor);
        vec.add(aux);
        JOptionPane.showMessageDialog(null, "Elemento agregado al final");
    }
    
    void getInfo(int cod)
    {
        int pos;
        String aux;
        productos p;
        pos=getPos(cod);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, "NO EXISTE!!!");
        else
        {
            p=(productos) vec.get(pos);
            aux="La información del producto en la posición "+pos+"es: \n";
            aux+="Códicgo del producto: "+p.codp+"\n";
            aux+="Nombre del producto: "+p.nomp+"\n";
            aux+="Precio del producto: "+p.costo+"\n";
            JOptionPane.showMessageDialog(null, aux);
        }
    }
    
    void getAll()
    {
        int i;
        productos aux=null;
        for(i=0; i<vec.size(); i++)
        {
            aux = (productos) vec.get(i);
            getInfo(aux.codp);
        }
    }
    
    void setEliminar(int cod)
    {
        int pos=getPos(cod);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, "No existe!!!");
        else
        {
            vec.remove(pos);
            JOptionPane.showMessageDialog(null, "Elemento eliminado");
        }
    }
}