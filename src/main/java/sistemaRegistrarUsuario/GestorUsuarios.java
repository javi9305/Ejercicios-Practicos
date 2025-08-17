
package sistemaRegistrarUsuario;

import java.util.ArrayList;


public class GestorUsuarios {
   private final ArrayList<Usuario> usuarios = new ArrayList<>();
   
   public void agregarUsuario(Usuario u){
    usuarios.add(u);
       System.out.println("Usuario agregado: " + u.getNombre());
      
   }
   
   public Usuario buscarPorNombre(String nombre){
    for(Usuario usuario : usuarios){
        /*
        Metodo equalsIgnoreCase se utiliza para comparar dos cadenas de texto
        ignorando las diferencias entre mayusculas y minusculas
        */
      if(usuario.getNombre().equalsIgnoreCase(nombre)){
       return usuario;
      }
    
    }
    return null;
   }
   
    public boolean eliminarPorNombre(String nombre) {
        Usuario usuario = buscarPorNombre(nombre);

        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuario eliminado: " + nombre);
            return true;
        } else {
            return false;
        }

    }
   
    
    public void mostrarTodos(){
        System.out.println("=== Lista de usuarios ===");
    
        for(Usuario usuario : usuarios){
         usuario.mostrarInformacion();
            System.out.println("-----");
        }
    }
   
}
