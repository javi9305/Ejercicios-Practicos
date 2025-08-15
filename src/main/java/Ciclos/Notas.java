
package Ciclos;

import javax.swing.JOptionPane;

/****************************************************************************
 *
 * Dadas 6 notas, escribr la cantidad de alumnos aprobados, condicionados(=4)
 * y suspensos.
 * 
 ****************************************************************************/
 
public class Notas {

  
    public static void main(String[] args) {
       //Declaracion de variables
       float nota;
       int aprobado=0,condicionados=0,suspensos=0;
       //Combinacion del ciclo for y el ciclo do  
       for(int i=1;i<=6;i++){
       
          do{
             //Se obtiene la nota
             nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10"));
          
          }
           //ciclo while
           while(nota<0 || nota >10); //nota  debe estar entre 0-10
       
          //Se verifica la nota
          if(nota == 4){   //
          
           condicionados++; //se incrementa a 1 cada vez que la condicion sea cierta.
          }
          
          
          else if(nota>=5){
          aprobado++;
          
          }
          
          else{
          suspensos++;
          
          }
       }
       //Muestra los resultados
        System.out.println("Cantidad de aprobados" + aprobado);
        System.out.println("Cantidad de condicionados" + condicionados);
        System.out.println("Cantidad de suspensos" + suspensos);
    }
    
}
