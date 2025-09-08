
package EstaticoEjercicio1;


public class Ticket {
    private static int contador;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String DNIPersona) {
        contador++;
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket");
        sb.append("numero=").append(numero);
        sb.append(", fechaCompra=").append(fechaCompra);
        sb.append(", DNIPersona=").append(DNIPersona);
       
        return sb.toString();
    }
    
     
}
