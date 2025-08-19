
package Arreglos;

import java.util.Scanner;


public class NumeroMayorEnArreglo {
    public static void main(String[] args) {
         int numero;
         int contador = 0;
         int arreglo[] = new int[5]; 
         
          Scanner consola = new Scanner(System.in);
          
          System.out.println("Ingrese un numero");
          numero = consola.nextInt();
          
          //llenar arreglo
          
           for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un número [" + (i + 1) + "]:");
            arreglo[i] = consola.nextInt();
           
           }
           
           //Comparar arreglo
           for (int i = 0; i < arreglo.length; i++) {
            if(numero<arreglo[i]){
              contador++;
            } 
        }
           System.out.println(contador + " son los numeros mayores que " + numero);
    }
   
}
