
package HerenciaEjercicio2;


public class Coche extends Transporte {
    //Atributo
    private String modelo;

    //Constructor que recibe 3 argumentos
    public Coche(String modelo, double velocidad, String nombre) {
        super(velocidad, nombre); //llama al constructor padre pasando 2 argumentos
        this.modelo = modelo;
    }

    //Metodo getter y setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodo toString sobreescrito
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("modelo=").append(modelo);
        sb.append('}');
        sb.append(",").append(super.toString());
        return sb.toString();
    }
    
    
    
}
