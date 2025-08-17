
package HerenciaEjercicio4;


public class Lavadora extends Electrodomestico {
    
    //Atributos
    private double precio;
    private boolean aguaCaliente;
       
    //Constructor que recibe 2 argumentos
    public Lavadora(String marca,double potencia){
     super("Lavadora",marca,potencia); //Constructor padre que envia 3 argumentos
     precio = 0;
     aguaCaliente = false;
     
    }
    
    //Constructor que recibe 4 argumentos
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente){
      super("Lavadora",marca,potencia); //Constructor padre que envia 3 argumentos
      this.precio = precio;
      this.aguaCaliente = aguaCaliente;
    
    }

    //Metodos getter y setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    //Metodo toString sobreescrito
    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "precio=" + precio + ", aguaCaliente=" + aguaCaliente + '}';
    }
    
    //Metodo getConsumo sobreescrito
    @Override
    public double getConsumo(int horas){
    
      if(aguaCaliente){
        return (getPotencia() + getPotencia() * 0.20) * horas;
      
      }
      else{
       return getPotencia() * horas;
      }
    }
    
    
}
