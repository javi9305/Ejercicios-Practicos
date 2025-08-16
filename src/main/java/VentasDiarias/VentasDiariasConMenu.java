
package VentasDiarias;

import java.util.Scanner;


public class VentasDiariasConMenu {
     static Scanner consola = new Scanner(System.in);
    static double[] ventas = new double[7];

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    llenarVentas();
                    break;
                case 2:
                    mostrarVentaTotal();
                    break;
                case 3:
                    mostrarPromedio();
                    break;
                case 4:
                    mostrarDiaMayorVenta();
                    break;
                case 5:
                    mostrarDiasVentasBajas();
                    break;
                case 6:
                    System.out.println("Saliendo del programa... 👋");
                    break;
                default:
                    System.out.println("Opción no válida ❌. Intenta otra vez.");
            }

        } while (opcion != 6);
    }

    // Menú
    public static void mostrarMenu() {
        System.out.println("\n------ Menú de Opciones ------");
        System.out.println("1. Introducir ventas");
        System.out.println("2. Mostrar venta total");
        System.out.println("3. Mostrar venta promedio");
        System.out.println("4. Mostrar día de mayor venta");
        System.out.println("5. Mostrar días con ventas menores a $100");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }

    // Funciones para cada acción
    public static void llenarVentas() {
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Introduce la venta del día " + (i + 1) + ": ");
            ventas[i] = consola.nextDouble();
        }
    }

    public static void mostrarVentaTotal() {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        System.out.println("📈 Venta total: $" + total);
    }

    public static void mostrarPromedio() {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        double promedio = total / ventas.length;
        System.out.println("💰 Promedio de ventas: $" + promedio);
    }

    public static void mostrarDiaMayorVenta() {
        double mayor = ventas[0];
        int dia = 0;

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                dia = i;
            }
        }
        System.out.println("🏆 El día de mayor venta fue el día " + (dia + 1) + " con $" + mayor);
    }

    public static void mostrarDiasVentasBajas() {
        int contador = 0;
        for (double venta : ventas) {
            if (venta < 100.0) {
                contador++;
            }
        }
        System.out.println("❌ Días con ventas menores a $100: " + contador);
    }
}
