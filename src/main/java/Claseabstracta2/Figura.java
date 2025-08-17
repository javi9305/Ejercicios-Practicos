
package Claseabstracta2;


public abstract class Figura {
    protected double x; //Posicion en x
    protected double y; //Posicion en y

    //lo colocamos como protected para que solo sus hijas puedan utizar el constructor
    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public abstract double calcularArea();
}


