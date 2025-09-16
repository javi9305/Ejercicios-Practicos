
package Arraylist_;

import java.util.ArrayList;


public class Fabrica {
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    
    public void agregarSucursal(Sucursal suc){
     this.sucursales.add(suc);
    }
    
    
    public void listarIntrumentos(){
     for(Sucursal sucursal: sucursales){
         System.out.println(sucursal.getNombre());
      sucursal.listarInstrumentos();
     }
    }
    
     public ArrayList<Intrumento> instrupementosPorTipo(TipoIntrumento tipo){
     
       ArrayList<Intrumento> instEncontrados = new ArrayList<>();
       
         for (Sucursal sucursal : sucursales) {
             //addAll: permite agregar todos los elementos en una coleccion existente. por ejemplo sucursal 1 tiene un listado de instrumentos de Viento y sucursal 2 tiene un listado de instrumentos de cuerda
             instEncontrados.addAll(sucursal.instrupementosPorTipo(tipo));          
         }
       return instEncontrados;
     }
     
     public Intrumento borrarInstrumento(String ID){
     Intrumento borrado = null;
     int i = 0;
     
     while(i < sucursales.size() && borrado == null){
        borrado = sucursales.get(i).borrarInstrumento(ID);
         i++;
     }
      return borrado;
     
     }
     
     
     public double[] porcInstrumentosPorTipo(String nombreSucursal){
       double[] porcentajes = null;
       Sucursal sucEncontrada = buscarSucursal(nombreSucursal);
       
       if(sucEncontrada != null){
         porcentajes =  sucEncontrada.porcInstrumentosPorTipo();
        }
       
       return porcentajes;
     
     }
     
     
      private Sucursal buscarSucursal(String nombreSucursal){
      int i = 0;
      Sucursal sucEncontrado = null;
      while(i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSucursal)){
       i++;
      }
      if(i < sucursales.size()){
        sucEncontrado = this.sucursales.get(i);
      }
      
       return sucEncontrado;
     }
     
     
     
     
}
