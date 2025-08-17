
package Interfaces;


public class Cuadrado implements Figura,Dibujable{
    //Declaracion de variable
   private double lado;

   //Constructor vacio
    public Cuadrado() {
    }

    //Constructor con argumentos
    public Cuadrado(double lado) {
        this.lado = lado;
    }
  
   
   //Implementacion del metodo de la clase Figura
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado");
    }
    
}
