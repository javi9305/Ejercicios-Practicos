
package sistemaLibrosPoo;



public class LibroDigital extends Libro {
    private double tamanoArchivo;

    public LibroDigital(String titulo, String autor, String isbn, double precio,double tamanoArchivo) {
        super(titulo, autor, isbn, precio);
        this.tamanoArchivo = tamanoArchivo;
    }
    
    @Override
    public void mostrarInformacion(){
     super.mostrarInformacion();
        System.out.println("Tamaño del archivo: " + tamanoArchivo + "MB");
    
    }
    
}
