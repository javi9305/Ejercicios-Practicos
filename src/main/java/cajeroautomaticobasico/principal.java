
package cajeroautomaticobasico;

import java.util.Scanner;


public class principal {
    Scanner consola = new Scanner(System.in);
    cuentaBancaria cuenta = new cuentaBancaria("javier gonzalez",500);
    public static void main(String[] args) {
    
        principal programa = new principal();
        programa.mostrarMenu();
        
    }
    
    public void mostrarMenu(){
     int opcion;
     
     
     
     do{
         System.out.println("Bienvenido al cajero de JaviBank");
         System.out.println("1.- Consultar Saldo");
         System.out.println("2.- Depositar Dinero");
         System.out.println("3.- Retirar dinero");
         System.out.println("4.- Salir");
         System.out.println("Elige una opcion:");
         
         opcion = consola.nextInt();
         System.out.println("");
         
 
         switch(opcion){
             case 1:cuenta.mostrarInformacion();
             break;
             
             case 2: 
                 System.out.println("Digite el monto a depositar:");
                 double montoDepositar = consola.nextDouble();
                 cuenta.depositar(montoDepositar);
                 break;
             case 3:
                 System.out.println("Digite el monto a retirar");
                 double montoRetirar = consola.nextDouble();
                 cuenta.retirar(montoRetirar);
                 break;
             case 4:
                 System.out.println("Saliendo....");
                 break;
             
             default:
                 System.out.println("Opcion invalida, intenta de nuevo");
         }
           
     }
     
     while(opcion!=4);
     
     
    }
}
