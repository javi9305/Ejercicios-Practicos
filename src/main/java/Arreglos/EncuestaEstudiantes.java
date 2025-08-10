package Arreglos;


import javax.swing.JOptionPane;
//video Introduccion al manejos de excepciones parte 1 en curso aprender a programar con java. de cero hasta hacer sistemas
/*************************************************************************************************
 * Clase que muestra el análisis de una encuesta.                                                *
 *                                                                                               *
 * Se pidió a veinte estudiantes que calificaran la calidad de la comida en la cafetería         *
 * estudiantil en una escala de 1 al 5, en donde 1 significa "pésimo" y 5 significa "excelente.  * 
 * Coloque las 20 respuestas en un arreglo entero y determine la frecuencia de cada calificación.* 
 *                                                                                               *
 *                                                                          *
 *************************************************************************************************/
public class EncuestaEstudiantes {
    
    public static void main(String[] args) {
        
    /***********************************************************************************  
     *  arreglo de respuestas de estudiantes (lo más común es que se introduzcan en    *
     *  tiempo de ejecución).                                                          *         
     ***********************************************************************************/
        int [] respuestas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        
    /************************************************************************
     *   arreglo de contadores de frecuencia.                               *
     *   este arreglo guardara los contadores de frecuencia, que ese         *
     *   es el arreglo que ayudara a determinar cuantos alumnos eligieron   * 
     *   una calificacion.                                                  *  
     ************************************************************************/
        int [] frecuencia = new int[6];
        
    /******************************************************************************** 
     *   Para cada respuesta, selecciona el elemento de respuestas y usa ese valor  *
     *   como índice de frecuencia para determinar el elemento a incrementar.       *
     *                             *
     *                                                                              *  
     ********************************************************************************/
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            try {
                //en el arreglo frecuencia se guarda cuantos alumnos dieron una calificacion de 1 a 5 
                //frecuencia[ respuestas [ respuesta ] ] = frecuencia[respuestas[respuesta]] + 1;  
                 frecuencia [respuestas [respuesta]] += 1;
                
            } catch (ArrayIndexOutOfBoundsException e) {
                                                                     
                JOptionPane.showMessageDialog(null, "Valor incorrecto: " + respuestas[respuesta]);
            }
            
        }
        
        //Impresion de valores
        System.out.printf("%s %10s\n", "Calificación", "Frecuencia");
        
        for(int calificacion = 1; calificacion < frecuencia.length; calificacion++){
            
            System.out.printf("%6d %10d\n", calificacion, frecuencia[ calificacion ]);
        }
        
    }
}
