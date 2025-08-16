/*
Imagina que trabajas en una escuela. Necesitas registrar la asistencia de un estudiante durante una semana (5 días). 
El usuario debe ingresar si el estudiante asistió o faltó cada día (usando "A" para asistió o "F" para faltó). Al final, el programa debe:

Mostrar cuántos días asistió.

Mostrar cuántos días faltó.

Si faltó más de 2 veces, mostrar un mensaje: "⚠️ El estudiante podría reprobar por inasistencias."


*/
package RegistroAsistencia;

import java.util.Scanner;


public class RegistroAsistenciaSemanalFunciones {
    static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        String[] dias = new String[5];
        
        //llenar el arreglo con asistencia validada
         for (int i = 0; i < dias.length; i++) {
            dias[i] = pedirAsistencia(i + 1);
        }
         
        int asistencias = contarAsistencias(dias);
        int faltas = contarFaltas(dias);
        
        //Resultados
        System.out.println("\nEl estudiante asistio: " + asistencias + "dias");
        System.out.println("El estudiante falto: " + faltas +  "dias");
    
        if(faltas > 2){
            System.out.println("El estudiante podria reprobar por inasistencias");
        }
    }
    
    
    //pedir asistencia con validacion
      public static String pedirAsistencia(int dia){
       String entrada;
       
       do{
           System.out.println("Introduce la asistencia del estudiante - dia " + dia + "(A = asistencia, F = falto):");
           entrada = consola.nextLine();
           
            if(!entrada.equalsIgnoreCase("A")&& !entrada.equalsIgnoreCase("F")){
                 System.out.println("Entrada invalida. Solo se permite 'A' o 'F'");
                 
             }
           
              }while(!entrada.equalsIgnoreCase("A")&& !entrada.equalsIgnoreCase("F"));
       
        return entrada;
       }
      
      
      public static int contarAsistencias(String[] dias){
        int contador = 0;
        for(String dia: dias){
         if(dia.equalsIgnoreCase("A")){
           contador++;
         }
        }
            return contador;
      }

      public static int contarFaltas(String[]dias){
        int contador = 0;
        for(String dia : dias){
           if(dia.equalsIgnoreCase("F")){
             contador++;
           }
        }
       return contador;
      }
      
       
      }
            

