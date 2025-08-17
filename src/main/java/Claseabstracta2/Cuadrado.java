
package Claseabstracta2;


public class Cuadrado extends Figura{
    //Declaracion de variable
   private double lado;

   //Constructor vacio
    public Cuadrado() {
    }

    //Constructor con argumentos
    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
   
   //Implementacion del metodo de la clase Figura
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
