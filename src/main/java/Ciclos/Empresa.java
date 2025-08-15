
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * Una empresa que se dedica  a la venta de desinfectantes necesita un 
 * programa para gestionar las facturas.Cada factura figura: el codigo del articulo,
 * la cantidad vendida en litros  y el precio por litro.se pide de 5 facturas
 * introducidas: facturacion total,cantidad en litros vendidos del articulo 1
 * y cuantas facturas se emitieron  de mas de $600.
 */
public class Empresa {

    public static void main(String[] args) {
        //Declaracion de variables
        int codigo,litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
       //Ciclo for
        for(int i=1;i<=5;i++){
            //Se piden los siguientes datos: codigo, cantidad de litros y el precio por litro
         codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" +i+"\nDigite el codigo:"));
         litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" +i+"\nDigite la cantidad en litros:"));
         precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N°" +i+"\nDigite el precio por litro:"));
         
         //Se realiza las operaciones correspondientes
         importeFactura = (float)litros*precioLitro; //Importe por factura
         facturacionTotal =+ importeFactura;          //suma iterativa de la facturas.
         //si el codigo es 1 se suma cada litro
         if(codigo == 1){
          litrosArticulo1 += litros;
         
         }
         //si el importe es mayor a 600 se hace un conteo para saber cuantas facturas fueron mayores a 600
         if(importeFactura>600){
         
         conteoMas600++;
         }
        }
        //se muestra el resultado
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total:" + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1:"+ litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600" + conteoMas600);
    }
    
}
