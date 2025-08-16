
package Agregacion;


public class Alimento {
 
    //Atributos
    private final String nombre;
    private final int cantidad;
    
    //Constructor
    public Alimento(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public void mostrarAlimentos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cantidad: " + this.cantidad);
    }   
}
