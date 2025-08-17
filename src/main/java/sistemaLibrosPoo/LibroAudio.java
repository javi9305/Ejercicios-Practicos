
package sistemaLibrosPoo;


public class LibroAudio extends Libro{
    private int duracionAudio;

    public LibroAudio(int duracionAudio, String titulo, String autor, String isbn, double precio) {
        super(titulo, autor, isbn, precio);
        this.duracionAudio = duracionAudio;
    }
    
     @Override
    public void mostrarInformacion(){
     super.mostrarInformacion();
        System.out.println("La duracion del audio es de : " + duracionAudio + "Minutos");
    
    }
}
