
package serieProductosPerecederoPoo;


public class Producto {
    //Atributos
   private String Nombre;
   private double Precio;

   //Constructor sobrecargado
    public Producto() {
    
    }

    public Producto(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    //Metodos getter y setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    //Se sobreescribe el metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       
        sb.append("Nombre=").append(Nombre);
        sb.append(", Precio=").append(Precio);
      
        return sb.toString();
    }
   
   //metodo no sobreescrito
   public double calcular(int cantidadProducto){
   
       return this.Precio*cantidadProducto;
   
   
   }
   
    
}
