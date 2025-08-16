/*
Imagina que eres el encargado de registrar las ventas diarias de una tienda durante 7 días. El programa debe:

Pedir al usuario ingresar las ventas de cada día (números decimales).

Guardarlas en un arreglo de double.

Calcular y mostrar:

📈 La venta total de la semana.

💰 La venta promedio diaria.

🏆 El día con mayor venta.

❌ Cuántos días hubo ventas menores a 100.0.

*/
package VentasDiarias;

import java.util.Scanner;


public class VentasDiariasOptimizado {
    
    static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        final int DIAS_SEMANA = 7;
        double[] ventas = new double[DIAS_SEMANA];

        llenarVentas(ventas);
        procesarVentas(ventas);
    }

    // 📥 Función para llenar el arreglo de ventas
    public static void llenarVentas(double[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = pedirVenta(i + 1);
        }
    }

    // 🛠️ Función principal que procesa todas las estadísticas
    public static void procesarVentas(double[] ventas) {
        double total = 0;
        int diaMayor = 0;
        int diasVentasBajas = 0;
        double mayorVenta = ventas[0];

        // Un solo recorrido para todo
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];

            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
                diaMayor = i;
            }

            if (ventas[i] < 100.0) {
                diasVentasBajas++;
            }
        }

        double promedio = total / ventas.length;

        // Mostrar resultados
        System.out.println("\n📈 Venta total de la semana: $" + total);
        System.out.println("💰 Venta promedio diaria: $" + promedio);
        System.out.println("🏆 El día con mayor venta fue el día " + (diaMayor + 1) + " con $" + mayorVenta);
        System.out.println("❌ Hubo " + diasVentasBajas + " días con ventas menores a $100.0");
    }

    // 🔢 Función para pedir una venta
    public static double pedirVenta(int dia) {
        System.out.print("Introduce la venta del día " + dia + ": ");
        return consola.nextDouble();
    }
}


