package cine;

import javax.swing.JOptionPane;

public class objeto {

    private int edad;
    private float valorBoleta;

    public objeto(int edad, float valorBoleta) {
        this.edad = edad;
        this.valorBoleta = valorBoleta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getValorBoleta() {
        return valorBoleta;
    }

    public void setValorBoleta(float valorBoleta) {
        this.valorBoleta = valorBoleta;
    }

}
