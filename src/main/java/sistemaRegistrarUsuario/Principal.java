
package sistemaRegistrarUsuario;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        GestorUsuarios gestor = new GestorUsuarios();

        //Crear usuarios normales y premium
        Usuario u1 = new Usuario("Ana", "ana@gmail.com", 24);
        UsuarioPremium u2 = new UsuarioPremium("Luis", "luis@gmail.com", 30, "Gold");
        Usuario u3 = new Usuario("Carlos","carlos@gmail.com",20);
     
        gestor.agregarUsuario(u1);
        gestor.agregarUsuario(u2);
        gestor.agregarUsuario(u3);
        
        gestor.mostrarTodos();
        
        System.out.println("Buscando a carlos....");
        
        Usuario encontrado = gestor.buscarPorNombre("Carlos");
        
        if(encontrado != null){
         encontrado.mostrarInformacion();
        }
        
        System.out.println("\nEliminando a Ana...");
        gestor.eliminarPorNombre("Ana");
        
        gestor.mostrarTodos();
       
    }

    
}
