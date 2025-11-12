
package tallerpilas;

/**
 *
 * @author Macla
 */
import javax.swing.JOptionPane;

public class probador {

   
    public static void main(String[] args) {
      
         programa mc = new programa();
        int op = 0;
        try {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(
                        "MENU PRINCIPAL \n"
                        + "1. Registrar pelicula \n"
                        + "2. Mostrar ultimos estrenos \n"
                        + "3. Mostrar estrenos mas antiguos \n"
                        + "4. Total por categoria \n"
                        + "5. Eliminar una categoria \n"
                        + "6. Salir \n"
                        + "Entre su opción: ?"
                ));

                switch (op) {
                    case 1:
                        mc.setPush();
                        break;
                    case 2:
                        mc.getEstrenosN();
                        break;
                    case 3:
                        mc.getEstrenosA();
                        break;
                    case 4:
                        mc.getMostrarCat();
                        break;
                    case 5:
                        mc.setPopCat();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Adios!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(
                                null, "Opción Invalida!",
                                "Error!",
                                JOptionPane.ERROR_MESSAGE);
                }
            } while (op != 6);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Información: \n" + e.getMessage(),
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
        }
        System.exit(0);
    }

    
}
    

