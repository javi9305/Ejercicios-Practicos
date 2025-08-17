
package serieProductosPerecederoPoo;


public class NoPerecedero extends Producto {
    //Atributo
    private String Tipo;

    //Constructor con 3 argumentos
    public NoPerecedero(String Tipo, String Nombre, double Precio) {
        super(Nombre, Precio);
        this.Tipo = Tipo;
    }

    //Metodos getter y setter
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    //Se sobreescribe el metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NoPerecedero{");
        sb.append("Tipo=").append(Tipo);
        sb.append('}');
        return super.toString() + sb.toString();
    }
    
    
}
