
package HerenciaEjercicio4;


public class Electrodomestico {
    //Atributos
   private String tipo;
   private String marca;
   private double potencia;

   //Constructor recibe 3 argumentos
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    //Metodos getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //Sobreescribo el metodo toString
    @Override
    public String toString() {
        return "Electrodomestico{" + "tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + '}';
    }
   
     //Metodo para obtener el consumo pasando las horas
    public double getConsumo(int horas){
      return potencia * horas; //multiplico la potencia por las horas
    
    }
    
    //Metodo para obtener el coste pasando las horas y el coste
    public double getCosteConsumo(int horas, double costeHora){
     return getConsumo(horas)* costeHora; //multiplico el consumo por el costeHora
    
    }
   
}
