
package posnet;


public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
    
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAbonar,int cantidadCuotas){
        Ticket elTicket = null;
        if(validarDatos(tarjeta,montoAbonar,cantidadCuotas)){
         double montoFinal = montoAbonar + montoAbonar * recargoSegunCuotas(cantidadCuotas);
         
         if(tarjeta.tieneSaldoDisponible(montoFinal)){
           tarjeta.descontar(montoFinal);
           
           String nomApellido = tarjeta.nombreCompletoTitular();
           double montoPorCuota = montoFinal /cantidadCuotas;
           
           elTicket = new Ticket(nomApellido,montoFinal,montoPorCuota);
         }
        }
        
     return elTicket;
    }
    
    
    private boolean validarDatos(TarjetaDeCredito tarjeta,double montoAbonar, int cantidad){
       boolean esTarjetaValida = tarjeta != null;
       boolean esMontoValido = montoAbonar >0;
       boolean cantCuotasValidas = cantidad >=MIN_CANT_CUOTAS && cantidad <=MAX_CANT_CUOTAS;
        
       
        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }
    
    
    private double recargoSegunCuotas(int cantCuotas){
      return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
    
}
