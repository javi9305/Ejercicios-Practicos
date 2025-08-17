
package HerenciaEjercicio1;


public class Estudiante extends Persona {
    //Atributos
    private int codigoEstudiante;
    private float notaFinal;

    //Constructores Sobrecargados
    
    //Contructor vacio
    public Estudiante() {
    }

    //Contructor que recibe 3 argumentos
    public Estudiante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    //Contructor que recibe 5 argumentos
    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad); //llama al contructor padre
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    //Metodos getter y setter
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    //Metodo toString sobreescrito
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append(super.toString());
      
        sb.append("codigoEstudiante=").append(codigoEstudiante);
        sb.append(", notaFinal=").append(notaFinal);
        sb.append('}');
        return sb.toString();
    }
    
    //Metodo para mostrar los datos 
    public void mostrarDatos(){
        System.out.println("Este metodo muestra los getters o atributos de la clase padre que en este caso es Persona");
        System.out.println("Nombre: " + getNombre());
        System.out.println("\nApellido: " + getApellidos());
        System.out.println("\nEdad: " +getEdad());
        System.out.println("\nCodigo Estudiante: " + codigoEstudiante);
        System.out.println("Nota Final: " + notaFinal);
    
    }
   
    
    
}
