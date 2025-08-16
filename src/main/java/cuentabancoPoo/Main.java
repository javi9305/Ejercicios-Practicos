
package cuentabancoPoo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Variables
        String nombreCliente, numeroCuenta;
        double tipoDeInteres,importe;
        
        //Objeto tipo Scanner para introducir datos por teclado
        Scanner consola = new Scanner(System.in);
        
        //Se crea un objeto sin argumentos,y se ejecutara el constructor vacio.
        Cuenta cuenta1 = new Cuenta();
        
        //Introducimos los datos
  
        System.out.print("Nombre : ");
        nombreCliente = consola.nextLine();
        System.out.print("Número de cuenta : ");
        numeroCuenta = consola.nextLine();
        System.out.print("Tipo de interes : ");
        tipoDeInteres =consola.nextDouble();
        System.out.print("Saldo: ");
        importe = consola.nextDouble();
        
        //Se coloca los datos en la cuenta 1 con set
        cuenta1.setNombreDelCliente(nombreCliente);
        cuenta1.setNumeroDeCuenta(numeroCuenta);
        cuenta1.setTipoDeInteres(tipoDeInteres);
        cuenta1.setSaldo(importe);
        
    }
}
