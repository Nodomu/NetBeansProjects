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
public class probar {
 
    public static void main(String args[])
    {
        int op, cod;
        vector vecM=null;
        do
        {
            op= Integer.parseInt(JOptionPane.showInputDialog(
            "Menú principal \n"
            +"1. Iniciar vector. \n"
            +"2. Agregar elemento al vector. \n"
            +"3. Buscar elemento. \n"
            +"4. Mostrar Vector. \n"
            +"5. Eliminar elemento. \n"
            +"6. Salir. \n"
            +"Ingrese su opción"
            ));
            
            switch(op)
            {
                case 1:
                    vecM = new vector();
                break;
                    
                case 2:
                    vecM.setAdd();
                break;
                    
                case 3:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingresar codigo a buscar: "));
                    vecM.getInfo(cod);
                break;
                    
                case 4:
                    vecM.getAll();
                break;
                    
                case 5:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingresar código a eliminar"));
                    vecM.setEliminar(cod);
                break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "Adiós!!!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");
            }
            
        }while(op!=6);
        System.exit(0);
    }
}
