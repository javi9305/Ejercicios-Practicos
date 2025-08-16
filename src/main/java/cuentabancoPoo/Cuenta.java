
package cuentabancoPoo;

public class Cuenta {
    //Atributos
    private String nombreDelCliente;
    private String numeroDeCuenta;
    private double tipoDeInteres;
    private double saldo;
    
    //Constructor vacio

    public Cuenta() {
    }
    
    //Constructor que recibe 4 argumentos

    public Cuenta(String nombreDelCliente, String numeroDeCuenta, double tipoDeInteres, double saldo) {
        this.nombreDelCliente = nombreDelCliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;
    }
    
    //Constructor copia que recibe un objeto de tipo Cuenta
    public Cuenta(Cuenta c){
    this.nombreDelCliente = c.nombreDelCliente;
        this.numeroDeCuenta = c.numeroDeCuenta;
        this.tipoDeInteres = c.tipoDeInteres;
        this.saldo = c.saldo;
    
    }
    
    //Getter y Setter

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    //Metodo que ingresa dinero a la cuenta
    public boolean ingreso(double cantidad){
    
    boolean ingresoCorrecto = true;
    
    //verifica si la cantidad es menor a 0, ya que una cantidad no puede ser negativa
    if(cantidad<0){
     ingresoCorrecto = false;//si es negativa la cantidad, cambia de true a false
        System.out.println("No puede colocar una cantidad negativa");
    
    }
    
    else{
     this.saldo+=cantidad;//this.saldo = this.saldo ´+ cantidad
    
    }
    
    return ingresoCorrecto;
    
    }
    
    //Metodo que permite retirar dinero
    public boolean reintegro(double cantidad){
    
        boolean reintegroCorrecto = true;
        
        //verificamos que el saldo sea menor o igual a la cantidad colocada,si se cumple cambia a false.
       if(cantidad < 0 || this.saldo <= cantidad){
       reintegroCorrecto = false;
       
       }
    else{
        //En caso contrario de que sea mayor el saldo, restara el saldo menos la cantidad.
        this.saldo -= cantidad;//this.saldo = this.saldo - cantidad;        
               
               }
       
       return reintegroCorrecto; //dependiendo en que condicion entre,es lo que devolvera.
    
    }
    
    //Metodo para transferir
    public boolean transferencia(Cuenta c, double cantidad){
    //Declaracion de variable de tipo boolean
    boolean correcto = true;
    
    if(cantidad <0){
     correcto = false;
    }
    else if(this.saldo >=cantidad){
    reintegro(cantidad);
    c.ingreso(cantidad);
    
    }
    else{
    correcto = false;
    
    }
    
    return correcto;
    }
    
    
}
