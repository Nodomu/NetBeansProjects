package atributos;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Vector {
    equipo v[];    
    Vector()
    {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Entre el tamaño del vector: "));
        v = new equipo[tam];
        int i;
        for (i=0; i<v.length; i++)
            v[i] = new equipo("", 0, "");
    }
    
    int getBuscarEquipo(String nombre)
    {
        //String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo: ");
        int i;
        for(i=0; i<v.length; i++)
        {
            if(v[i].nombreequipo.equalsIgnoreCase(nombre));
            return i;
        }
        return -1;
    }
    
    void setLlenarV()
    {
        int i, pos=-1;
        String nombre;
        for(i=0; i<v.length; i++)
        {
            do{
             nombre=JOptionPane.showInputDialog("Ingrese el nombre del equipo en la posición" +i+": ");
             pos=getBuscarEquipo(nombre);
             if(pos>0)
                 JOptionPane.showInputDialog(null, "Este nombre de equipo ya existe!!!  <<Intente de nuevo>>");
            }while(pos!=-1);
            v[i].nombreequipo = nombre;
            v[i].partidosGanados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de campeonatos ganados para la"
                    + "posición" +i+":"));
            v[i].categoria = JOptionPane.showInputDialog(null, "Ingrese la categoría del equipo (A ó B) en la posición"+i+":");
        }
    }
    
    //Metodo de ordenamiento de burbuja en forma ascendente
    void setOrdenar()
    {
        int i,j, ganados;
        String nombre, cat;
        for(i=0; i<v.length; i++){
           for(j=0; i<(v.length-1); j++)
           {
               if(v[j].partidosGanados >= v[j+1].partidosGanados)
               {
                   nombre=v[j].nombreequipo;
                   ganados=v[j].partidosGanados;
                   cat=v[j].categoria;
                   
                   //Pasar lo de la posición siguiente a la anterior
                   v[j].nombreequipo=v[j+1].nombreequipo;
                   v[j].partidosGanados=v[j+1].partidosGanados;
                   v[j].categoria=v[j+1].categoria;
                   
                   //Pasar lo dela posicion anterior a la siguiente
                   v[j+1].nombreequipo=nombre;
                   v[j+1].partidosGanados=ganados;
                   v[j+1].categoria=cat;
               }
           }
    }
        
}
    void getMostrar()
    {
        int i;
        String aux="";
        for(i=0; i<v.length; i++)
        {
            aux = "La posición del equipo en la posición" +i+ " es: \n";
            aux += "Nombre del quipo: " +v[i].nombreequipo +"\n";
            aux += "Numero de campeonatos ganados: " +v[i].partidosGanados +"\n";
            aux += "La categoría del equipo es: " +v[i].categoria +"\n";
            JOptionPane.showMessageDialog(null, aux);
            aux="";
                    
        }
    }
    
    void setBorrar()
    {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo que desea eliminar: ");
        int pos = getBuscarEquipo(nombre);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, "El nombre del equipo no existe!!!");
        else
        {
            v[pos].nombreequipo="";
            v[pos].partidosGanados=-1;
            v[pos].categoria="";
            JOptionPane.showMessageDialog(null, "Se han borrado los datos en la posición: " +pos);
        }
    }
}

