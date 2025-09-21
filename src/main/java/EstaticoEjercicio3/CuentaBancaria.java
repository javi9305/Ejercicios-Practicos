
package EstaticoEjercicio3;

public class CuentaBancaria {
  private String titular;
  private double saldo;
  
  private static int totalCuentas;
  private static double saldoTotalBanco;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        CuentaBancaria.totalCuentas++;
        CuentaBancaria.saldoTotalBanco += saldo;
        
    }
  
  public void depositar(double monto){
   this.saldo += monto;
   CuentaBancaria.saldoTotalBanco += monto;
  }
  
  
  public void retirar(double monto){
      if(monto > this.saldo){
          System.out.println("Saldo insuficiente");
      }
      else {
       this.saldo -=monto;
       CuentaBancaria.saldoTotalBanco -=monto;
      }
   
  }
  
  
  public static void mostrarEstadisticasBanco(){
       if (CuentaBancaria.totalCuentas == 0) {
        System.out.println("No hay cuentas registradas todavía.");
       }
       else{
      System.out.println("el numero total de cuentas: " + CuentaBancaria.totalCuentas);
      System.out.println("el saldo total del banco: " + CuentaBancaria.saldoTotalBanco);
       }
       }
  
  
  
}
