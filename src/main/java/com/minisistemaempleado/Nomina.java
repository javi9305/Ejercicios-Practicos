
package com.minisistemaempleado;

import java.util.ArrayList;
import java.util.List;


public class Nomina {
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new Empleado("Ana",30,5000));
        empleados.add(new Gerente("Ventas","Carlos",40,10000));
        empleados.add(new Programador("Luis",24,7000,"Java"));
        empleados.add(new Programador("Andrea",34,12000,"Python"));
         
        
        double totalNomina = 0;
        
        
        for (Empleado emp : empleados) {
            System.out.println(emp);
            
            double bono = emp.calcularBonificacion();
            System.out.println("Bonificacion: " + bono);
            
            System.out.println("total con bonificacion: " +(emp.getSalario() + bono));
            System.out.println("--------------------------");
            
            totalNomina += emp.calcularPagoTotal();
        }
        
        System.out.println("Nomina total de la empresa: " + totalNomina);
        
 
    }
}
