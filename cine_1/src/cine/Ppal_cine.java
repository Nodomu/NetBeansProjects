package cine;

import javax.swing.JOptionPane;

public class Ppal_cine {

    public static void main(String args[]) {
        int op, salir;

        codigo_cine lista = new codigo_cine();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú Principal\n"
                    + "1.Registrar una persona en el ArrayList.\n"
                    + "2.Mostrar todos los datos del ArrayList ordenado.\n"
                    + "3.Mostrar todos los elementos de la cola de personas dada una edad.\n"
                    + "4.Totales por categoría y para la categoría seleccionada mostrar promedio recaudo y total recaudado.\n"
                    + "5.eliminar la información del objeto del ArrayList de la categoría seleccionada\n"
                    + "6.Salir.\n\n"));
            switch (op) {
                case 1:

                    lista.llenar();

                    break;
                case 2:
                    
                     lista.burbuja_creditos();

                    lista.getMostrar();

                    break;
                case 3:
                    lista.Mostraredad();

                    break;
                case 4:

                    lista.categoria();

                    break;
                case 5:
                    lista.eliminar();
                    

                    break;
                case 6:
                    salir = JOptionPane.showConfirmDialog(null,
                            "Desea finalizar el programa?");
                    if (salir == 0) {
                        JOptionPane.showMessageDialog(null, "Adios!!!");
                    } else {
                        op = -1;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida!!!");
            }
        } while (op != 6);
        System.exit(0);
    }
}
