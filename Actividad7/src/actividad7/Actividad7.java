/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-FLIABC
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op=0;
        Cola prueba = new Cola();
        
    try
    {
        do
        {
         op=Integer.parseInt(JOptionPane.showInputDialog(
         ".MENÚ PRINCIPAL. \n"
         +"1. Registrar el producto. \n"
         +"2. Mostrar los productos. \n"
         +"3. Mostrar las estadisticas. \n"
         +"4. Producto con mayor y menor cantidad disponible. \n"
         +"5. Productos con mayor y menor valor del total del promedio. \n"
         +"6. SALIR"        
         ));
         
         switch(op)
         {
             case 1:
                 prueba.setIngresar();
             break;
                 
             case 2:
                 prueba.MostrarAll();
             break;
                 
             case 3:
                 prueba.Mostrar();
             break;
                 
             case 4:
                 prueba.MayorYMenor();
             break;
                 
             case 5:
                 prueba.MostrarCantidad();
             break;
                 
             case 6:
                 JOptionPane.showMessageDialog(null, "¡ADIÓS!");
             break;
             default:
                 JOptionPane.showMessageDialog(null, "Esta es una opción invalida", "¡¡¡Se ha producido un ERROR!!!", JOptionPane.ERROR_MESSAGE);
         }
        }
         while(op!=6);
    }
     catch(Exception e)
     {
         
     }
    System.exit(0);
    }
    
}
