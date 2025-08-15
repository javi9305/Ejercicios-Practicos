
package Arreglos;


import java.util.Scanner;


public class NumerosAleatoriosPrimos {
    public static void main(String[] args) {
        
    
     final int tamanio;
        //Creo objeto de tipo Scanner para escribir por consola
        Scanner consola = new Scanner(System.in);
        
        //Introducir tamaño del arreglo
        System.out.println("Introducir el tamaño del arreglo");
        tamanio = Integer.parseInt(consola.nextLine());
        
        //Creacion del arreglo de tipo int asignandole un tamaño
        int numeros[] = new int[tamanio];
        //llamada del metodo pasando como parametros un arreglo y los numeros aleatorios del 1 al 100
        rellenarArregloConNumeroAleatorio(numeros,1,100);
        mostrarArreglo(numeros);
        
        int primoMayor = mayor(numeros);
        System.out.println("el primo mayor es: " + primoMayor);
       }
    
    
    public static void rellenarArregloConNumeroAleatorio(int numeros[], int numeroAleatorio1, int numeroAleatorio2){
    
        int i = 0;
        //Mientras que i sea menor al tamaño del arreglo
     while(i<numeros.length){
         //Arroja un numero aleatorio entre 1 y 100 guardandolo en la variable numero
       int num =((int)Math.floor(Math.random()*(numeroAleatorio1 - numeroAleatorio2) + numeroAleatorio2));
       //Verificamos que sea un numero primo
      if(num%2 != 0){
          //si es un numero primo lo guardamos en el arreglo
       numeros[i] = num;
       i++; //incrementamos i
      }
     
     }
        
        
    }
    
   
    public static void mostrarArreglo(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" En el indice " + i + " esta el valor " + numeros[i]);
        }
    
    }
    
    
    public static int mayor(int numeros[]){
     int mayor = 0;
     
        for (int i = 0; i < numeros.length; i++) {
            //Vericamos cual es el numero mayor del contenido del arreglo
          if(numeros[i] > mayor){
              //almacenamos el numero mayor del arreglo en una variable llamada mayor
           mayor = numeros[i];
          }  
        }
        
        return mayor;
    
    }
    
    
    
    }
