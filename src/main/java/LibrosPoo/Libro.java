
package LibrosPoo;


public class Libro {
    //Atributos
  private int isbn;
  private String titulo;
  private String autor;
  private int no_paginas;

    //Constructor
    public Libro() {
    }

    //Constructor con 4 argumentos
    public Libro(int isbn, String titulo, String autor, int no_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.no_paginas = no_paginas;
        
        
        
        
    }

    //Metodos getter y setter
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getNo_paginas() {
        return no_paginas;
    }

    public void setNo_paginas(int no_paginas) {
        this.no_paginas = no_paginas;
    }

    @Override
    public String toString() {
        return "El libro " + titulo + " con isbn " +  isbn + " creado por el autor " + autor + " tiene " + no_paginas + " paginas ";
    }



  
}
