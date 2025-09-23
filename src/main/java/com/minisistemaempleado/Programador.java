
package com.minisistemaempleado;


public class Programador extends Empleado {
    final private String lenguajeFavorito;

    public Programador(String nombre, int edad, double salario, String lenguajeFavorito ) {
        super(nombre, edad, salario);
        this.lenguajeFavorito = lenguajeFavorito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
      
        sb.append("lenguajeFavorito=").append(lenguajeFavorito);
       
        return super.toString() + sb.toString();
    }
    
    @Override
  public double calcularBonificacion(){
   return super.calcularPagoTotal() * 0.15; //Bonificacion del 15% para programadores
  }  
}
