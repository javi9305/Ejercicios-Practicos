/*
Ingresar por teclado 5 notas y mostrar el promedio.
*/
package Arreglos;

import java.util.Scanner;


public class NotasPromedio {
    
    public static void main(String[] args) {
        //Objeto de tipo Scanner para entrada de datos
        Scanner consola = new Scanner(System.in);
        
        //Declaracion de variables
        float notas[] = new float[5]; //Arreglo de tipo float tamaño 5
        int contador = 1;
        int i = 0;
        float promedio;
        float suma = 0;
        
        //mientras que i sea menor de 5 agrega una nota al arreglo notas
        while(i < 5){
            System.out.println("Ingrese la " + contador + "° nota :");
            notas[i] = Float.parseFloat(consola.nextLine());
            
            suma+=notas[i]; //realiza la sumatoria de cada nota agregada
            i++; //contador para controlar el ciclo while
            contador++; //contador para indicar el numero de notas
        }
        
        promedio = suma /5;//divide lo que contiene suma entre 5 y muestra el promedio
        System.out.println("su promedio es: " + promedio);
        
    }
}
