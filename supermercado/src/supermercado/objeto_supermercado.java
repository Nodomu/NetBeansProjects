package supermercado;

public class objeto_supermercado {

    private String nomprod;
    private int cant;
    private int precioU;
    private float total;

    public objeto_supermercado(String nomprod, int cant, int precioU, float total) {
        this.nomprod = nomprod;
        this.cant = cant;
        this.precioU = precioU;
        this.total = total;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecioU() {
        return precioU;
    }

    public void setPrecioU(int precioU) {
        this.precioU = precioU;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
