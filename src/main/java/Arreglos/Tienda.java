
package Arreglos;

import java.util.Scanner;


public class Tienda {
    public static void main(String[] args) {
        
        double ventas [] = new double[5]; //arreglo de tipo double de tamaño 5
        int contadorVentas = 0;
        //Objeto de tipo Scanner para entrada de datos
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa las 30 ventas del mes: ");
        
        //Recorre el arreglo ingresando las ventas al arreglo 
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i+1));
            ventas[i] = Double.parseDouble(consola.nextLine());
                       
        }
        System.out.println("\nVentas mayores a $2000:\n");
        //Recorre el arreglo verificando que las ventas que sean mayor a 2000 son las que se mostraran
        for (int i = 0; i < ventas.length; i++) {
             if(ventas[i]>2000){
                System.out.println("$" + ventas[i]);
                contadorVentas++; //Contador para saber cuantas ventas fueron mayores a 2000
            }
        }
        
        System.out.println("El total de ventas mayores a $2000 son de : " + contadorVentas);
    }
}
