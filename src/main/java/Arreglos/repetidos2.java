
package Arreglos;

import java.util.Arrays;

public class repetidos2 {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 3};

        Arrays.sort(arreglo);

        boolean tieneDuplicados = false;

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] == arreglo[i + 1]) {
                tieneDuplicados = true;
                break;
            }
        }
        if (tieneDuplicados) {
            System.out.println("El arreglo tiene elementos repetidos");
        } else {
            System.out.println("El arreglo No tiene elementos repetidos");
        }
    }
}
