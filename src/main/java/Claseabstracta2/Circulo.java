
package Claseabstracta2;


public class Circulo extends Figura{
    //Declaracion de variable
    private double radio;
    
    //Constructor vacio
    public Circulo() {
       
    }
    
    //Constructor con argumentos

      public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    

    @Override
    public double calcularArea() {
        double pi = 3.14;
        return pi * radio * radio;
    }
    
}
