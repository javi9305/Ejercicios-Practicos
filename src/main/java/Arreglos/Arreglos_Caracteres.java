
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Arreglos_Caracteres {

    
    public static void main(String[] args) {
        //Declaracion de variables
        char[] letras;  //variable de tipo Arreglo char
        int nElementos;

        // inserta los caracteres que el usuario teclee.
        //Se crea un objeto de tipo Scanner para poder escribir en consola
        Scanner entrada = new Scanner(System.in);
        
        //Se le pide al usuario que digite cuantos elemento va a tener el arreglo
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));

        //Numeros de elementos que contendra mi arreglo char dependiendo del tamaño dado por el usuario.
        letras = new char[nElementos];

        //Se digitan los elementos que contendra el arreglo 
        System.out.println("Digite los elementos del arreglo");

        
        //Se hace uso del ciclo for para hacer el llenado del arreglo letras.
        for (int i = 0; i < nElementos; i++) {

            //Se digita el caracter
            System.out.println((i) + "Digite un caracter");

            //el caracter es guardado en el arreglo letras de tipo char
            letras[i] = entrada.next().charAt(0); // método devuelve el carácter en el índice especificado de una cadena. El índice del primer carácter es 0, el segundo carácter es 1, y así sucesivamente. 

        }
        
        //Impresion del arreglo con el ciclo for para recorrer lo que contiene el arreglo letra.
        System.out.println("\nLos caracteres del arreglo son:");
        for (int i = 0; i < nElementos; i++) {

            System.out.println(letras[i]);
        }

    }
    
}
