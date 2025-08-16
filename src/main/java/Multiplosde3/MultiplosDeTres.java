
package Multiplosde3;

import java.util.Scanner;


public class MultiplosDeTres {
    public static void main(String[] args) {
         int cantidad;
         int contadorMultiplo = 0;
         int contadorNoMultiplo = 0;
        
        //Creacion de objeto de tipo Scanner
        Scanner consola = new Scanner(System.in);
        
        //Ingresar la cantidad
        System.out.println("Introduce la cantidad de numeros a ingresar");
        cantidad = consola.nextInt(); //almaceno la cantidad ingresada en una variable
        
        //Almacenar los numeros que sean multiplos de 3 en un arreglo
        int [] numeros = new int[cantidad];
        int [] numerosNoMultiplos = new int[cantidad];
        
        for (int i = 0; i < numeros.length; i++) { //numeros.length obtiene la longitud de un arreglo es decir el numero de elementos que contiene ese arreglo
           //Ingresar los numeros que se almacenaran en el arreglo
            System.out.println("Introduce el numero " + (i + 1)+ ": ");
             int numero = consola.nextInt();
             
             //Verificar si el numero es multiplo de 3 y guardarlo en el arreglo
             if(numero % 3 == 0){
              numeros[contadorMultiplo] = numero; //almaceno el numero en el arreglo
              contadorMultiplo++; //este contador nos va a servir para contar cuantos numeros son multiplos de 3
             
             }
             //De lo contrario guarda el numero que no es multiplo
             else{
              numerosNoMultiplos[contadorNoMultiplo] = numero;
              contadorNoMultiplo++;
             }
         
            
        }
        System.out.println("\nLos numeros multiplos de 3 son: ");
        for (int i = 0; i < contadorMultiplo; i++) {
            
            System.out.println(numeros[i]);
            
        }
        System.out.println("\nLos numeros no multiplos son:");
        for (int i = 0; i < contadorNoMultiplo; i++) {
            
                 
            System.out.println(numerosNoMultiplos[i]);
            
            
        }
     
        
    }
  
}
