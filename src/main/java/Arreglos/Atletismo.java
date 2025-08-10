/*
En una certamen de atletismo se desea implementar un control para almacenar 
el tiempo de cada corredor y además  determinar  por los datos obtenidos en los
tiempos  de  los corredores   cual   es   el   ganador.   Se   debe especificar 
cuantos atletas van a participar.

*/
package Arreglos;

import java.util.Scanner;

public class Atletismo {
    public static void main(String[] args) {
       
        //Creo objeto de tipo Scanner para entrada de datos
       Scanner consola = new Scanner(System.in);
       //Declaracion de variables
       final int cantidadAtletas;
       float m = 0;  
       String ganador = "";
     
       
        System.out.println("Ingresar la cantidad de atletas que participan");
        cantidadAtletas = Integer.parseInt(consola.nextLine());
        
         //Arreglos de tipo String y float pasando el tamaño del arreglo
         String nombreAtletas[] = new String[cantidadAtletas];
         float tiempoCorredor[] = new float[cantidadAtletas];
         
         //Ingreso de nombre y tiempo de recorrido en los arreglos respectivos
         for (int i = 0; i< cantidadAtletas; i++) {
        
         System.out.println("Ingrese el nombre del atleta");
         nombreAtletas[i] = consola.nextLine();
         
         System.out.println("Ingrese el tiempo del recorrido");
         tiempoCorredor[i] = Float.parseFloat(consola.nextLine());
        }
         
         
         //Recorro el arreglo verificando que corredor tiene el menor tiempo
         for (int i = 0; i < tiempoCorredor.length; i++) {
             
            if(m < tiempoCorredor[i]){
             m = tiempoCorredor[i];
             ganador = nombreAtletas[i];
            }
        
        }
        //Muestro el resultado
         System.out.println("El ganador es: " + ganador + " con el tiempo " + m);
    }
    
}
