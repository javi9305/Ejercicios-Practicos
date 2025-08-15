
package Ciclos;

import javax.swing.JOptionPane;


public class PositivosYNegativos {

  
    public static void main(String[] args) {
        //Declaracion de variables
       int numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
       float media_pos,media_neg;
       
       //Ciclo for
       for(int i=1;i<=10;i++){
           //Se pide el numero
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
       
       //se verifica si el numero es igual a 0
       if(numero==0){    
       
         conteo_ceros++; //Aumentamos en 1 el conteo de 0.
       }
       //se verifica si el numero es mayor a 0 sera positivo
       else if(numero>0){   
         suma_pos += numero;    //suma iterativa de posivos.
         conteo_pos++;
       
       }
       //De lo contrario el numero sera negativo
       else{    
       
           suma_neg += numero;  //suma iterativa de negativos
           conteo_neg++;
       }
       
       }
       
       //Se verifica si el conteo tiene 0
        if(conteo_pos ==0){
        
       System.out.println("No se puede sacar la media de los posivos");
        
        }
        //De lo contrario se sacara la media de los positivos
        else{
        
        media_pos = (float)suma_pos/conteo_pos;
        System.out.println("La media de los numeros positivos es:"+media_pos);
        
        }
       
        //Se verifica si el conteo tiene 0
        if(conteo_neg==0){
        
        System.out.println("No se puede sacar la media de los negativos");
        
        }
        //De lo contrario se sacara la media de los negativos
        else{
        media_neg = (float)suma_neg/conteo_neg;
       System.out.println("La media de los numeros negativos es:"+media_neg);
        
        }
        //se muestra cuantos ceros se conto
        System.out.println("la cantidad de ceros es:"+conteo_ceros);
        
        }
       
    }
    

