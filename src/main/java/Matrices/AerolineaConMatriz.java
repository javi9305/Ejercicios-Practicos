/*
Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente,
uno por la mañana, otro al mediodia y otro por la noche. Para administrar estos datos, utiliza
una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de 
asientos disponibles por Ejemplo:

                        0          1         2
                      Mañana     Mediodia   Noche
0   Rio de janeiro    120          15        30
1   Cancun             65           1         2
2   Madrid              4          52         7
3   Roma               46          32        16
4   Milan              64          23        11
5   Iguazu             61          12        91


1.Se necesita un programa que permita la carga de la matriz con la cantidad
de asientos para cada vuelo

2. al mismo tiempo, el programa debe permitir a un usuario ingresar el numero de
destino al que quiere dirigirse, el numero de vuelo(dependiendo si quiere viajar a la
mañana, al mediodia o a la noche) y la cantidad de pasajes que necesita.

3.a partir de la solicitud del usuario, el programa debe controlar si hay la cantidad
suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que asi
sea, se debe mostrar un cartel por pantalla que diga " su reserva fue realizada
con exito" y se debe descontar del total de asientos los solicitados por el usuario.
En cado de no haber mas asientos disponibles, se debe informar otro cartel que diga
"disculpe, no se pudo completar su operacion dado que no hay asientos disponibles"


Desde la compañia de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se hacen
por dia. Por lo cual, para finalizar las ventas se ingresa la palabra "finish".
*/
package Matrices;

import java.util.Scanner;


public class AerolineaConMatriz {
    public static void main(String[] args) {
     //Creamos la matriz vuelos e 6 x 3 donde 6 es el destino y 3 son los horarios
    int vuelos[][] = new int[6][3];
    
    //Cargamos la matriz
    Scanner consola = new Scanner(System.in);
     //Agregamos los datos a la matriz se empieza de 0 - 0, 0 - 1, 0 - 2, luego de 1 - 0, 1 - 1, 1 - 2 asi sucesivamente 
        for (int filas = 0; filas < 6; filas++) {
            
            for (int columnas = 0; columnas < 3; columnas++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + filas + "horario: " + columnas);
                vuelos[filas][columnas] = consola.nextInt();
                
            }
        }
   
    //Venta de asientos
    Scanner consola2 = new Scanner(System.in);
    String bandera = "";
    int destino,horario,asientos;
    //Mientras bandera sea diferente de finish ejecutara su contenido
    
    while(!bandera.equalsIgnoreCase("finish")){
        //Introduce los datos
        System.out.println("Ingrese el N° de destino");
        destino = consola.nextInt();
        System.out.println("Ingrese el horario de vuelo");
        horario = consola.nextInt();
        System.out.println("Ingrese la cantidad de asientos");
        asientos = consola.nextInt();
        
        //Verifica que destino y horario no salga del rango del arreglo (0(destino) - 0(horario), 0 - 1, 0 - 2)
        if (destino >= 0 && destino <= 5) {
            if (horario >= 0 && horario <= 2) {

                //Verica que lo que contiene vuelos sea mayor o igual a asientos
                if (vuelos[destino][horario] >= asientos) {
                    System.out.println("Su reserva fue realizada con exito");
                    //Actualiza lo que contiene la matriz vuelos es decir resto los asientos que se ocupararon
                    vuelos[destino][horario] = vuelos[destino][horario] - asientos;

                } else {
                    System.out.println("No hay asientos disponibles");
                }
            }
            else{
                System.out.println("Horario no existente. Ingrese entre 0 y 2");
            }
       
        }
        else{
         System.out.println("Destino no existente. Ingrese entre 0 y 5");
        }
       
        System.out.println("¿Desea continua reservando?. Ingrese finish para terminar o"
        + "cualquier valor para seguir");
        
        bandera = consola2.next();
    
    }
    
    
    }
   
    
}
