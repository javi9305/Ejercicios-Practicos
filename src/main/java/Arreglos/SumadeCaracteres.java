/*
Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra 
por letra y la suma de sus caracteres.


*/
package Arreglos;

import java.util.Scanner;


public class SumadeCaracteres {
    public static void main(String[] args) {
        //Declaracion de variables
        int cantidadCaracteres = 0;
        String palabra;
        
     //Creo objeto de tipo Scanner para entrada de datos   
     Scanner consola = new Scanner(System.in);
        System.out.println("Escriba una palabra");
     palabra = consola.nextLine();
     
     //Creo un arreglo de caracteres pasando el tamaño de la palabra
     char caracteres [] = new char[palabra.length()];
     
       
        for (int i = 0; i < palabra.length(); i++) {
           
            //obtengo un caracter  dependiendo la posicion y lo guardo en el arreglo de caracteres     
            caracteres[i] = palabra.charAt(i);
            cantidadCaracteres++; //Cuenta la cantidad de caracteres
            
            System.out.println(caracteres[i]);
        }
        System.out.println("la cantidad de caracteres es: " + cantidadCaracteres);
    }
    
     
     
}
