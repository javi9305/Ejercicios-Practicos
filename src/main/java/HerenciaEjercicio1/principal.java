
package HerenciaEjercicio1;


public class principal {
    public static void main(String[] args) {
        
        //Creo un objeto de tipo Persona que envia 3 argumentos
        Persona persona1 = new Persona("Julian","Perez",30);
        System.out.println("persona1 = " + persona1);
        
        //Creo un objeto de tipo Estudiante que envia 3 argumentos
        Estudiante estudiante1 = new Estudiante("Daniela","Fuentes",23);
        System.out.println("estudiante1 = " + estudiante1);
        
        //Creo un objeto de tipo Estudiante que envia 5 argumentos
        Estudiante estudiante2 = new Estudiante(12345,76.8F,"Fanny","Ramirez",24);
        System.out.println("estudiante2 = " + estudiante2);
        
        //invoco el metodo mostrarDatos del objeto estudiante 2
        estudiante2.mostrarDatos();
        estudiante2.metodoPrueba();
        
    }
   
}
