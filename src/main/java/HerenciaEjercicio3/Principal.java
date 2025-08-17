
package HerenciaEjercicio3;


public class Principal {
    public static void main(String[] args) {
        //Creo un objeto de tipo Camion pasando 4 argumentos
        Camion camion = new Camion(3.5,1001,"Ford","2019");
        //Imprimo los atributos del objeto camion obteniendo mediante get
        System.out.println(camion.getId());
        System.out.println(camion.getMarca());
        System.out.println(camion.getModelo());
        System.out.println(camion.getCapacidad());
    }
   
}
