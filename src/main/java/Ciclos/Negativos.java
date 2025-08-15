
package Ciclos;

import javax.swing.JOptionPane;


public class Negativos {

   
    public static void main(String[] args) {
        //Declaracion de una variable
        int numero;
        boolean hay_negativo = false; //es una bandera la cual cambiara dentro de un if
        
        
      //Ciclo for que da vuelta 10 veces
      for(int i=1;i<=10;i++){
       //Se pide un numero
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
      //Se realiza la comparacion si el numero es menor sera negativo.
       if(numero < 0){  //si el numero es negativo
       
       hay_negativo=true;
       }
      
    }  
        //se verifica que el numero negativo sea verdadero
        if(hay_negativo == true){
      
        System.out.println("Si existe al menos un numero negativo");
    }
        //De lo contrario no sera negativo
        else{
        
            System.out.println("No existe ningun numero negativo");
        }
    }
   
}
