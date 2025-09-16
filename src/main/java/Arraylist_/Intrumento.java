
package Arraylist_;


public class Intrumento {
    private String ID;
    private double precio;
    
    private TipoIntrumento tipo;

    public Intrumento(String ID, double precio, TipoIntrumento tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoIntrumento getTipo() {
        return tipo;
    }

    public String getID() {
        return ID;
    }
  
    
    @Override
    public String toString() {
        return "Intrumento{" + "ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
