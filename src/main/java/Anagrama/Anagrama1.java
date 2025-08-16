
package Anagrama;


public class Anagrama1 {
    public static void main(String[] args) {
        //Declaracion de variables 
        String cadena1 = "hola";
        String cadena2 = "mundo";
        boolean todosPresentes = true;
        
        //recorre cada caracter de cadena1
        for (int i = 0; i < cadena1.length(); i++) {
            //Asigno un caracter dependiendo de i por ejemplo en el primer recorrido i valdra 0, en el siguiente valdra 1 etc
            char ch = cadena1.charAt(i);
            
            //Verifica si el caracter de cadena1 esta presente en cadena2 devolviendo la posicion donde se encuentra
            if(cadena2.indexOf(ch) == -1){
              todosPresentes = false;
                System.out.println("El caracter " + ch + " no esta presente en la segunda cadena ");
            }
            
            else{
                System.out.println("El caracter " + ch + " esta presente en la segunda cadena ");
            }
        }
        
        
        if(todosPresentes){
            System.out.println("Todos los caracteres de la primera cadena estan presentes en la segunda cadena");
        }
        else{
            System.out.println("No todos los caracteres de la primera cadena estan presentes en la segunda cadena");
        }
    }
}
