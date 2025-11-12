
package clubfutbol;

/*Declaramos un atributo propio de la clase hija, ya que en la clase padre tenemos declarados
  los demás atributos*/
public class Jugador extends FutbolC{
    private int nDorsal;
            
    /*Declaramos y creamos nuestro constructor de la clase hija y aparece la palabra reservada "super"
      la cual nos sirve para llamar a los atributos de la clase padre */
    public Jugador(int nDorsal, String Nombre, String Apellido, int edad)
    {
        super(Nombre, Apellido, edad);
        this.nDorsal = nDorsal;
    }

    Jugador() {
    }

    //Su respectivo encapsulado
    public int getnDorsal() {
        return nDorsal;
    }

    public void setnDorsal(int nDorsal) {
        this.nDorsal = nDorsal;
    }
    
    /*Aparece el metodo @Override el cual sirve para reescribir el metodo MOSTRAR de la clase padre
      y agregar el mostrar del atributo de la clase hija*/
    @Override
    public String MOSTRAR()
    {
       return "Nombre" +Nombre +"\n" +"Apellido" +Apellido +"\n" +"Edad" +edad +"\n"
               +"Numero de Dorsal: " +nDorsal; 
    }
}
