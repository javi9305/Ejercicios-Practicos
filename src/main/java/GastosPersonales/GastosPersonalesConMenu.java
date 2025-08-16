/*
Un usuario quiere controlar sus gastos diarios durante una semana (7 días).
Crea un programa en Java que haga lo siguiente:

Pida al usuario cuánto gastó cada día.

Calcule el gasto total de la semana.

Calcule el gasto promedio diario.

Muestre el día en el que se gastó más dinero.

Muestre cuántos días gastó más de $500.

Si el gasto total supera $3000, mostrar un mensaje de ¡Cuidado! Estás gastando mucho.




*/
package GastosPersonales;

import java.util.Scanner;


public class GastosPersonalesConMenu {
    
 static Scanner consola = new Scanner(System.in);    
 static final int DIAS_SEMANA = 7; //constante
 static final double GASTO = 500.0;
 static double[] gastos = new double[DIAS_SEMANA];  
 static String[] categorias = new String[DIAS_SEMANA];
    public static void main(String[] args) {
      
        
        int opcion;
        
        do{
        mostrarMenu();
        opcion = consola.nextInt();
        
        switch(opcion){
            case 1:
                ingresarGastos();
                break;
            case 2:
                mostrarGastoTotal();
                break;
            case 3:
                mostrarPromedioDeGasto();
                break;
            case 4:
                mostrarDiasConMayoresGastos(); 
                break;
            case 5:
                gastoPorCategoria(categorias,gastos);
                break;
        
        }
        
        }
        while(opcion!=6);
              
    }
   
  // Menú
    public static void mostrarMenu() {
        System.out.println("\n------ Menú de Opciones ------");
        System.out.println("1. Introducir gastos");
        System.out.println("2. Mostrar gasto total");
        System.out.println("3. Mostrar promedio de gasto");
        System.out.println("4. Mostrar dia con mayor gasto");
        System.out.println("5. Mostrar gasto por categoria");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }    
    
    
     
public static void mostrarDiaconMayorGasto(){
 double mayor = 0.0;
        int diaMayorGasto = 0;
        int dia;
        for (dia = 0; dia < gastos.length; dia++) {
         
            if(mayor<gastos[dia]){
             mayor = gastos[dia];
             diaMayorGasto = dia;
            }
        
        }
    System.out.println("Dia con mayor gasto: " + (diaMayorGasto + 1) + " con $" + mayor);  
    }





public static void ingresarGastos(){
    for (int dia = 0; dia< gastos.length; dia++) {
         System.out.println("Introduce tu gasto del dia " + dia + ":");
        gastos[dia] = consola.nextDouble();
        consola.nextLine(); // limpiar buffer
        System.out.println("Introduce la categoria del gasto(comida,transporte,ocio,otros) " + dia + ":");
        categorias[dia] = consola.nextLine();
    }

    
}    
    
    
 public static void mostrarPromedioDeGasto(){
  double total = 0;
  
  for(double gasto : gastos){
   total += gasto;
  }
  
    double promedio = total/gastos.length;
     System.out.println("Gasto promedio diario: $ " + promedio);
  

 }
    
 public static void mostrarGastoTotal(){
  double total = 0;
  
  for(double gasto : gastos){
   total += gasto;
  }
     System.out.println("Gasto total de la semana: $ " + total);

     if(total > 3000){
         System.out.println("¡Cuidado!, Estas gastando mucho");
     }
 }
 
 
 public static void mostrarDiasConMayoresGastos(){
  int contadorDias = 0;
 
  for(double gasto : gastos){
    if(gasto >GASTO){
     contadorDias++;
    }
    
  }
     System.out.println("Numero de dias con gastos mayores a $" + GASTO + ":");
 }
 
 public static void gastoPorCategoria(String[]categorias,double[] gastos){
   double totalComida = 0;
   double totalTransporte = 0;
   double totalOcio = 0;
   double totalOtros = 0;
 
     for (int i = 0; i < categorias.length; i++) {
         
         switch(categorias[i].toLowerCase()){
             case "comida":
                 totalComida+=gastos[i];
                 break;
             case "transporte":
                 totalTransporte+=gastos[i];
                 break;
             case "ocio":
                 totalOcio+=gastos[i];
                 break;
             default:
                 totalOtros+=gastos[i];
         }
 
     }
    
  // Mostrar gastos por categoría
        System.out.println("\n🔍 Gasto por categorías:");
        System.out.printf("- Comida: $%.2f\n", totalComida);
        System.out.printf("- Transporte: $%.2f\n", totalTransporte);
        System.out.printf("- Ocio: $%.2f\n", totalOcio);
        System.out.printf("- Otros: $%.2f\n", totalOtros);
       
        
   // Determinar la categoría con más gasto
        double mayorCategoria = totalComida;
        String categoriaMayor = "Comida";

        if (totalTransporte > mayorCategoria) {
            mayorCategoria = totalTransporte;
            categoriaMayor = "Transporte";
        }
        if (totalOcio > mayorCategoria) {
            mayorCategoria = totalOcio;
            categoriaMayor = "Ocio";
        }
        if (totalOtros > mayorCategoria) {
            mayorCategoria = totalOtros;
            categoriaMayor = "Otros";
        }

        System.out.println("🏅 Categoría con más gasto: " + categoriaMayor + " ($" + mayorCategoria + ")");      
        
        
     }
  
 
    
}
    
    
    
