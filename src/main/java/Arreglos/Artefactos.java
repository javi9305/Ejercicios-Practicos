/*
Un cliente realiza la siguiente compra de artefactos, plancha, licuadora,
lavadora y cocina, si la compra supera los 1200, recibe un descuento de 17 %,
mostrar el precio de cada artefacto, así como el monto, el descuento y el pago 
total si le corresponde un descuento.

*/

package Arreglos;


public class Artefactos {
    public static void main(String[] args) {
      
        /*Arreglos que almacenan datos de tipo String y de tipo double */
      
      String artefactos[] = {"Plancha","Licuadora","Lavadora","Cocina"};
      double precios[] = {450.12,800.21,1023.99,1543.30};
      //Inicializacion de variables
      double totalCompra = 0; 
      double descuento;
      
      //Se suma los precios del arreglo
        for (int i = 0; i < precios.length; i++) {
            totalCompra+= precios[i];
            
            System.out.println(artefactos[i] + " " + precios[i]);
            
        }
        
        System.out.println("Total de la compra: " + totalCompra);
        
        //verifica si la compra es mayor a 1200
        if(totalCompra>=1200){
               
            
         descuento = totalCompra * 0.17; //realiza la operacion para sacar el descuento
         totalCompra-=descuento; // total de la compra - descuento 
         System.out.println("descuento de: " + descuento);
         System.out.println("el total de la compra con descuento es: " + totalCompra);
        }
        
        else{
        
            System.out.println("Compra sin descuento");
            
        }
        
        
    }
   
    
    
    
}
