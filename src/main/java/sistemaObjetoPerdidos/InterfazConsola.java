
package sistemaObjetoPerdidos;
import java.util.ArrayList;
import java.util.Scanner;

public class InterfazConsola {
    GestorObjetosPerdidos gestor = new GestorObjetosPerdidos();
     static Scanner consola = new Scanner(System.in);
     
    public ObjetoPerdido leerDatosObjetoPerdido(){
      
      
        
        System.out.print("Nombre del objeto: ");
        String nombre = consola.nextLine();
        System.out.print("Descripción: ");
        String descripcion = consola.nextLine();
        
        return new ObjetoPerdido(nombre,descripcion);
    }
    
    
    
    
    
     public void mostrarMenu(){
        int opcion;
      
        do {
            System.out.println("\n--- OBJETOS PERDIDOS ---");
            System.out.println("1. Agregar objeto perdido");
            System.out.println("2. Ver objetos no reclamados");
            System.out.println("3. Marcar objeto como reclamado");
            System.out.println("4. Ver todos los objetos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = consola.nextInt();
            consola.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1:
                   ObjetoPerdido obj = leerDatosObjetoPerdido();
                   
                    gestor.agregarObjeto(obj);
                    break;
                case 2:
                   
                    gestor.obtenerNoReclamados();
                    break;
                case 3:
                    
                    ArrayList<ObjetoPerdido> noReclamados = gestor.obtenerNoReclamados();
                    gestor.reclamarObjeto(noReclamados);
                    break;
                case 4:
                    System.out.println("Todos los objetos:");
                    gestor.mostrarTodos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        while(opcion!=0);
    }  
}
