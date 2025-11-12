
package clubfutbol;

//Creamos nuestra super clase, la cual tendrá los principales atributos
public class FutbolC {
    String Nombre, Apellido;
    int edad;

    /*Aquí creamos nuestro metodo constructor e inicializamos nuestros atributos, usando la palabra
      usando la palabra reservada this */ 
    public FutbolC(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    FutbolC() {
    }

    //Sus respectivos metodos de pedír y obtener
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    /* Creamos un metodo mostrar para mostrar los datos base de la clase, los cuales unicamente pertenecen
       a esta*/
    public String MOSTRAR()
    {
        return "Nombre" +Nombre +"\n" +"Apellido" +Apellido +"\n" +"Edad" +edad;
    }
}
