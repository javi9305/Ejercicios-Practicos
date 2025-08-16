/*
/*
Un usuario quiere controlar sus gastos diarios durante una semana (7 días).
Crea un programa en Java que haga lo siguiente:

Pida al usuario cuánto gastó cada día.

Calcule el gasto total de la semana.

Calcule el gasto promedio diario.

Muestre el día en el que se gastó más dinero.

Muestre cuántos días gastó más de $500.

Si el gasto total supera $3000, mostrar un mensaje de ¡Cuidado! Estás gastando mucho.

*/

package GastosPersonales;

import java.util.Scanner;


public class GastosPersonales {
 static Scanner consola = new Scanner(System.in);    
    
    public static void main(String[] args) {
        final int DIAS_SEMANA = 7; //constante
        double[] gastos = new double[DIAS_SEMANA];
        
        llenarGastos(gastos);
        procesarGastos(gastos);
        
    }
   
public static void procesarGastos(double[] gastos){
double gastoTotal = 0;
double diaMayorGasto = 0;
double mayorGasto = gastos[0];
int contadorGasto = 0;


    for (int i = 0; i < gastos.length; i++) {
        gastoTotal += gastos[i];
        
    
      if(gastos[i] > mayorGasto){
       mayorGasto = gastos[i];
       diaMayorGasto = i;
      }
      
      if(gastos[i] > 500){
      contadorGasto++;
      }
    }
    
    double promedio = gastoTotal/gastos.length;  

    if(gastoTotal>3000){
        System.out.println("Cuidado, estas gastando mucho");
    }
    //mostrar resultados
        System.out.println("Gasto total de la semana: $ " + gastoTotal);
        System.out.println("Gasto promedio diaria: $" + promedio);
      System.out.println("El dia que se gasto mas dinero fue: " + (diaMayorGasto + 1) + "con $" + mayorGasto);
        System.out.println("hubo " + contadorGasto + "dias que se gastaste mas de $500");    

    
}  
    
public static void llenarGastos(double[] gastos){
    for (int i = 0; i < gastos.length; i++) {
        gastos[i] = pedirGasto(i+1);
    }

}    
    
    
 public static double pedirGasto(int dia){
     System.out.println("Introduce tu gasto del dia " + dia + ":");
      return consola.nextDouble();
 }      
}
