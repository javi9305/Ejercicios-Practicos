
package sistemaObjetoPerdidos;


public class ObjetoPerdido {
    //Atributos
    private String nombre;
    private String descripcion;
    private boolean reclamado;

    //Constructor
    public ObjetoPerdido(String nombre, String descripcion) {
        //Inicializacion
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.reclamado = false;
    }
    
    
    //Getters y Setters
    public void marcarComoReclamado(){
     this.reclamado = true;
    }
    
    
    public boolean estaReclamado(){
      return reclamado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion + (reclamado ? "(RECLAMADO)" : "");
    } 
}
