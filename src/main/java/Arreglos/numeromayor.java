
package Arreglos;

import java.util.Scanner;


public class numeromayor {
    public static void main(String[] args) {
        //Declaracion de variables
        int mayor = 0; 
        int menor = 100;
        int [] numeros = new int[11]; //Arreglo de tipo int con tamaño de 11
        Scanner consola = new Scanner(System.in);//Creo objeto de tipo Scanner para la entrada de datos
        
        //Ingreso los numeros dados por el usuario al arreglo
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + i + " a evaluar ");
            numeros[i] = Integer.parseInt(consola.nextLine());
            
            //Verifico si lo que contiene mayor es menor a lo que contiene en ese momento el arreglo de numeros 
             if(mayor<numeros[i]){
              mayor = numeros[i];
            }
            //Verifico si lo que contiene menor es mayor a lo que contiene en ese moment oel arreglo de numeros
            if(menor >numeros[i]){
               menor = numeros[i];
              } 
          
        }
        
        
        System.out.println("el numero mayor es: " + mayor + " el numero menor es: " + menor);
        
    }
    
}
