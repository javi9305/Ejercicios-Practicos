
package Arreglos;

import java.util.Scanner;


public class IndiceNegativoArreglo {
     public static void main(String[] args) {
       
        int arreglo[] = new int[5];

        Scanner consola = new Scanner(System.in);

        //llenar arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un número [" + (i + 1) + "]:");
            arreglo[i] = consola.nextInt();

        }

        //mostrar indice de valores negativos
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0) {
                System.out.println("Índice " + i + ": valor negativo = " + arreglo[i]);

            }
        }

    }
}
