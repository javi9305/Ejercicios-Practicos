
package Claseabstracta;

public class Arbusto extends Planta{
    //Declaracion de variables
    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private String sePodaONo;

    //Constructor vacio
    public Arbusto() {
    }
    
    //contructor con parametros

    public Arbusto(double ancho, boolean esDomestico, String variedad, String colorHojas, String sePodaONo, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }
    
    //Metodo getter y setter

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public String getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(String sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un Arbusto");
    }
    
    
}
