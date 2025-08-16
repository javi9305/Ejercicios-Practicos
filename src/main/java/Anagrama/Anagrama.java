
package Anagrama;

/*
Para crear un programa que detecte anagramas, puedes seguir varios enfoques.

1. - Un método sencillo es verificar que cada carácter de la primera cadena aparezca en la segunda cadena,
     marcándolos para asegurarte de que todos los caracteres se encuentran.

2.- Otra técnica es clasificar alfabéticamente cada cadena y luego compararlas para ver si son iguales.




*/
import java.util.Arrays;


public class Anagrama {
    public static void main(String[] args) {
        isUnAnagrama("gato","toga");
    }
    
    public static void isUnAnagrama(String palabra, String palabra2){
    
        //Convierte una cadena de texto a un arreglo de caracteres
       
        char [] letras = palabra.toCharArray();
        char [] letras2 = palabra2.toCharArray();
       
        //sort es un metodo estatico de la clase Arrays que ordena los caracteres en orden alfabetico
        Arrays.sort(letras);
        Arrays.sort(letras2);
        

        //equal es un metodo estatico de la clase Arrays que compara el contenido del arreglo 
        if(Arrays.equals(letras,letras2)){
            System.out.println("Es un anagrama");
        }
    }
  
}
