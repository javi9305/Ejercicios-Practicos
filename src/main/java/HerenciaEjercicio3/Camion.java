
package HerenciaEjercicio3;


public class Camion extends Vehiculo{
    //Atributo
    private double capacidad;

    //Constructor vacio
    public Camion() {
    }

    //Constructor que recibe 4 argumentos
    public Camion(double capacidad, int id, String marca, String modelo) {
        super(id, marca, modelo);
        this.capacidad = capacidad;
    }

    //Metodo getter y setter
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
