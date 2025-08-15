
package Arreglos;


public class MostrarDatos {
    public static void main(String[] args) {
        //Arreglo de tipo String,entero y char
        String nombres[] = {"Andrea","Ronald","Carolina","Paola"};
        int edad[] = {25,30,22,24};
        char sexo[] = {'F','M','F','F'};
        
        System.out.println("Datos de los usuarios");
        System.out.println("Nombres Edad Sexo");
        System.out.println("------ ---- ---");
        
        //recorrido de los arreglos
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " " + edad[i] + " " + sexo[i]);
        }
    }
 
}
