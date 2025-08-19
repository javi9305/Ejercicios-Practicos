
package Arreglos;

import java.util.HashSet;

/*
un hashSet en java no permite elementos duplicadoss, asi que se puede
recorrer el arreglo y tratar de insertar cada elemento en el set.

si un elemento ya estaba es repetido


*/
public class repetidos3 {
    public static void main(String[] args) {
         int[] arreglo = {1,2,3,4,5,3};
       
       boolean tieneDuplicados = false;
       
       HashSet<Integer> elementos = new HashSet<>();
       
       for(int num : arreglo){
        if(elementos.contains(num)){
         tieneDuplicados = true;
         break;
        }
        else{
            
         elementos.add(num);
        }
        
       }
       
       if(tieneDuplicados){
           System.out.println("El arreglo tiene elementos repetidos");
       }
       else{
           System.out.println("El arreglo NO tiene elementos repetidos");
       }
    
    }
}
