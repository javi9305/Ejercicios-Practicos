
package EstaticoEjercicio2;


public class Principal {
    public static void main(String[] args) {
         Auto a1 = new Auto("XYZ123","Tiaf","Azul",31230);
         Auto a2 = new Auto("XYZ124","Dorf","Rojo",42123);
         Auto a3 = new Auto("XYZ125","Geupot","Verde",52350);
         Auto a4 = new Auto("XYZ126","Dtroit","Rosa",10234);
         
         System.out.println(a1.precioPromocional());
         System.out.println(a2.precioPromocional());
         System.out.println(a3.precioPromocional());
         System.out.println(a4.precioPromocional());
         
         
        
         Auto.anularDescuento();
         System.out.println("");
         
         
         System.out.println(a1.precioPromocional());
         System.out.println(a2.precioPromocional());
         System.out.println(a3.precioPromocional());
         System.out.println(a4.precioPromocional());
    }
   
}
