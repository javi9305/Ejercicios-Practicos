
package Arreglos;


public class Notas {
    public static void main(String[] args) {
        //Declaracion de arreglos de tipo String e int
        String cursos[] = {"Diseño","Estadistica","Ingles"};
        int practicas[] ={14,17,11};
        
        System.out.println("Promedio de Cursos");
        System.out.println("Curso nota");
        System.out.println("----- ----");
        
        //Realizo el promedio del arreglo practicas
        int promedio = (practicas[0] + practicas[1] + practicas[2])/3;
        
        //Recorro el arreglo
        for (int i = 0; i < cursos.length; i++) {
            System.out.println(cursos[i] + " " + practicas[i]);
        }
        
        System.out.println("Promedio es: " + promedio);
    }
  
}
