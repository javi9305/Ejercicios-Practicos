
package com.minisistemaempleado;


public class Gerente extends Empleado {
 private final String departamento;

    public Gerente(String departamento, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("departamento=").append(departamento);
     
        return super.toString()+ sb.toString();
    }
 
 
 @Override
    public double calcularBonificacion(){
     return super.calcularPagoTotal() * 0.2; //Bonificacion del 20% para gerentes
    }
    
 
}
