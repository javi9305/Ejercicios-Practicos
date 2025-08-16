
package Agregacion;


public class Main {
    public static void main(String[] args) {
        //Creo un objeto de tipo Refrigerador pasando un argumento
        Refrigerador r1 = new Refrigerador("Sony");
        
        //Creo 2 objetos de tipo Alimentos pasando 2 argumentos
        Alimento a1 = new Alimento("Leche",5);
        Alimento a2 = new Alimento("Huevo",3);
        
        //invoco el metodo agregarAlimento de la clase Refrigerador
        r1.agregarAlimento(a1);
        r1.agregarAlimento(a2);
        //invoco el metodo mostrar de la clase Refrigerador
        r1.mostrar();
    }
    
}
