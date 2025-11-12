package cine;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class codigo_cine {

    public ArrayList<objeto> miLista;

    public codigo_cine() {
        this.miLista = new ArrayList();
    }

    public void llenar() {

        int edad = (int) (Math.random() * 60 + 5);

        int valor = 0;
        if (edad <= 10) {

            valor = 3000;
            JOptionPane.showMessageDialog(null, "edad: " + edad + "\n" + "categoria niño: " + valor);

        }
        if (edad >= 11 && edad <= 17) {
            valor = 7000;
            JOptionPane.showMessageDialog(null, "edad: " + edad + "\n" + "categoria Adolescentes: " + valor);

        }

        if (edad >= 18) {
            valor = 9000;
            JOptionPane.showMessageDialog(null, "edad: " + edad + "\n" + "categoria Adultos: " + valor);

        }
        objeto datos = new objeto(edad, valor);
        miLista.add(datos);
        edad = 0;
        valor = 0;
    }

    public void categoria() {
        int i;

        int contado_niño = 0;
        int contado_adolecente = 0;
        int contado_adulto = 0;

        float suma_niño = 0;
        float suma_adolecente = 0;
        float suma_adulato = 0;

        double promedio_niños = 0;
        double promedio_adolecentes = 0;
        double promedio_adultos = 0;

        for (i = 0; i < miLista.size(); i++) {

            if (miLista.get(i).getEdad() <= 10) {

                contado_niño++;
                suma_niño = miLista.get(i).getValorBoleta() + suma_niño;

            }
            if (miLista.get(i).getEdad() >= 11 && miLista.get(i).getEdad() <= 17) {
                contado_adolecente++;
                suma_adolecente = miLista.get(i).getValorBoleta() + suma_adolecente;
            }

            if (miLista.get(i).getEdad() >= 18) {
                contado_adulto++;

                suma_adulato = miLista.get(i).getValorBoleta() + suma_adulato;
            }
        }

        promedio_niños = suma_niño / contado_niño;
        promedio_adolecentes = suma_adolecente / contado_adolecente;
        promedio_adultos = suma_adulato / contado_adulto;

        JOptionPane.showMessageDialog(null, "categoría Niños" + "\n" + "promedio recaudo %: " + promedio_niños + "\n"
                + "total recaudado: " + suma_niño + "\n" + "\n"
                + "categoría Adolescentes" + "\n" + "promedio recaudo %: " + promedio_adolecentes + "\n" + "total recaudado: " + suma_adolecente + "\n" + "\n"
                + "categoría Adultos" + "\n" + "promedio recaudo% : " + promedio_adultos + "\n" + "total recaudado:" + suma_adulato + "\n" + "\n");
    }

    public void burbuja_creditos() {

        objeto temp = null;
        objeto datos = null;
        int i, j;
        for (i = 0; i < miLista.size(); i++) {
            for (j = 0; j < (miLista.size() - 1); j++) {
                if ((miLista.get(j).getEdad()) > miLista.get(j + 1).getEdad()) {

                    temp = new objeto(miLista.get(j).getEdad(), miLista.get(j).getValorBoleta());

                    datos = new objeto(miLista.get(j + 1).getEdad(), miLista.get(j + 1).getValorBoleta());

                    miLista.set(j, datos);

                    miLista.set(j + 1, temp);

                }
            }
        }

    }

    public void eliminar() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Eliminar categoria.\n"
                + "1.niños\n" + "2.adolecentes\n" + "3.adulto\n"));

        switch (op) {
            case 1:
                for (int i = 0; i < miLista.size(); i++) {
                    if (miLista.get(i).getEdad() <= 10) {

                        miLista.remove(i);
                        i--;
                    }
                }
                ;
                break;

            case 2:
                for (int i = 0; i < miLista.size(); i++) {
                    if (miLista.get(i).getEdad() >= 11 && miLista.get(i).getEdad() <= 17) {

                        miLista.remove(i);
                        i--;
                    }
                }
                ;

                break;
            case 3:
                for (int i = 0; i < miLista.size(); i++) {
                    if (miLista.get(i).getEdad() >= 18) {

                        miLista.remove(i);
                        i--;
                    }
                }
                ;
                break;

        }
       

    }

    public void Mostraredad() {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("edad a buscar"));
        String in = "";
        int v = 0;
        for (int i = 0; i < miLista.size(); i++) {
            if (miLista.get(i).getEdad() == edad) {

                in += "\n" + "edad: " + miLista.get(i).getEdad() + "\n" + "valor Boleta: " + miLista.get(i).getValorBoleta() + "\n";
                v++;
            }
        }

        if (v != 0) {
            JOptionPane.showMessageDialog(null, in);
        } else {
            JOptionPane.showMessageDialog(null, "edad no registrada en la fila !! ");

        }

    }

    public void eliminaradulto() {

        for (int i = 0; i < miLista.size(); i++) {
            if (miLista.get(i).getEdad() >= 18) {

                miLista.remove(i);
            }
        }
    }

    void getMostrar() {
        int i;
        String info = "";
        int cott = 1;
        for (i = 0; i < miLista.size(); i++) {
            info += "\n" + "pernona numero " + cott + "\n" + "edad: " + miLista.get(i).getEdad() + "\n" + "valor Boleta: " + miLista.get(i).getValorBoleta() + "\n" + "---------------------------";
            cott = 1 + cott;
        }
        JOptionPane.showMessageDialog(null, info);
    }
}
