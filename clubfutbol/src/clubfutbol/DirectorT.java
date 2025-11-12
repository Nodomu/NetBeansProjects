
package clubfutbol;

//Una vez más creamos nuetro atributo propio de la clase hija
public class DirectorT extends FutbolC{
    private String posicion;
            int tiempoContrato;
  
   /*Le aplicamos el metodo constructor y su palabra reservada super nuevamente para llamar 
     a los atributos de la clase padre */         
   public DirectorT(String posicion, int tiempoContrato, String Nombre, String Apellido, int edad)
   {
       super(Nombre, Apellido, edad);
       this.posicion = posicion;
       this.tiempoContrato = tiempoContrato;
   }

    DirectorT() {
    }

   //Sus metodos de encapsulado
    public String getPosicion() {
        return posicion;
    }

    public int getTiempoContrato() {
        return tiempoContrato;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }
   
    /* Metodo mostrar re-escrito con los metodos de la clase padre y los de la clase hija usando la palabra
       @Overrride
    */
    @Override
    public String MOSTRAR()
    {
        return "Nombre: " +Nombre +"\n" +"Apellido: " +Apellido +"\n" +"Edad: " +edad +"\n" 
                +"Posicion: " +posicion +"\n" +"Tiempo de contrato: " +tiempoContrato;
                
    }
}
