
package posnet;


public class Principal {
    public static void main(String[] args) {
    Posnet posnet = new Posnet();
    Persona p = new Persona("403030","Pepe","lopez","2321212","pepelopez@gmail.com");
    TarjetaDeCredito t = new TarjetaDeCredito("FakeBank","12345332333333",15000,EntidadFinanciera.BIRZA,p);  
    
        System.out.println("Tarjeta antes del pago");
        System.out.println(t);
        
        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    
    }
   
    
   
}
