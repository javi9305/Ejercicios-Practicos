
package HerenciaEjercicio1;


public class Persona {
   private String nombre;
   private String apellidos;
   private int edad;

   //constructor vacio
    public Persona() {
    }

   //constructor que recibe 3 argumentos
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //Metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo toString sobreescrito
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
    
    public void metodoPrueba(){
        System.out.println("soy metodo prueba");
    }
   
   
   
   
   
}
