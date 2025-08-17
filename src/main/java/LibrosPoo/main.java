
package LibrosPoo;


public class main {
    public static void main(String[] args) {
        //Creo 2 objetos pasando argumentos mediante su constructor
        
        Libro libro1 = new Libro(23456,"blanca nieves","Paco velasco",300);
        Libro libro2 = new Libro(12932,"Pinocho","Humberto perez",600);
        
        //Imprimo los libros
        System.out.println(libro1);
        System.out.println(libro2);
        
        //Verifico si el numero de paginas del libro 1 es mayor a libro 2
        if(libro1.getNo_paginas()>libro2.getNo_paginas()){
            System.out.println(libro1.getTitulo() + "tiene mas paginas");
        }
        else{
            System.out.println(libro2.getTitulo() + "tiene mas paginas");
        }
    }
}
