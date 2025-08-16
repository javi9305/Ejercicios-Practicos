
package VentasDiarias;

import java.util.Scanner;


public class VentasDiarias {
  static Scanner entradaDatos = new Scanner(System.in);
      public static void main(String[] args) {
      

          double [] ventas = new double[7];
          double ventaTotal = calcularVenta(ventas);
          double ventaPromedio = calcularPromedio(ventaTotal,ventas.length);
          int diaVentaMayor = encontrarDiaVentaMayor(ventas);
          int diasBajos = encontrarVentaMenor(ventas,100.00);
          System.out.println("la venta total de la semana fue: " + ventaTotal);
          System.out.println("la venta promedio diaria es de: " + ventaPromedio);
          System.out.println("el dia con mayor venta fue el dia: " + diaVentaMayor + "con:" + ventas[diaVentaMayor - 1]); //diaVentaMayor - 1 porque se le sumo 1 al indice para poder imprimir dia 1 en vez de dia 0 siempre y cuando el primer elemento sea mayor
          System.out.println("Hubo " +diasBajos + "dias menores a 100");
      }
      
      
      
      
      public static double pedirVentaDelDia(int dia){
        System.out.println("Ingrese la venta del dia " + (dia));
              double ventaDelDia = entradaDatos.nextDouble();
              
              return ventaDelDia;
      }
      
      
      
      public static double calcularVenta(double[] ventas){
         double VentaTotal = 0.0;
          for (int dia = 0; dia < ventas.length; dia++) {
              ventas[dia] = pedirVentaDelDia(dia+1); 
              VentaTotal+=ventas[dia];
          }
           return VentaTotal;
      }

    private static double calcularPromedio(double ventaTotal, int numeroDias) {
      return ventaTotal/numeroDias;
    }
    
    
    private static int encontrarDiaVentaMayor(double[]ventas){
        double mayor = 0.0;
        int diaMayor = 0;
        for (int dia = 0; dia < ventas.length; dia++) {
         
            if(mayor<ventas[dia]){
             mayor = ventas[dia];
             diaMayor = dia;
            }
        
        }
        return diaMayor + 1; // + 1 para que el dia empieze en 1 y no en 0
    }
    
    
    private static int encontrarVentaMenor(double []ventas, double limite){
        int contarDiasBajos = 0;
    for (int dia = 0; dia < ventas.length; dia++) {
        if(ventas[dia]<limite){
         contarDiasBajos++;      
        }
    }
    
    return contarDiasBajos;
    }
    
}
