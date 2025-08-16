
package encapsulamientoCoche;


public class Uso_Coche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        
        miCoche.establece_color("amarillo");
        System.out.println(miCoche.dime_datos_generales());
        System.out.println(miCoche.dime_color());
        
        miCoche.configura_Asientos("si");
        System.out.println(miCoche.dime_asientos());
        
        miCoche.configura_climatizador("si");
        System.out.println(miCoche.dime_climatizador());
        System.out.println(miCoche.dime_peso_coche());
        System.out.println("El precio final del coche es: " + miCoche.precio_coche());
    }
}
