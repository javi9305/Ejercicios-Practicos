/*
Ingresar 10 números enteros y mostrar los números pares
*/
package Arreglos;

import java.util.Scanner;


public class NumeroPares {
    public static void main(String[] args) {
        //Creo objeto de tipo Scanner para entrada de datos
        Scanner consola = new Scanner(System.in);
        //Creo dos arreglos de tipo entero
        int numerosPares [] = new int[10];
        int numeros [] = new int[10];
        int contador = 0;
       
        
        System.out.println("Ingrese los 10 numeros a evaluar");
        
        for (int i = 0; i < numeros.length; i++) {
            //Agrego los numeros ingresados por el usuario al arreglo
            numeros[i] = Integer.parseInt(consola.nextLine());
            
            //Verifico si lo que contiene el arreglo es divisible entre 2 y que el resultado sea 0
            if(numeros[i]%2 == 0){
              
             //almaceno lo que contiene el arreglo en ese momento y lo guardo en el arreglo numerosPares   
             numerosPares[contador] = numeros[i];
             contador++;
            }
        }
        
        //Recorro el arreglo con los numeros pares encontrados
        System.out.println("los numeros pares son: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(numerosPares[i]);
        }
    }
  
}
