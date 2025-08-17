
package sistemaRegistrarUsuario;


public class Usuario {
    private String nombre;
    private String correo;
    private int edad;

    public Usuario(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       
        /*
        Metodo trim() se utiliza para eliminar espacios en blanco al inicio y al final de una cadena de texto.
        este metodo no modifica la cadena original, sino que devuelve una nueva cadena sin los espacions en blanco
        en ambos extremos.
        */
        if(nombre == null || nombre.trim().isEmpty()){
            System.out.println("Nombre invalido");
        }else{
         this.nombre = nombre;
        }
        
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (!correo.contains("@")) {
            System.out.println("Correo invalido");
        } else {
            this.correo = correo;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("Edad invalida");
        } else {

            this.edad = edad;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + ", Correo: " + correo + ", Edad: " + edad);
    }

   
    
    
}
