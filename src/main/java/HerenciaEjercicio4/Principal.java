
package HerenciaEjercicio4;


public class Principal {
    public static void main(String[] args) {
        //Variable local
        int horas = 10;
        //Creo un objeto de tipo Electrodomestico pasando 3 argumentos
        Electrodomestico electrodomestico1 = new Electrodomestico("nevera","elpolo",0.58);
        
        System.out.println(electrodomestico1); //Imprimo el objeto
        
        
        double consumo = electrodomestico1.getConsumo(horas); //invoco el metodo obtenerConsumo pasando como argumento las horas
        double preciokwh = 0.5;
        double coste = electrodomestico1.getCosteConsumo(horas, preciokwh); //invoco el metodo obtenercosteconsumo pasando como argumentos las horas y el precio
        
        //imprimo el consumo y el coste
        System.out.println("ha consumido: " + consumo + "kW" + horas);
        System.out.println("Debe pagar: " + coste + "Euros");
        
        
        //Creo un objeto de tipo lavadora pasando 4 argumentos
        Lavadora lavadora1 = new Lavadora("Mabe",400,0.5,false);
        
        lavadora1.setAguaCaliente(true); //modifico el agua caliente a true
        
        //Imprimo el consumo y el coste de la lavadora invocando los metodos obtenerConsumo y ObtenerCoste
        System.out.println("Consumo de la lavadora en 10 horas: " + lavadora1.getConsumo(10));
        
        System.out.println("coste del consumo en horas: " + lavadora1.getCosteConsumo(10, 2));
    }
}
