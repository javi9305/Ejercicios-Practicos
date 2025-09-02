
package cajeroautomaticobasico;


public class cuentaBancaria {
    private String titular;
    private double saldo;

    public cuentaBancaria() {
        
    }

    public cuentaBancaria(String titular,double saldoInicial) {
        this.saldo= saldoInicial;
        this.titular = titular;
        
    }
    
    
    public void depositar(double monto){
        
        
        if(monto <= 0){
            System.out.println("el monto a depositar debe ser mayor a 0");
            
        }
        else{
          this.saldo += monto;
          System.out.println("monto depositado:" + monto);
        }
      
     
        
   
    }
    /*
     private boolean saldoDisponible(double monto){
     return saldo >=monto;
    
    este metodo puede ir dentro de un if
    }
    
    */
    
    public void retirar(double monto){
        if(monto <= 0){
            System.out.println("el monto a retirar debe ser mayor a 0");
        } 
        
        else if(monto > this.saldo){
        System.out.println("Saldo insuficiente. Tu saldo actual es:" + this.saldo);
        }
        
        else{
        this.saldo = this.saldo - monto;
        System.out.println("tu retiro es de: " + monto); 
        }      
          
      
       
    }
    
    
    public void mostrarInformacion(){
        System.out.println("Nombre del titular: " + titular);
        System.out.println("El saldo actual es: " + saldo);
        
    }
       
}
