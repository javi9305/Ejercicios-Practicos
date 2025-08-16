
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class CalificacionesEstudiantes {
    static Scanner consola = new Scanner(System.in);
    static final int NOTA=3;
    static final int ESTUDIANTE =5;
    static int[][] calificaciones = new int[ESTUDIANTE][NOTA];
    static double[] promedioEstudiantes = new double[ESTUDIANTE];
    public static void main(String[] args) {
        ingresarCalificaciones();
        sacarPromedio();
        mostrarResultados();
    }
    
    
    
    public static void ingresarCalificaciones(){
    
        //ingresar calificaciones
        for (int i = 0; i < ESTUDIANTE; i++) {
            for (int j = 0; j < NOTA; j++) {System.out.println("Introduce las calificaciones del estudiante: " + (i + 1) + " - calificacion: " + (j + 1));
                    calificaciones[i][j] = consola.nextInt();
                   
            }
        }
        
    }
    
    public static void sacarPromedio() {
        for (int i = 0; i < ESTUDIANTE; i++) {
            double suma = 0;
            for (int j = 0; j < NOTA; j++) {
              suma+= calificaciones[i][j];
            }
            
            promedioEstudiantes[i] = suma /NOTA;
        }
    }
    
    public static void mostrarResultados(){
     int aprobados = 0;
     int reprobados = 0;
     int estudianteMayor = 0;
     
        System.out.println("\nResultados por estudiante:");
        for (int i = 0; i < ESTUDIANTE; i++) {
        System.out.printf("Estudiante %d - Promedio: %.2f - ", (i + 1), promedioEstudiantes[i]);
        
         if(promedioEstudiantes[i]>=6){
             System.out.println("Aprobado");
             aprobados++;
         }
         else{
             reprobados++;
         }
         
         if(promedioEstudiantes[i]>promedioEstudiantes[estudianteMayor]){
            estudianteMayor = i;
         }
         
        }
    
          System.out.println("\nResumen general:");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.printf("Estudiante con mejor promedio: Estudiante %d (%.2f)\n", (estudianteMayor + 1), promedioEstudiantes[estudianteMayor]);
    }   
        
        
    }
    

 
