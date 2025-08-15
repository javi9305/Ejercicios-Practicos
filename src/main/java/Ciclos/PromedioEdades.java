
package Ciclos;

import javax.swing.JOptionPane;

/**
 *   Dadas las edades  y alturas de 5 alumnos, mostrar la edad y la estatura media
 *    la cantidad de alumnos mayores de 18 años y la cantidad de alumnos
 *    que miden  mas de 1.75.
 * 
 */
public class PromedioEdades {

    
    public static void main(String[] args) {
       //Declaracion de variables
      int edad, sumaEdad=0,conteoMayor18=0,contadorMayor175=0;
      float altura,sumaAltura=0,mediaEdad,mediaAltura;
      
      //ciclor for 
      for(int i=1;i<=5;i++){
          //se piden la edad y la altura
          edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno" +i+ "\nDigite su edad"));
          altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno" +i+ "\nDigite la altura"));
      
          //se realiza la suma iterativa de la edad y la altura.
          sumaEdad+= edad;        
          sumaAltura+=altura;
          //si la edad es mayor a 18 se hara un conteo cada vez que sea verdadera la condicion
          if(edad>18){
          
           conteoMayor18++;
          
          }
          //si la altura es mayor a 1.75 se hara un conteo cada vez que verdadera la condicion
          if(altura>1.75){
          
            contadorMayor175++;
          }
         
          
      }
        //Se saca la media de las edades y la altura
        mediaEdad=(float) sumaEdad/5;  
        mediaAltura=sumaAltura/5;
        
        //se muestra el resultado
        System.out.println("La edad promedio es:"+ mediaEdad);
        System.out.println("La estatura promedio es:"+ mediaAltura);
        System.out.println("La cantidad de alumnos mayores de 18 años" +conteoMayor18);
        System.out.println("La cantidad de alumnos que miden mas de 1.75" +contadorMayor175);
    }
    
}
