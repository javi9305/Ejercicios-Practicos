
package serieProductosPerecederoPoo;


public class Perecedero extends Producto{
    //Atributo
    private int diasACaducar;

    //Constructor con 3 argumentos
    public Perecedero(int diasACaducar, String Nombre, double Precio) {
        super(Nombre, Precio);
        this.diasACaducar = diasACaducar;
    }

    //Metodos getter y setter
    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    //Se sobreescribe el metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("diasACaducar=").append(diasACaducar);
        
        return super.toString() + sb.toString();
    }

    
    @Override
    //Se sobreescribe el metodo calcular
    public double calcular(int cantidad){
    //se llama metodo calcular de la clase padre y retorna un double
        double precioFinal = super.calcular(cantidad);
        
        //dependiendo el dia a caducar realiza una operacion
        switch(diasACaducar){
            case 1:
                precioFinal/=4;
                break;
            
            case 2:
                precioFinal/=3;
                break;
                
                
            case 3:
                precioFinal/=2;
                break;
        
        }
       return precioFinal;
    }
    
}
