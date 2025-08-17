
package masacorporalPoo;


public class Persona {
    
   //Declaracion de constantes
   private final static char sexo_por_defecto = 'H';  
   public final static int debajoDelPesoIdeal = -1;
   public final static int pesoIdeal = 0;
   public final static int sobrepeso = 1;
   
   //Declaracion de atributos
   private String nombre;
   private int edad;
   private String dni;
   private double peso;
   private double altura;
   private char sexo;
   
   //Constructor por defecto
   public Persona(){
    /*
     Se envian 5 argumentos al constructor   
    */
    this("",0,sexo_por_defecto,0.0,0.0);
   }

   //Constructor con 2 argumentos
    public Persona(String nombre, int edad,char sexo) {
        //se envian 5 argumentos al contructor  
        this(nombre,edad,sexo,0.0,0.0);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    //Constructor con 5 argumentos
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        comprobarSexo();
    }
 //Metodos getter y setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
   
    //Metodo para calcular el peso
   public int calcularIMC(){
   
       var imc = peso/(altura*altura); 
       if(imc<20){
        return debajoDelPesoIdeal;
       }
       
       else if(imc >=20 && peso <=25){
          return pesoIdeal;
          }
       
       else{
       return sobrepeso;
       }
       
   }
   
   //Metodo para saber si es mayor de edad
   public boolean esMayorDeEdad(){
   
       return edad > 18;
   
   }
   
   //Metodo para comprobar el sexo
   public void comprobarSexo(){
       String sexo;
   if(this.sexo != 'H' || this.sexo!= 'M'){
    this.sexo = sexo_por_defecto;
    
   }
   else
       if(this.sexo == 'H'){
        sexo = "Hombre";
       }
       else{
        sexo = "Mujer";         
       }
   
   }
   
   public String generarDni() {
        final int divisor = 23; //23 es el numero de letras que tiene el arreglo "letras" el cual se encuentra en el metodo generaLetraDNI
 
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int posicionLetra = numDNI - (numDNI / divisor * divisor);
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(posicionLetra);
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
        return dni;
    }
   
//Genera la letra DNI
   private char generaLetraDNI(int posicionLetra) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[posicionLetra];
    }
   
   //Sobreescribe el metodo toString
    @Override
    public String toString() {
        return "Informacion de la Persona{" + 
                "nombre=" + nombre + "\n "
               + "sexo=" + sexo + "\n"
               + " edad=" + edad + "\n "
               + "dni=" + dni + "\n "
               + "peso=" + peso + "\n "
               + "altura=" + altura + '\n';
    }
   
}
