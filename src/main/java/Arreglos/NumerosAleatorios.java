
package Arreglos;

import java.util.Scanner;


public class NumerosAleatorios {
    public static void main(String[] args) {
         final int tamanio;
        //Creo objeto de tipo Scanner para escribir por consola
        Scanner consola = new Scanner(System.in);
        
        //Introducir tamaño del arreglo
        System.out.println("Introducir el tamaño del arreglo");
        tamanio = Integer.parseInt(consola.nextLine());
        
        //Creacion del arreglo de tipo int asignandole un tamaño
        int numeros[] = new int[tamanio];
        //llamando el metodo pasandole como parametros el arreglo, el numero 0 y el numero 9
        rellenarArregloConNumeroAleatorio(numeros,0,9);
        
        mostrarArreglo(numeros);
        
     
    }
    
    //El metodo recibe 3 parametros, un arreglo de tipo entero y 2 numeros de tipo entero
       public static void rellenarArregloConNumeroAleatorio(int numeros[], int numAleatorioUno, int numAleatorioDos){
           for (int i = 0; i < numeros.length; i++) {
               
               //Generamos un numero entre los parametros pasados
               numeros[i] = (int)Math.floor(Math.random()*(numAleatorioUno- numAleatorioDos)+numAleatorioDos);
           }
        
        
        }
       
       //Metodo para mostrar el arreglo
       public static void mostrarArreglo(int numeros[]){
       for (int i = 0; i < numeros.length; i++) {

           System.out.println(" En el indice " + i + " esta el valor de : " + numeros[i]);
       }
       }
}
