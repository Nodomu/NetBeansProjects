/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-FLIABC
 */
public class Probador {
    public static void main(String[]args)
    {
        lista milista = new lista();
        int op;
        do
        {
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú de opciones"+
            "1. Llenar lista"+        
            "2. Mostrar lista"+
            "3. Eliminar id"+
            "4. Salir"
            ));
            switch(op)
            {
                case 1:
                    milista.setAddInicio();
                break;
                case 2:
                    milista.getMostrarAll();
                break;
                case 3:
                    milista.setEliminarN(op);
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Adiós");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
            }
        }while(op!=4);
        System.exit(0);
    }
}
