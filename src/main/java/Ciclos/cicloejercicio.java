
package Ciclos;

import java.util.Scanner;






public class cicloejercicio {
    
    public static void main(String[] args) {
    int arreglo[] = new int[5];
    Scanner consola = new Scanner(System.in);   
        
        
        for (int i = 0; i < arreglo.length; i++) {
          System.out.println("Dame un numero");
          arreglo[i] = consola.nextInt();
          
        }
        
        
        
        //mostrar
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if(arreglo[i]==arreglo[j]){
                    System.out.println("numero repetido:" + arreglo[i]);
                }
            }
        }
           
            
           
           
                   

    
    }
}

