/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import javax.swing.JOptionPane;
/**
 *
 * @author HP-FLIABC
 */
public class probador {
    
    public static void main(String[]args)
    {
        int op=0;
        lista probador = new lista();
        do
        {
         op=Integer.parseInt(JOptionPane.showInputDialog(
         "MENU DE OPCIONES\n"
         +"1. Agregar la información del niño y de su representante. \n"
         +"2. Insertar la información de un nuevo niño. \n"
         +"3. Agregar la información del niño y de su representante (Al principio de la lista). \n"
         +"4. Buscar la información de talla y peso por identificación del niño o representante. \n"         
         +"5. Eliminar la información de un niño dado su número de identificación. \n"         
         +"6. Ordenar la información de forma ascendentemente. \n"         
         +"7. Mostrar todos los elementos de la lista con la información completa. \n"        
         +"8. Reporte de cantidad e información de cada niño que está bajo de talla (Por municipio).\n"         
         +"9. Reporte de cantidad e información de cada niño que está bajo de peso (Por municipio).\n"         
         +"10. Salir."         
         ));
         switch(op)
         {
             case 1:
                 probador.aggEnd();
             break; 
             case 2:
                 probador.aggMiddle();
             break;
             case 3:
                 probador.aggInicio();
             break;
             case 4:
                 int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la identificación del representante o del niño"));
                 String m = probador.getInformacionTyP(id);
                 JOptionPane.showMessageDialog(null, m);
             break;
             case 5:
                 int idNiño = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la identificación del niño"));
                 probador.setEliminar(idNiño);
             break;
             case 6:
                 probador.ordenamiento();
             break;
             case 7:
                 probador.getMostrarAll();
             break;
             case 8:
                 probador.getReporte1();
             break;
             case 9:
                 probador.Reporte2();
             break;
             default:
             JOptionPane.showMessageDialog(null, "ADIOS!");
             break;    
         }
        }
     while(op!=10);
     System.exit(0);
    }
}
