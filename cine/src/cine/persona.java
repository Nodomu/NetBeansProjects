package cine;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class persona {

    public ArrayList<objeto> vector;

    public persona() {
        this.vector = new ArrayList();
    }

    public void llenar() {

        int edad = (int) (Math.random() * 60 + 5);

        int valor = 0;
        if (edad <= 10) {

            valor = 3000;
            JOptionPane.showMessageDialog(null, "edad: " + edad + "\n" + "valor boleta: " + valor);

        }
        if (edad >= 11 && edad <= 17) {
            valor = 7000;
            JOptionPane.showMessageDialog(null, "edad: " + edad + "\n" + "valor boleta: " + valor);

        }

        if (edad >= 18) {
            valor = 9000;
            JOptionPane.showMessageDialog(null, "edad: " + edad + "\n" + "valor boleta: " + valor);

        }
        objeto datos = new objeto(edad, valor);
        vector.add(datos);
        edad = 0;
        valor = 0;
    }

    public void categoria() {
        int i;

        int cotn = 0;
        int cona = 0;
        int conadul = 0;

        float suman = 0;
        float sumaado = 0;
        float sumaadu = 0;

        double pron = 0;
        double proado = 0;
        double proadu = 0;

        for (i = 0; i < vector.size(); i++) {

            if (vector.get(i).getEdad() <= 10) {

                cotn++;
                suman = vector.get(i).getValorBoleta() + suman;

            }
            if (vector.get(i).getEdad() >= 11 && vector.get(i).getEdad() <= 17) {
                cona++;
                sumaado = vector.get(i).getValorBoleta() + sumaado;
            }

            if (vector.get(i).getEdad() >= 18) {
                conadul++;

                sumaadu = vector.get(i).getValorBoleta() + sumaadu;
            }
        }

        pron = suman / cotn;
        proado = sumaado / cona;
        proadu = sumaadu / conadul;

        JOptionPane.showMessageDialog(null, "categoría Niños" + "\n" + "promedio recaudo : " + pron + "\n"
                + "total recaudado: " + suman + "\n" + "\n"
                + "categoría Adolescentes" + "\n" + "promedio recaudo : " + proado + "\n" + "total recaudado: " + sumaado + "\n" + "\n"
                + "categoría Adultos" + "\n" + "promedio recaudo% : " + proadu + "\n" + "total recaudado:" + sumaadu + "\n" + "\n");
    }

    public void burbuja() {

        objeto temp = null;
        objeto datos = null;
        int i, j;
        for (i = 0; i < vector.size(); i++) {
            for (j = 0; j < (vector.size() - 1); j++) {
                if ((vector.get(j).getEdad()) > vector.get(j + 1).getEdad()) {

                    temp = new objeto(vector.get(j).getEdad(), vector.get(j).getValorBoleta());

                    datos = new objeto(vector.get(j + 1).getEdad(), vector.get(j + 1).getValorBoleta());

                    vector.set(j, datos);

                    vector.set(j + 1, temp);

                }
            }
        }

    }

    public void eliminar() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Eliminar categoria.\n"
                + "1.niños\n" + "2.adolecentes\n" + "3.adulto\n"));

        switch (op) {
            case 1:
                for (int i = 0; i < vector.size(); i++) {
                    if (vector.get(i).getEdad() <= 10) {

                        vector.remove(i);
                        i--;
                    }
                }
                break;

            case 2:
                for (int i = 0; i < vector.size(); i++) {
                    if (vector.get(i).getEdad() >= 11 && vector.get(i).getEdad() <= 17) {

                        vector.remove(i);
                        i--;
                    }
                }

                break;
            case 3:
                for (int i = 0; i < vector.size(); i++) {
                    if (vector.get(i).getEdad() >= 18) {

                        vector.remove(i);
                        i--;
                    }
                }
                break;

        }
       

    }

    public void Mostraredad() {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("edad a buscar"));
        String in = "";
        int v = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).getEdad() == edad) {

                in += "\n" + "edad: " + vector.get(i).getEdad() + "\n" + "valor Boleta: " + vector.get(i).getValorBoleta() + "\n";
                v++;
            }
        }

        if (v != 0) {
            JOptionPane.showMessageDialog(null, in);
        } else {
            JOptionPane.showMessageDialog(null, "edad no registrada en la fila !! ");

        }

    }

    void getMostrar() {
        int i;
        String info = "";
        int cott = 1;
        for (i = 0; i < vector.size(); i++) {
            info += "\n" + "pernona numero " + cott + "\n" + "edad: " + vector.get(i).getEdad() + "\n" + "valor Boleta: " + vector.get(i).getValorBoleta() + "\n" + "---------------------------";
            cott = 1 + cott;
        }
        JOptionPane.showMessageDialog(null, info);
    }
}
