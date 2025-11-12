package supermercado;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ppal_supermercado {

    public static void mostrarVector(codigo_supermercado objeto) {
        String datosVector = "";

        for (int i = 0; i <= objeto.vector.length - 1; i++) {
            datosVector = datosVector + String.valueOf("Nombre: " + objeto.vector[i].getNomprod() + "\n"
                    + "Cantidad: " + objeto.vector[i].getCant() + "\n"
                    + "Precio unitario: " + objeto.vector[i].getPrecioU() + "\n"
                    + "Total: " + objeto.vector[i].getTotal() + "\n" + "-------------------------------" + "\n");
        }

        JOptionPane.showMessageDialog(null, "============  PRODUCTOS ============" + "\n" + datosVector);
    }                                                               

    public static void main(String arg[]) {

        int op;
        codigo_supermercado objeto = null;

        objeto = new codigo_supermercado();
        mostrarVector(objeto);

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "=========================  MENU PRINCIPAl  =========================\n"
                    + "1. Mostrar productos Ordenado Ascendentemente Precio Unitario\n"
                    + "(Nombre Producto, Cantidad, Precio Unitario, Total).\n"
                    + "2. Mostrar estadísticas: Promedio recaudo, total recaudado.\n"
                    + "3. Mostrar producto (Toda la información)\n"
                    + "cantidad disponible y menos cantidades disponibles.\n"
                    + "4. Mostrar la cantidad de productos que tiene menor y mayor valor \n"
                    + "total del Promedio recaudado.\n"
                    + "5. Salir."));
            switch (op) {
               
                case 1:
                    objeto.burbuja();
                    mostrarVector(objeto);
                    break;
                case 2:

                    objeto.estadistica();

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, objeto.cmenor() + "\n" + "--------------------" + "\n" + "\n" + objeto.cmayor());
                    break;
                case 4:
                    
                    JOptionPane.showMessageDialog(null,  objeto.pmenor() + "\n" + "--------------------" + "\n" + "\n" + objeto.pmayor());

                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "saliendo");
                    break;

            }

        } while (op != 5);
        System.exit(0);

    }

}
