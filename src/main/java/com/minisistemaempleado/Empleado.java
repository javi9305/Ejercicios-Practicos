
package com.minisistemaempleado;


public class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
     
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
       
        return sb.toString();
    }
    
   public double calcularBonificacion(){
   
     return salario * 0.1; //Bonificacion general del 10%
   }
   
   public double calcularPagoTotal(){
    return salario + calcularBonificacion();
   }
   
}
