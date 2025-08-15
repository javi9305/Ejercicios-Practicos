/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 * Realizar un juego para adivinar un numero, para ello generar un
 * numero aleatorio entre 0-100 y luego ir pidiendo numeros indicando
 * si es mayor o menor.
 * el proceso termina cuando  el usurio acierta.
 * 
 * @author javier
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;
        
        
        aleatorio = (int)(Math.random()*100);
        
        do{
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(aleatorio>numero){
            System.out.println("Digite un numero mayor");
            
        }
        else{
        
        System.out.println("Digite un numero menor");
        
        }
         contador++; //aumenta en uno el contador.
        } while(numero != aleatorio);
       
        System.out.println("\nGenial adivinaste el numero en:"+ contador);
    }
    
}
