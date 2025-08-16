
package cuentabasicaPoo;


public class Cuenta {
   //Atributos
    private String titular;
    private double cantidad;

    //Contructores sobrecargados
    
    //Contructor con 1 argumento
    public Cuenta(String titular) {
        //Con this llamo al contructor de 2 argumentos
        this(titular,0);//para que se muestre el nombre del titular y la cantidad en cero, cuando solo se coloca al titular
        this.titular = titular;
    }

       //Contructor con 2 argumentos
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    //Metodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   
    //Metodo ingresar
    public void ingresar(double cantidad){
        //Verifica si la cantidad es menor a 0 
        if(cantidad <0){
            System.out.println("No puede ingresar una cantidad negativa");
        }
        else{
            //this.cantidad = this.cantidad + cantidad 
         this.cantidad += cantidad;
        }
         
    }
    
    //Metodo para retirar
public void retirar(double cantidad){

    //Verifica que si la cantidad es menor a 0 colocara el atributo cantidad en 0 (en este caso resta la cantidad del atributo menos la cantidad pasada por parametro)
    if((this.cantidad - cantidad) <0){
     this.cantidad = 0;
        System.out.println("La cantidad es: " + this.cantidad);
    }
    
    else{
        // //this.cantidad = this.cantidad - cantidad 
    this.cantidad -= cantidad;
        System.out.println(this.cantidad);
    }

}    
//Sobreescribe el metodo toString
     @Override
    public String toString() {
        return "el titular " + titular + " tiene " + cantidad + " de euros ";
    }
}
