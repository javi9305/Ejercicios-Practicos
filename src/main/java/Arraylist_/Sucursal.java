
package Arraylist_;

import java.util.ArrayList;


public class Sucursal {
    private ArrayList<Intrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void agregarIntrumento(Intrumento ins){
    this.instrumentos.add(ins);
    }
    
    public void listarInstrumentos(){
        for (Intrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }
    
    
    public ArrayList<Intrumento> instrupementosPorTipo(TipoIntrumento tipo){
     
        ArrayList<Intrumento> instEncontrados = new ArrayList<>();
        
        for (Intrumento instrumento : instrumentos) {
            if(instrumento.getTipo()== tipo){
              instEncontrados.add(instrumento);
            }
        }
        
        
        return instEncontrados;
        
        
    }
    
    
     public Intrumento borrarInstrumento(String ID){
      //buscarIntrumentoPorID
       Intrumento insABorrar = buscarInstrumento(ID);
       
      //si existe, borrarlo
  
      this.instrumentos.remove(insABorrar);
     
      return insABorrar;
     }
     
     private Intrumento buscarInstrumento(String ID){
      int i = 0;
      Intrumento insEncontrado = null;
      while(i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID)){
       i++;
      }
      if(i < instrumentos.size()){
        insEncontrado = this.instrumentos.get(i);
      }
      
       return insEncontrado;
     }
    
     
     public double[] porcInstrumentosPorTipo(){
       final int CANT_INSTRUMENTOS = TipoIntrumento.values().length;
         
         double[] porcentajes = new double[CANT_INSTRUMENTOS];
      
         for(Intrumento instrumento : instrumentos){
            porcentajes[instrumento.getTipo().ordinal()]++;
         }
         absolutoPorcentaje(porcentajes);
        return porcentajes;
     }
     
     
     private void absolutoPorcentaje(double[] porcentajes){
         for (int i = 0; i < porcentajes.length;i++) {
             porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();
         }
     }
    
    
    
}
