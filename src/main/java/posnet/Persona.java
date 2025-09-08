
package posnet;


public class Persona {
  private final String DNI;
  private final String nombre;
  private final String apellido;
  private final String telefono;
  private final String mail;

    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    
    public String nombreCompleto(){
     return nombre + " " + apellido;
    }
  
}
