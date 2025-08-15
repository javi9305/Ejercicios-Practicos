
package Ciclos;

import javax.swing.JOptionPane;

/*******************************************************************
 *
 * pedir 10 sueldos. mostrar su suma y cuantos hay mayores de $1000.
 *******************************************************************/
public class Sueldos {

  
    public static void main(String[] args) {
        //Declaracion de variables
        float sueldo,suma=0;
        int contador =0;
        //Uso del ciclo for para pedir un sueldo varias veces
        for (int i = 1; i <= 10; i++) {
            //se pide el sueldo
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo"));

            //Se verifica que el sueldo sea mayor a 1000
            if (sueldo > 1000) {   //si el sueldo supera a 1000
                contador++;  //se usa un contador para saber cuantos sueldos fueron mayores

            }

            suma += sueldo; //se realiza la suma de los sueldos mayores a 1000
        }
        //Se muestra el resultado
        System.out.println("La suma de todos los sueldos es: $"+ suma);
        System.out.println("Cantidad de sueldos mayores a 1000:"+ contador);
    }
    
}
