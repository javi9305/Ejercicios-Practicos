
package sistemaLibrosPoo;
 
import java.util.HashSet;
import java.util.Set;

 
public class Biblioteca {
  private Set<Libro> libros;

    public Biblioteca() {
        /*
        En esta linea:
        
        */
     this.libros = new HashSet<>();    
    }
    
  public boolean agregarLibro(Libro nuevoLibro){

    
  if (libros.add(nuevoLibro)) {
            System.out.println("Libro agregado: " + nuevoLibro.getIsbn());
            return true;
        } else {
            System.out.println("Error: ya existe un libro con el ISBN " + nuevoLibro.getIsbn());
            return false;
        }    
 
  }
  
  public Libro buscarPorISBN(String isbn){
     for(Libro libro : libros){
        if(libro.getIsbn().equals(isbn)){
           return libro;
        }
       
     }
      System.out.println("Libro no encontrado");
      return null;
  }
  
  
  public boolean eliminarPorISBN(String isbn){
    Libro libro = buscarPorISBN(isbn);
    
    if(libro != null){
      libros.remove(libro);
        System.out.println("Libro eliminado: " + isbn);
        return true;
    }
      return false;
  }
  
  
  public void mostrarLibros(){
      System.out.println("=== Lista de libros ===");
      for(Libro libro: libros){
       libro.mostrarInformacion();
          System.out.println("----");
      }
  
  }

   
  
}
