
package Asociacion;
/*
las clases mantienen referencias a otras clases como atributos.
Eso es exactamente lo que define una relación de asociación 
en orientación a objetos:

✅ Una clase tiene como atributo o miembro a otra clase, o 
la usa directamente dentro de sus métodos o constructores.


*/



public class Ejemplo1 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan lopez");
        Doctor doctor = new Doctor("Dr. perez",paciente);
        
        
        doctor.atender();
        
    }
}

class Doctor{
  String nombre;
  Paciente paciente; //asociacion: el doctor atiende a un paciente
  
  Doctor(String nombre,Paciente paciente){
   this.nombre = nombre;
   this.paciente = paciente;
  }
  
  void atender(){
      System.out.println(this.nombre + "esta atendiendo a " + paciente.nombre);
  }
  
}


class Paciente{
  String nombre;
  
  Paciente(String nombre){
   this.nombre = nombre;
  
  }

}