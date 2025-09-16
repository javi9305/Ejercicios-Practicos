
package Arraylist_;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
     
        
       
        Fabrica f = new Fabrica();
        cargarFabrica(f); 
        
        //f.listarIntrumentos();
        
        ArrayList<Intrumento> lista = f.instrupementosPorTipo(TipoIntrumento.VIENTO);
        
        for (Intrumento instrumento : lista) {
            System.out.println(instrumento);
        }
        
//        Intrumento borrado = f.borrarInstrumento("ZT431");
//        System.out.println("Se borro: " + borrado);
//        f.listarIntrumentos();
        
        double[] porcentaje = f.porcInstrumentosPorTipo("Sucursal A");
        
         for (int i = 0; i < porcentaje.length; i++) {
             System.out.println(porcentaje[i]);
        }
    }
    
    
    private static void cargarFabrica(Fabrica f){
    
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarIntrumento(new Intrumento("AD123", 23.12, TipoIntrumento.CUERDA));
        s1.agregarIntrumento(new Intrumento("BG232", 43.12, TipoIntrumento.VIENTO));

        s2.agregarIntrumento(new Intrumento("ZT431", 42.34, TipoIntrumento.PERCUSION));
        s2.agregarIntrumento(new Intrumento("BF541", 76.12, TipoIntrumento.CUERDA));
        s2.agregarIntrumento(new Intrumento("YT895", 67.12, TipoIntrumento.VIENTO));
    
    
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
    
    
    
}
