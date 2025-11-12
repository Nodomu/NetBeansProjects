/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6.marcelo;

/**
 *
 * @author HP-FLIABC
 */
public class Nodo {
   private int idPelicula;
   private int edad;
   private String nombrePelicula;
   private String categoria;
   private float duracion;
   private float valorBoleta;

public Nodo()
{
    idPelicula = 0;
    edad = 0;
    nombrePelicula = "";
    categoria = "";
    duracion = 0;
    valorBoleta = 0;
}
   
    public Nodo(int idPelicula, String nombrePelicula, float duracion) 
    {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.duracion = duracion;
        do
        {
            this.edad = (int)(Math.random() * 60);
        }
        while(this.edad<5);
        if(edad>=5 && edad<=10)
        {
            this.valorBoleta=3000;
            this.categoria="Niños";
        }
        else
            if(edad>=11 && edad<=17)
            {
                this.valorBoleta=7000;
                this.categoria="Adolecente";
            }
        else
            if(edad>=18)
            {
                this.valorBoleta=9000;
                this.categoria="Adultos";
            }
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getValorBoleta() {
        return valorBoleta;
    }

    public void setValorBoleta(float valorBoleta) {
        this.valorBoleta = valorBoleta;
    }
   
   
}
