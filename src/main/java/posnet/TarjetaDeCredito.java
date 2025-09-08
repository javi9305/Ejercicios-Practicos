
package posnet;


public class TarjetaDeCredito {
 private final String entidadBancaria;
 private final String nroTarjeta;
 private double saldo;
 private final EntidadFinanciera entidadFinanciera;
 private final Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
 
 
 public boolean tieneSaldoDisponible(double monto){
   return saldo >= monto;
 }
 
 
 public void descontar(double monto){
  saldo = saldo - monto;
  
  
 }
 
 
 public String nombreCompletoTitular(){
  return titular.nombreCompleto();
 }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
 
 
 
 
 
}
