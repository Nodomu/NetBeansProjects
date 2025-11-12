/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpilas;

/**
 *
 * @author WIND10
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Stack;
import javax.swing.JOptionPane;


public class programa {
 
    Stack <nodo> tope;
    int c, o;
    programa(){
        tope =new Stack();
        c = 0;  o = 0;
      }
    
    nodo getId(int id) {
        nodo aux;
        int i = 0;
        while (i < tope.size()) {
            aux = (nodo) tope.get(i);
            if (aux.getId()== id) {
                return aux;
            }
            i++;
        }
        aux = null;
        return aux;
    }
    
    void setPush() {
        nodo q = Ingresar();
        int pos = tope.indexOf(q);
        if (pos == -1) {
            tope.push(q);
            JOptionPane.showMessageDialog(null,
                    "Elemento registrado!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "El cliente ya se encuentra registrado!");
        }
    }
    
    nodo Ingresar(){
    int id;
    String n;
    float du;
    int e;
    int v=0;
    nodo q= null, p=null;
    
    do{
         id = Integer.parseInt(JOptionPane.showInputDialog(null, "entre el id de la pelicula"));
         p = getId(id);
            if (p != null) {
                JOptionPane.showMessageDialog(null, "Este id ya existe! intente nuevamente", "Error!", JOptionPane.ERROR_MESSAGE);
            }
    }while(p!= null);
   
    n = JOptionPane.showInputDialog(null, "entre el nombre de la pelicula");
    du = Float.parseFloat(JOptionPane.showInputDialog(null, "entre la duracion de la pelicula"));
    q = new nodo(id, n, du);
    return q; 
    }

    void mostrarInfo(nodo aux){
        String data="";
        if(aux!=null){
            data="Datos del espectador \n";
            data+="Id pelicula: "+aux.getId()+"\n";
            data+="Nombre de la pelicula: "+aux.getNom()+"\n";
            data+="Duracion de la pelicula: "+aux.getDur()+"\n";
            data+="Edad: "+aux.getEdad()+"\n";
            data+="Valor boleta: "+aux.getValor()+"\n";            
           
            JOptionPane.showMessageDialog(null, data);
        }
    }
    
    void getEstrenosA() {
        if (!tope.empty()) {
            nodo p;
             c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de estrenos antiguos que desea ver"));
            int i = 0;
            while (i < c) {
                p = (nodo) tope.get(i);
                mostrarInfo(p);
                i++;
                if (i == tope.size()) {
                    break;
                }
            }
            if (i != c) {
                JOptionPane.showMessageDialog(null, "Ya se alcanzo el maximo de peliculas y no se puede mostrar mas informacion");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "La pila no tiene elementos!");
        }
        setArchivoA();
    }
    
     void getEstrenosN() {
        if (!tope.empty()) {
            nodo q;
             o = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de proximos estrenos que desea ver"));
            int i = 0;
            int j = tope.size() - 1;
            while (i < o) {
                q = (nodo) tope.get(j);
                mostrarInfo(q);
                j--;
                i++;
                if (j == -1) {
                    break;
                }
            }
            if (i != o) {
                JOptionPane.showMessageDialog(null, "Ya se alcanzo el maximo de extrenos y no se puede mostrar mas informacion");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "La pila no tiene elementos!");
        }
        setArchivoN();
    }
  
    void setPopCat() {
        if (!tope.empty()) {
            int cont = 0;
            String cat = "";
            String categoria[] = {"Niños", "Adolescentes", "Adultos"};
            cat = (String) JOptionPane.showInputDialog(
                    null, "Seleccione categoria:",
                    "Ingrese categoria",
                    JOptionPane.QUESTION_MESSAGE, null,
                    categoria, categoria[0]);
            nodo q;
            for (int i = 0; i < tope.size(); i++) {
                q = (nodo) tope.get(i);
                if (q.getCate().equals(cat)) {
                    tope.remove(q);
                    i--;
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null,
                        "No se encontro ninguna pelicula para esta categoria");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Se eliminaron " + cont + " peliculas para la categoria " + cat);

            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "La pila no tiene elementos!");
        }
    } 
    
    void getMostrarCat() {
        if (!tope.empty()) {
            String cat = "";
            float suma = 0, pro = 0;
            int con = 0;
            String categoria[] = {"Niños", "Adolescentes", "Adultos"};
            cat = (String) JOptionPane.showInputDialog(
                    null, "Seleccione categoria:",
                    "Ingrese categoria",
                    JOptionPane.QUESTION_MESSAGE, null,
                    categoria, categoria[0]);
            nodo aux;
            int i = 0;
            while (i < tope.size()) {
                aux = (nodo) tope.get(i);
                if (aux.getCate().equals(cat)) {
                    suma += aux.getValor();
                    con++;
                }
                i++;
            }

            pro = suma / con;
            JOptionPane.showMessageDialog(null, "Para la categoria " + cat + "\n"
                    + "Total Recaudado: " + suma + "\n"
                    + "Promedio: " + pro);
        } else {
            JOptionPane.showMessageDialog(null,
                    "La pila no tiene elementos!");
        }
    }
    
    void setArchivoN(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        if(tope==null){            
            try{
                fichero = new FileWriter("c:/Estrenos/nuevos.txt");
                pw = new PrintWriter(fichero);
                pw.println("Pila vacia!");
                JOptionPane.showMessageDialog(
                null, "Datos guardados al archivo!", 
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);                                
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            try{
                
                int j=tope.size();
                int i = j-1;
                fichero = new FileWriter("c:/Estrenos/nuevos.txt");
                pw = new PrintWriter(fichero);
                
                int q = tope.size()-o;
                do{
                    nodo p=tope.get(i);
                    pw.println(""+p.getId());
                    pw.println(""+p.getNom());
                    pw.println(""+p.getDur());
                    pw.println(""+p.getEdad());
                    pw.println(""+p.getValor());
                    pw.println(""+p.getCate());
                    i--;
                    j--;
                }while(j>q);
                JOptionPane.showMessageDialog(
                null, "Datos guardados al archivo!", 
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);                                
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
     void setArchivoA(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        if(tope==null){            
            try{
                fichero = new FileWriter("c:/Estrenos/antiguos.txt");
                pw = new PrintWriter(fichero);
                pw.println("Pila vacia!");
                JOptionPane.showMessageDialog(
                null, "Datos guardados al archivo!", 
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);                                
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            try{
                int i = 0;
                fichero = new FileWriter("c:/Estrenos/antiguos.txt");
                pw = new PrintWriter(fichero);
                
                do{
                    nodo p=tope.get(i);
                    pw.println(""+p.getId());
                    pw.println(""+p.getNom());
                    pw.println(""+p.getDur());
                    pw.println(""+p.getEdad());
                    pw.println(""+p.getValor());
                    pw.println(""+p.getCate());
                    i++;
                    
                }while(i<c);
                
                JOptionPane.showMessageDialog(
                null, "Datos guardados al archivo!", 
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);                                
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
