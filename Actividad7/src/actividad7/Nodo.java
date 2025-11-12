/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

/**
 *
 * @author HP-FLIABC
 */
public class Nodo {
    private int cantidad, precioUnidad;
    private String nombreProducto;
    private float total;
    Nodo sig, ant;
    
    public Nodo()
    {
        nombreProducto="";
        cantidad=0;
        precioUnidad=0;
        total=0;
        sig=ant=null;
    }

    public Nodo(int cantidad, int precioUnidad, String nombreProducto, float total) {
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.nombreProducto = nombreProducto;
        this.total = total;
        sig=ant=null;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
