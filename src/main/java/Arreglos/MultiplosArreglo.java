
package Arreglos;

import java.util.Scanner;


public class MultiplosArreglo {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int arreglo[] = new int[5];

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = consola.nextInt();

        if (numero == 0) {
            System.out.println("No se puede calcular múltiplos de 0.");
            return;
        }

        //llenar arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un número [" + (i + 1) + "]:");
            arreglo[i] = consola.nextInt();

        }

        //Comparar arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % numero == 0) {
                contador++;
            }
        }
        System.out.println(contador + " son los multiplos de: " + numero);

    }
  
}
