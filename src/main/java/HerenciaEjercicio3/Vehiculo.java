
package HerenciaEjercicio3;


public class Vehiculo {
  //Atributos
  private int id;
  private String marca;
  private String modelo;  
  
  //Constructor vacio
  public Vehiculo(){
  
  }

  //Constructor que recibe 3 argumentos
    public Vehiculo(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Constructor que recibe 2 argumentos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos getter y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
  
  
  
  
}
