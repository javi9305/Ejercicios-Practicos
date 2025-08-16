
package Arreglos;

import java.util.Scanner;


public class ProyectoFreelance {
    static Scanner consola = new Scanner(System.in);
    static final int DIA = 5;
    static final int PROYECTO = 4;
    static int[][] horas = new int[DIA][PROYECTO];
    static String[] nombresDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
    
    public static void main(String[] args) {
        ingresarHorasTrabajadas();
        calcularHoras();
     
    }
    
    
    
    public static void ingresarHorasTrabajadas(){
    
    System.out.println("📥 Registro de horas trabajadas por proyecto (de lunes a viernes):");
        for (int i = 0; i < DIA; i++) {
            System.out.println("\n📅 " + nombresDias[i]);
            for (int j = 0; j < PROYECTO; j++) {
                System.out.print("  Proyecto " + (j + 1) + " - Horas: ");
                horas[i][j] = consola.nextInt();
            }
        }
    
    }
    
    
    public static void calcularHoras(){
        int totalSemana = 0;
        int [] totalPorProyecto = new int[PROYECTO];
        int [] totalPorDia = new int[DIA];
        
        for (int i = 0; i < DIA; i++) {
            for (int j = 0; j < PROYECTO; j++) {
                int h = horas[i][j];
                totalSemana+= h;
                totalPorProyecto[j]+= h;
                totalPorDia[i]+=h;
            }
            
           
        }
  
    // Día más trabajado
        int diaMayor = 0;
        for (int i = 1; i < DIA; i++) {
            if (totalPorDia[i] > totalPorDia[diaMayor]) {
                diaMayor = i;
            }
        }

        // Proyecto con más horas
        int proyectoMayor = 0;
        for (int i = 1; i < PROYECTO; i++) {
            if (totalPorProyecto[i] > totalPorProyecto[proyectoMayor]) {
                proyectoMayor = i;
            }
        }
     
        
         // Mostrar resultados
        System.out.println("\n📊 Reporte semanal:");
        System.out.println("🕒 Total de horas trabajadas: " + totalSemana);

        System.out.println("\n🗂 Horas por proyecto:");
        for (int i = 0; i < PROYECTO; i++) {
            System.out.println("  Proyecto " + (i + 1) + ": " + totalPorProyecto[i] + " horas");
        }

        System.out.println("\n📆 Día más trabajado: " + nombresDias[diaMayor] + " (" + totalPorDia[diaMayor] + " horas)");
        System.out.println("🏆 Proyecto con más horas: Proyecto " + (proyectoMayor + 1) + " (" + totalPorProyecto[proyectoMayor] + " horas)");
        
        
        
        
    }
    
  
}
