
package Anagrama;

import java.util.Arrays;


public class Anagrama2 {
    public static void main(String[] args) {
        String[][]cadenas = {{"A ver", "No"},{"Enfriamiento","Refinamiento"},{"I am lord voldemort","Tom Marvolo Riddle"}};//matriz de 3 x 2
   
        for (String[] par : cadenas) {
            System.out.println(String.format("'%s' y '%s' son anagramas? %b", par[0], par[1], esAnagrama(par[0], par[1])));
        }
    
    }
    
    
    //Ordenar una cadena
    public static String ordenar(String cadena){
     
        //la cadena la convierto en un arreglo de caracteres
        char[] caracteres = cadena.toCharArray();
        //sort es un metodo estatico que ordena el arreglo de caracteres
        Arrays.sort(caracteres); 
        
        //Creo un objeto de tipo String pasandole un argumento a su constructor y retorno el objeto de tipo String
        //Asigna un nuevo String para que represente la secuencia de caracteres contenidos actualmente en el argumento de array de caracteres.(API JAVA)
        return new String(caracteres);
    
    }
    
    //Anagrama
    public static boolean esAnagrama(String cadena,String posibleAnagrama){
    //Convertir a minusculas, reemplazar signos de puntuacion y reemplazar vocales acentuadas
    cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        posibleAnagrama = posibleAnagrama.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
    
    //Ordenar de la misma manera es decir ambas cadenas de forma alfabetica
    cadena = ordenar(cadena);
    posibleAnagrama = ordenar(posibleAnagrama);
    
    //Regresar resultado de la comparacion
    return cadena.equals(posibleAnagrama);
    }
    
   
 
}
