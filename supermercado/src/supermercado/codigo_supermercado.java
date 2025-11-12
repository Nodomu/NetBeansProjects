package supermercado;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class codigo_supermercado {

    objeto_supermercado vector[];

    codigo_supermercado() {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digite el Número de Elementos del Vector:"));
        vector = new objeto_supermercado[tamaño];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = new objeto_supermercado(" ", -1, -1, -1);
        }
        int cot = 1;
        for (int i = 0; i < vector.length; i++) {

            int cantidad = (int) (Math.random() * 12 + 1);

            int precio = (int) (Math.random() * 25000 + 1000);

            String nombre = JOptionPane.showInputDialog("Dijite El Nombre Del Producto" + cot);
            JOptionPane.showMessageDialog(null, nombre + "\n" + "Catidad generada Del Producto: " + cantidad + "\n" + "Precio generado Del Producto: " + precio);

            float total = precio * cantidad;

            vector[i].setNomprod(nombre);
            vector[i].setCant(cantidad);
            vector[i].setPrecioU(precio);
            vector[i].setTotal(total);
            JOptionPane.showMessageDialog(null, "-- Productos" + cot + " --Pasados por El Escáner Almacenado.");
            cot++;
        }
        JOptionPane.showMessageDialog(null, "Vector Lleno.... ");
    }

    public void burbuja() {
        objeto_supermercado temp = null;

        int i, j;
        for (i = 0; i < vector.length; i++) {
            for (j = 0; j < vector.length - 1; j++) {
                if (vector[j].getPrecioU() > vector[j + 1].getPrecioU()) {
                    temp = new objeto_supermercado(vector[j].getNomprod(),
                            vector[j].getCant(), vector[j].getPrecioU(), vector[j].getTotal());

                    vector[j].setNomprod(vector[j + 1].getNomprod());
                    vector[j].setCant(vector[j + 1].getCant());
                    vector[j].setPrecioU(vector[j + 1].getPrecioU());
                    vector[j].setTotal(vector[j + 1].getTotal());

                    vector[j + 1].setNomprod(temp.getNomprod());
                    vector[j + 1].setCant(temp.getCant());
                    vector[j + 1].setPrecioU(temp.getPrecioU());
                    vector[j + 1].setTotal(temp.getTotal());

                }
            }
        }
    }

    public String cmenor() {
        float m = 99999;
        String resultado = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getCant() < m) {
                m = vector[i].getCant();
                resultado = "======= PRODUCTO CON MENOR CATIDAD =======" + "\n" + "Cantidad: " + vector[i].getCant() + "\n"
                        + "Nombre: " + vector[i].getNomprod() + "\n"
                        + "Precio unitario: " + vector[i].getPrecioU() + "\n"
                        + "Total: " + vector[i].getTotal() + "\n";
            }
        }
        return resultado;
    }

    public String cmayor() {
        float m = 0;
        String resultado = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getCant() > m) {
                m = vector[i].getCant();
                resultado
                        = "======= PRODUCTO CON MAYOR CATIDAD =======" + "\n" + "Cantidad: " + vector[i].getCant() + "\n"
                        + "Nombre: " + vector[i].getNomprod() + "\n"
                        + "Precio unitario: " + vector[i].getPrecioU() + "\n"
                        + "Total: " + vector[i].getTotal() + "\n";
            }
        }

        return resultado;
    }

    public int cantidad_total() {
        int total = 0;
        for (int i = 0; i < vector.length; i++) {
            {
                total += vector[i].getTotal();
            }
        }
        return total;
    }

    public void estadistica() {

        DecimalFormat formato = new DecimalFormat("#.##");

        float promedio = cantidad_total() / vector.length;
        String mostrar = "El total recaudado es: $" + formato.format(cantidad_total()) + "\n"
                + "El promedio recaudado es: %"
                + "" + formato.format(promedio) + "\n";

        JOptionPane.showMessageDialog(null, mostrar);

    }

    public float promedio() {
        float prom = 0;
        float suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = vector[i].getTotal()+suma;
        }
        prom = (suma / vector.length);

        return prom;
    }

    public String pmenor() {
        float m = 99999;
        String resultado = "";
        int mc = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getTotal() < promedio()) {

                resultado += "======= PRODUCTO CON MENOR PROMEDIO =======" + "\n"
                        + "Cantidad: " + vector[i].getCant() + "\n"
                        + "Nombre: " + vector[i].getNomprod() + "\n"
                        + "Precio unitario: " + vector[i].getPrecioU() + "\n"
                        + "Total: " + vector[i].getTotal() + "\n";
                mc++;
            }
        }
        return "promedio recaudado: " + promedio() + "\n" + "La cantidad de productos menor al promedio es : " + mc + "\n"
                + resultado;
    }

    public String pmayor() {
        float m = 0;
        String resultado = "";
        int mc = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getTotal() > promedio()) {

                resultado
                        += "======= PRODUCTO CON MAYOR PROMEDIO =======" + "\n"
                        + "Cantidad: " + vector[i].getCant() + "\n"
                        + "Nombre: " + vector[i].getNomprod() + "\n"
                        + "Precio unitario: " + vector[i].getPrecioU() + "\n"
                        + "Total: " + vector[i].getTotal() + "\n";
                mc++;
            }
        }

        return "La cantidad de productos mayores al promedio es : " + mc + "\n"
                + resultado;
    }

}
