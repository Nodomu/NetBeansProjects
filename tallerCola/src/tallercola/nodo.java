
package tallercola;

/**
 *
 * @author Macla
 */
public class nodo {
 
    private String nom;
    private int cant;
    private int precio;
    private float total;
    nodo sig, ant;
public nodo(){
    nom="";
    cant=0;
    precio=0;
    total=0;
    sig= ant=null;
}
    public nodo(String nomprod, int cant, int precioU, float total) {
        this.nom = nomprod;
        this.cant = cant;
        this.precio = precioU;
        this.total = total;
         sig= ant=null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }


    
    
}
