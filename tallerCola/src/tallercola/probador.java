
package tallercola;

/**
 *
 * @author Macla
 */
import javax.swing.JOptionPane;
public class probador {

    
    public static void main(String[] args) {
        int op=0;
         programa mc = new programa();
try{
    do{

op = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n"
        + "1. Registrar producto.\n"
        + "2. Mostrar productos.\n"
        + "3. Mostrar estadisticas.\n"
        + "4. Producto con mayor y menor cantidad disponible.\n"
        + "5. Productos con mayor y menor valor total del Promedio. \n"
        + "6. Salir"));
    switch(op){
            case 1:
                mc.setIngresar();
            break;
             case 2:
                 mc.MostrarT();
            break;
             case 3:
                 mc.MostrarEst();
            break;
             case 4:
                 mc.Mym();
            break;
             case 5:
                 mc.MostrarM();
            break;
             case 6:
            JOptionPane.showMessageDialog(null, "Adios!");
            break;
            default:
            JOptionPane.showMessageDialog( null, "Opción Invalida!", "Error!", JOptionPane.ERROR_MESSAGE);
    }
    }while(op!=6);
    } catch (Exception e) {
        }
     System.exit(0);
      }
    }
    

