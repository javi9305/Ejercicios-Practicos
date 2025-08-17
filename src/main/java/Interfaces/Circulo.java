
package Interfaces;


public class Circulo implements Figura,Dibujable,Rotable{
    //Declaracion de variable
    private double radio;
    
    //Constructor vacio
    public Circulo() {
       
    }
    
    //Constructor con argumentos
    public Circulo(double radio) {
        this.radio = radio;
    } 

    @Override
    public double calcularArea() {
        double pi = 3.14;
        return pi * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola,estoy rotando un circulo");
    }
    
}
