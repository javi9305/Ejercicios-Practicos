
package Ciclos;

import javax.swing.JOptionPane;


public class Calificaciones {

  
    public static void main(String[] args) {
        //Declaracion de variables 
        float calificacion;
        boolean hay_suspensos = false; //Uso de bandera
        
        //Dentro del ciclo for se utiliza el ciclo do - while 
        for (int i = 1; i <= 5; i++) {

            do {
                //Se obtienen las notas
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota"));

            } while (calificacion < 0 || calificacion > 10);

            //Se verifica que la calificacion sea menor a 5 y si se cumple la variable hay_suspensos cambia a true
            if (calificacion < 5) {
                hay_suspensos = true;

            }
        }
        //Se verifica que haigan alumnos suspensos o no
        if(hay_suspensos==true){
            System.out.println("Si existen alumnos suspensos");
        
        }
        else{
            System.out.println("No hay ningun alumno suspensos");
        
        }
        
    }
    
}
