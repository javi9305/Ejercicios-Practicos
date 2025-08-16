
package RegistroAsistencia;

import java.util.Scanner;


public class RegistroAsistenciaSemanal {
    public static void main(String[] args) {
        //Objeto de tipo Scanner para entrada de datos
        Scanner consola = new Scanner(System.in);
        String dias[] = new String[5]; //Arreglo de tipo int de tamaño 5
        int contadorAsistencias = 0;
        int contadorFaltas = 0;
        int i = 0;
        
         
        //Pedir datos al usuario
        for (i = 0; i < dias.length; i++) {
           String entrada;    
        
            do{
            System.out.println("Introduce la asistencia del estudiante -  dia " + (i+1));
            entrada = consola.nextLine();
            
             if(!entrada.equalsIgnoreCase("A")&& !entrada.equalsIgnoreCase("F")){
                 System.out.println("Entrada invalida. Solo se permite 'A' o 'F'");
                 
             }
           
              }while(!entrada.equalsIgnoreCase("A")&& !entrada.equalsIgnoreCase("F"));
            
             dias[i] = entrada;
             
            //Verificar asistencias e inasistencias
            if(dias[i].equalsIgnoreCase("A")){
              contadorAsistencias++;
            }
            else if(dias[i].equalsIgnoreCase("F")){
              contadorFaltas++;
            }
          
        }
        
         //Verificar si tuvo mas de 2 faltas
         if(contadorFaltas > 2){
                System.out.println("El estudiante podria reprobar por inasistencias");
            }
         
         
     
             System.out.println("El estudiante asistio: " + contadorAsistencias + " dias");
        
         
        
            System.out.println("El estudiante falto: " + contadorFaltas + " dias");
        
    }
    
}
