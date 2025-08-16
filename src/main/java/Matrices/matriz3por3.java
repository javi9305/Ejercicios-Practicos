
/*
Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
*/
package Matrices;


public class matriz3por3 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int suma = 0;
        
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {
                 suma = suma + 1;
                  matriz[filas][columnas] = suma;
                //otra forma de hacerlo matriz[filas][columnas] = (filas*matriz.length) + (columnas+1);
                System.out.println(matriz[filas][columnas] + " ");
            }
            System.out.println("");
        }
    }
   
   
   
}
