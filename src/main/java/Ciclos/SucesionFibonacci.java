
package Ciclos;

/**
 *
 * @author javie
 */

//sucesion de fibonacci : 1,1,2,3,5,8,13,22,35,57
public class SucesionFibonacci {
    public static void main(String[] args) {
        calcularFibonacci();
    }
    
    
    
    
    public static void calcularFibonacci(){
     //Declaracion e inicializacion de variables locales
     int limite = 10;
     int num1 = 0;
     int num2 = 1;
     int contador = 0;
     int suma = 0;
     
     //Impresion de numeros 1 y numeros 2
       System.out.println(num1);
       System.out.println(num2);
        
       //Mientras contador sea menor al limite 
        while(contador < limite){
        
        
        suma = num1 + num2; //realiza la suma de num1 y num2
        
            System.out.println(suma); //Imprime lo que contiene la suma
            num1 = num2; //lo que contiene num2 lo asigna a num1
            num2 = suma;// lo que contiene la suma lo asigna a num2
            
            contador++; //incrementa el contador en 1 y almacena su valor por cada iteraccion
        }
       
    }
    
     
}
