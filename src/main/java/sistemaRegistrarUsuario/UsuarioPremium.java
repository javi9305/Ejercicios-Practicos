
package sistemaRegistrarUsuario;


public class UsuarioPremium extends Usuario{
    private final String nivel;

    public UsuarioPremium(String nombre, String correo, int edad,String nivel) {
        super(nombre, correo, edad);
        this.nivel = nivel;
    }
    
    
    @Override
    public void mostrarInformacion(){
     super.mostrarInformacion();
        System.out.println("Nivel Premium: " + nivel);
    }
    
}
