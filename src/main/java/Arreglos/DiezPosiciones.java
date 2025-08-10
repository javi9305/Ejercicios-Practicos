
package Arreglos;

import java.util.Scanner;


public class DiezPosiciones {
    public static void main(String[] args) {
        final int tamanio = 3;
        
        //Arreglo de tipo entero 
        int numeros[] = new int[tamanio];
        
        //metodos
        rellenarArreglo(numeros);
        mostrarArreglo(numeros);
        
        
    }
    
    
    //Rellena el arreglo con numeros dados por el usuario
    public static void rellenarArreglo(int numeros[]){
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Introduce un numero");
            numeros[i] = Integer.parseInt(consola.nextLine());
        }
   
    
    }
    
    //Muestra el arreglo con los numeros dados por el usuario
    public static void mostrarArreglo(int numeros[]){
       for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(" En el indice " + i + " esta el valor : " + numeros[i]);
        }
    
    }
 
}
