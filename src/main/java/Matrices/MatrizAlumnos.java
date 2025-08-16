
package Matrices;

import java.util.Scanner;

/*
En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.Cada fila corresponde a las notas y al promedio de cada alumno.
Se necesita un programa que permita a un profesor cargar, en las 3 posiciones(columnas) de cada fila, las notas del alumnno y que en cada ultima columna
se calculen los promedios. una vez realizados los calculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.

           Nota 1   Nota 2  Nota 3  Promedio
Alumno 1    8         8      7        ?
Alumno 2    7         9      10       ?
Alumno 3    10        9      5        ?
Alumno 4    4         9      8.50     ?

*/

public class MatrizAlumnos {

    public static void main(String[] args) {
        //Declaracion de matriz
        Double matriz[][] = new Double[4][4];
        //Creo objeto de tipo Scanner para entrada de datos
        Scanner consola = new Scanner(System.in);
        Double suma = 0.0;

        //for para cargar la matriz
        for (int fila = 0; fila < 4; fila++) { //fila menor a 4 porque empiezo contando desde cero.
            for (int columna = 0; columna < 3; columna++) { //ira hasta la posicion 3, ya que la 4° columna es de promedio
                System.out.println("Ingrese nota del alumno n°" + fila);
                matriz[fila][columna] = consola.nextDouble(); //lo que ingrese por teclado se guardara en la matriz.
                suma = suma + matriz[fila][columna];//lo que guarde en la matriz, se ira sumando.
            }
            matriz[fila][3] = suma / 3; //el acumulado que tenga suma lo divido entre 3 y lo guardo en la columna 4 (posiciones 0,1,2,3).
            suma = 0.0;//suma tiene que volver a 0, porque sino vuelve al siguiente alumno y seguira sumando.
        }

        //for para recorrer
        for (int fila = 0; fila < 4; fila++) {
            System.out.println("Las notas del alumno n°" + fila + "son: ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Nota n° " + columna + " " + matriz[fila][columna]);
            }
            System.out.println("El promedio de las notas es: " + matriz[fila][3]);
        }
    }
}

