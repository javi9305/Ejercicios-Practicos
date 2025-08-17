package sistemaLibrosPoo;

public class Principal {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros físicos y digitales
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "9780261103573", 15.99);
        LibroDigital libro2 = new LibroDigital("Cien años de soledad", "Gabriel García Márquez", "9780307474728", 9.99, 5.6);
        Libro libro3 = new Libro("1984", "George Orwell", "9780451524935", 12.99);
        Libro libro4 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "9780261103573", 15.99);
        
        
        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
         biblioteca.agregarLibro(libro4);
         
         
         
         
        // Mostrar todos los libros
        biblioteca.mostrarLibros();

        // Buscar un libro por ISBN
        System.out.println("\nBuscando libro con ISBN 9780307474728...");
        Libro encontrado = biblioteca.buscarPorISBN("9780307474728");
        if (encontrado != null) {
            encontrado.mostrarInformacion();
        }

        // Eliminar un libro por ISBN
        System.out.println("\nEliminando libro con ISBN 9780261103573...");

        biblioteca.eliminarPorISBN("9780261103573");

        // Mostrar los libros restantes
        biblioteca.mostrarLibros();
    }
}
 

