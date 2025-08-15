
package Ciclos;

import javax.swing.JOptionPane;


public class Obrero {

    /**
     * Un obrero necesita calcular su salario semanal, el cual se obtine
     * de la siguiente manera:
     * - Si trabaja 40 hrs o menos se le paga $16 por hora
     * - Si trabaja mas de 40 hrs se le paga $16 por cada una
     *   de las primeras 40 hrs y $20 por cada hora extra.
     */
    public static void main(String[] args) {
        //Declaracion de las variables.
        int  horasTrabajadas;
        float salarioTotal;
        //Se digita las horas trabajadas de un obrero
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));
        //Se verifica las horas trabajadas que sea menor de 40
        if(horasTrabajadas <=40){
        
           salarioTotal = horasTrabajadas * 16;//Se realiza la operacion correspondiente
        }
        else{
        
          salarioTotal = (40*16) + ((horasTrabajadas-40)*20); //se realiza la operacion correspondiente
        
        }
        //Se muestra el resultado
        JOptionPane.showMessageDialog(null, "El salario total es:"+ salarioTotal);
        
    }
    
}
