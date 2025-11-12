/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import javax.swing.JOptionPane;
/**
 *
 * @author Ruben
 */
public class probador {
    
    public static void main(String args[]){
        int op, tam=0;
        grupoE listaEst=null;
        estudiante e = new estudiante();
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú Principal \n"+
            "1. Crear vector estático de estudiantes \n"+
            "2. Llenar vector de estudiantes \n"+
            "3. Mostar vector de estudiantes \n"+
            "4. Agregar asignatura al estudiante \n"+
            "5. Mostrar información individual del estudiante \n"+
            "6. Eliminar asignatura del estudiante \n"+ 
            "0. Salir \n"+
            "Entre su opción: ?"        
            ));
            
            switch(op){
                case 1:
                    tam = Integer.parseInt(JOptionPane.showInputDialog(
                    "Entre el tamaño del vector: "));
                    listaEst = new grupoE(tam);
                break;
                case 2:
                    listaEst.addEst();
                break;
                case 3:
                    listaEst.mostrarEst();
                break;
                case 4:
                    listaEst.AgregarAsignatura();
                break;
                case 5:
                    listaEst.mostrarIndividual();
                break;
                case 6:
                    listaEst.eliminarAsg();
                break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Adios!!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida!!");
            }
            
        }while(op!=7);
        System.exit(0);
    }
}
