
package Arreglos;

import java.util.Scanner;


public class Vector {
    public static void main(String[] args) {
        int vector[] = new int[15]; //Inicializo el arreglo de tipo int de tamaño 15
        int cont = 0;
        
        //Creo objeto de tipo Scanner para la entrada de datos
        Scanner consola = new Scanner(System.in);
        
        //Cargo el arreglo
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un numero para el vector");
            vector[i] = consola.nextByte(); //ingreso el numero dado por el usuario al arreglo
            
            //Verico cuantos numeros 3 existen en el arreglo
            if(vector[i]==3){
            cont++;
            }
        }
          
        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
    }
}
