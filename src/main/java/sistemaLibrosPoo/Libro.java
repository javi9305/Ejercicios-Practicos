
package sistemaLibrosPoo;

import java.util.Objects;


public class Libro {
private String titulo;
private String autor;
private String isbn;
private double precio;

    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        
        if(isbn.length()==13){
        this.isbn = isbn;
        }
        else{
            System.out.println("ISBN invalido");
        }
        
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        
        if(precio >0){
         this.precio = precio;
        }
        
        else{
            System.out.println("Precio invalido");
        }
        
    }

    
     // Sobrescribimos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return isbn.equals(libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
    
    

 public void mostrarInformacion(){
     System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Precio: $" + precio);
 }
}
