
package Arreglos;

import java.util.Scanner;


public class PromedioPositivoArreglo {
    public static void main(String[] args) {
        int suma = 0;
        int promedio;
        int contador = 0;
        int arreglo[] = new int[5];

        Scanner consola = new Scanner(System.in);

        //llenar arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un número [" + (i + 1) + "]:");
            arreglo[i] = consola.nextInt();

        }

        //calcular suma de positivos
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                suma += arreglo[i];
                contador++;

            }
        }

        if (contador > 0) {
            promedio = suma / contador;
            System.out.println("El promedio de los números positivos es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

    }
}
