
package EstaticoEjercicio3;


public class Principal {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("pepe",1000);
        CuentaBancaria c2 = new CuentaBancaria("laura",3000);
        CuentaBancaria c3 = new CuentaBancaria("joel",4000);
        
        c1.depositar(500);
        c2.depositar(300);
        c3.depositar(100);
        
        CuentaBancaria.mostrarEstadisticasBanco();
        
        c1.retirar(700);
        c2.retirar(100);
        c2.retirar(300);
        
         CuentaBancaria.mostrarEstadisticasBanco();
        
    }
}
