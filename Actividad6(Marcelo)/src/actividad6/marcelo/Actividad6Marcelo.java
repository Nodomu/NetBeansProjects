/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6.marcelo;
import javax.swing.JOptionPane;
/**
 *
 * @author HP-FLIABC
 */
public class Actividad6Marcelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila prueba = new Pila();
        int op=0;
        
        try
        {
            do
            {
                op = Integer.parseInt(JOptionPane.showInputDialog(
                "|MENÚ PRINCIPAL| \n"
                +" 1. Registrar pelicula \n"
                +" 2. Mostrar los proximos estrenos \n"
                +" 3. Mostrar los estrenos antiguos \n"
                +" 4. Totales por categoría \n"        
                +" 5. Eliminar información por categpría \n"
                +" 6. SALIR \n"
                +"POR FAVOR INGRESE SU OPCIÓN"        
                ));
                
                switch(op)
                {
                    case 1:
                       prueba.setPush();
                    break;
                    case 2:
                       prueba.getEstrenosNuevos();
                    break;
                    case 3:
                        prueba.getEstrenosAntiguos();
                    break;
                    case 4:
                       prueba.getMostrarCategoria();
                    break;
                    case 5:
                        prueba.setPop();
                    break;
                    case 6:
                       JOptionPane.showMessageDialog(null, "¡¡¡ADIOS!!!"); 
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "¡¡¡OPCIÓN INVALIDA!!! \n", "¡¡¡SE HA PRODUCIDO UN ERROR!!!", JOptionPane.ERROR_MESSAGE);
                }
            }
            while(op!=6);
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null, "Información: \n" + e.getMessage(),"Error!",JOptionPane.WARNING_MESSAGE);  
        }
        System.exit(0);
    }
    
}
