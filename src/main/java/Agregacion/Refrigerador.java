
package Agregacion;


public class Refrigerador {
    //Atributos
    private final String marca;
    private int cantidadTotalAlimentos;
    private final Alimento[] alimentos;
    
    //Constructor
    public Refrigerador(String marca){
      this.marca = marca;
      this.cantidadTotalAlimentos = 0;
      this.alimentos = new Alimento[3];
    }
    //Metodo para agregarAlimento que recibe un argumento de tipo Alimento
    public void agregarAlimento(Alimento nuevoAlimento){
     
        //Verifica si la cantidad total de alimentos es menor a 3
        if(cantidadTotalAlimentos < 3 ){
        
            //el nuevoAlimento recibido es guardado en el arreglo alimentos
            alimentos[cantidadTotalAlimentos] = nuevoAlimento;
            cantidadTotalAlimentos++; //Contador para saber la cantidad total de alimentos menor a 3
        }
    
    }
    
    public void mostrar(){
        
        System.out.println("Marca: " + this.marca);
        System.out.println("Cantidad total de alimentos: " + this.cantidadTotalAlimentos);
    
        //Recorre el arreglo alimentos
        for (int i = 0; i < cantidadTotalAlimentos; i++) {
            alimentos[i].mostrarAlimentos();
        }
    }
    
}
