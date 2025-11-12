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
        int op;
        lista prueba =  new lista();
        
        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog(
            "MENÚ PRINCIPAL \n"+
            "1. Registro de servicios \n"+        
            "2. Retirar información del paciente \n"+        
            "3. Registro historico (HISTORIAL) \n"+
            "4. Orden de atención \n"+
            "5. Informe diario total de citas \n"+        
            "6. SALIR \n"+
            "INGRESE SU OPCIÓN: ?"
            ));
            switch(op)
            {
                case 1:
                    prueba.AggEND();
                break;
                case 2:
                    prueba.RetirarInfo();
                break;
                case 3:
                    prueba.Registro();
                break;
                case 4:
                    prueba.ordenDeAtencion();
                break;
                case 5:
                    prueba.Informe();
                break;
                case 6:
                    JOptionPane.showMessageDialog(null, "ADIOS");
                break;
                default:
                JOptionPane.showMessageDialog(null, "¡¡¡OPCION INVALIDA!!!");
            }            
        }
        while(op!=6);
        System.exit(0);
    }
}
