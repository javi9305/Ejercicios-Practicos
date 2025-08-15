
package Ciclos;

public class FizzBuzz {
    public static void main(String[] args) {
       
       VerificarMultiplos(); //Invocacion del metodo
    
    
    }
    
    public static void VerificarMultiplos() {

        //Declaracion e inicializacion de variables locales
        int numero = 0;
        int limite = 100;
        
         //Mientras que numero sea menor que limite
        while (numero < limite) {
            
            numero++; //incrementa numero en 1 y almacena su valor en la variable numero(numero = numero + 1) por cada iteraccion

            //si 3 y 5 son multiplos a la vez imprime el mensaje
            if (numero % 3 == 0 && numero % 5 == 0) {
            
                System.out.println("\nFizzBuzz");
            
            } //si numero es multiplo de 3 imprime el mensaje
            else if (numero % 3 == 0) {

                System.out.println("\nFizz");
                

            } //si numero es multiplo de 5 imprime el mensaje
            else if (numero % 5 == 0) {

                System.out.println("\nBuzz");
            } else {

                System.out.println("\n" + numero);
                
            }
        }
    }
    
    
    
}
