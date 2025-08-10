
package Arreglos;


public class ForEachNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nombres = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis"};
        /*
        
        for(int i=0;i<nombres.length;i++){
        System.out.println(nombres[i]);
        
        }
        
        */
        
        for(String i:nombres){
            System.out.println("Nombres:" +i);
        
        }
        
    }
    
}
