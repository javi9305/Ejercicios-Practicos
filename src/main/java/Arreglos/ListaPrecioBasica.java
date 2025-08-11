
package Arreglos;

import java.util.Scanner;


public class ListaPrecioBasica {
    public static void main(String[] args) {
        final int tamanio;
        
        Scanner consola = new Scanner(System.in);
        
        //Introducir tamanio del arreglo
        System.out.println("Cuantos productos desea mostrar?");
        tamanio = Integer.parseInt(consola.nextLine());
        
        //Crear Arreglos
        String productos[] = new String[tamanio];
        double precios[] = new double[tamanio];
        
        //Metodo añadir producto al arreglo
        System.out.println("Datos del Producto");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Introducir nombre");
            productos[i] = consola.nextLine();
            System.out.println("Introducir precio");
            precios[i] = Double.parseDouble(consola.nextLine());
            
        }
        //Mostrar la lista de productos y precios
        System.out.println("");
        System.out.println("Lista de productos y sus precios");
        for (int i = 0; i < tamanio; i++) {
            System.out.println(productos[i] + " " + precios[i]);
        }
        
    }
}
