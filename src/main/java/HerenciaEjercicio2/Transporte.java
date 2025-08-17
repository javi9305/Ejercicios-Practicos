
package HerenciaEjercicio2;


public class Transporte {
    //Atributos
    private double velocidad;
    private String nombre;

    //Constructor que recibe 2 argumentos
    public Transporte(double velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
    
    public void mostrarMensaje(){
        System.out.println("Soy un medio de transporte");
    }

    //Metodos getters y setters
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    //metodo toString sobreescrito
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transporte{");
        sb.append("velocidad=").append(velocidad);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
