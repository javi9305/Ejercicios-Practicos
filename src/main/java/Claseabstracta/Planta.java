
package Claseabstracta;


public abstract class Planta {
    //Declaracion de atributos
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    //Contructor vacio
    public Planta() {
    }
 
    //Constructor con parametros
    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }
    
    //Metodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    /*
     protected sirve cuando tengo una clase padre (Planta) y yo quiero
     que sus clases hijas puedan ven el metodo decirLoqueSoy de la clase padre
    pero no las demas clases.
    */
    protected abstract void decirLoQueSoy();
    
    
}
