/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probador;

import javax.swing.JOptionPane;import metodos.lista;

/**
 *
 * @author HP-FLIABC
 */
public class probador {

    public static void main(String[]args)
    {
        lista cosechas = null;
        cosechas = new lista();
        String tipo;
        int op;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú inicial \n"+
            "1. Registrar cosechas \n"+
            "2. Mostrar las cosechas \n"+
            "3. Eliminar cosechas repetidas pr tipos y por ubicación \n"+        
            "4. Ordenar las cosechas por el numero de hectareas \n"+
            "5. Mostrar el numero de cosechas disponibles para cada ubicación \n"+
            "6. salir \n"+
            "Ingrese su opción: ???"        
            ));
            
            switch(op){
                case 1:
                    cosechas.setAgginicio();
                break;
                case 2:
                    cosechas.getMOSTRAR();
                break;
                case 3:
                    cosechas.setEliminarNodo();
                break;
                case 4:
                    
                break;
                case 5:
                    
                break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Adios!!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCIÓN INVALIDA!!!");
            }
            
        }while(op!=6);
        System.exit(0);
    }
}
