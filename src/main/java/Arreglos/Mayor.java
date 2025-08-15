
package Arreglos;

import java.util.Scanner;


public class Mayor {
    public static void main(String[] args) {
        
        int arreglo[] = new int[5]; //Arreglo de tipo int tamaño 5
        int mayor = arreglo[0]; //el arreglo[0] contiene 0 y ese 0 es asignado a variable mayor
        
        //Objeto de tipo Scanner para entrada de datos
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese los 5 numeros");
        
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = consola.nextInt(); //lo que el usuario ingrese es asignado al arreglo
            //Verifico si el contenido del arreglo es mayor a lo que contiene la variable mayor
            if(arreglo[i]>mayor){
              mayor = arreglo[i]; //si el contenido es mayor asigno lo que contiene el arreglo a la variable mayor
            }
        }
        //Imprimo el resultado
        System.out.println("El numero mayor es: " + mayor);
    }
}
