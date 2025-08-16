
package cuentabasicaPoo;


public class Principal {
    public static void main(String[] args) {
    
   //Creo 2 objetos de tipo Cuenta pasando argumentos
   Cuenta cuenta1 = new Cuenta("Jacobo perez");
   Cuenta cuenta2 = new Cuenta("Pedro gomez",600);
   
   //Ingresamos dinero a cuenta
   cuenta1.ingresar(300);
   cuenta2.ingresar(400);
   
   //Retiramos dinero de cuenta
   cuenta1.retirar(200);
   cuenta2.retirar(300);
   
     //Imprimimos cuanto dinero tienen las cuentas
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
    }
  
   
  
}
