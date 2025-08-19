
package sistemaObjetoPerdidos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorObjetosPerdidos {
    private ArrayList<ObjetoPerdido> objetos;    
 
 
public GestorObjetosPerdidos(){
  objetos = new ArrayList<>();
}


public void agregarObjeto(ObjetoPerdido obj){
 objetos.add(obj);
    System.out.println("Objeto agregado correctamente");

}


public ArrayList<ObjetoPerdido> obtenerNoReclamados(){
    
    ArrayList<ObjetoPerdido> noReclamados = new ArrayList<>();
    
    for (ObjetoPerdido obj: objetos) {
        
        if(!obj.estaReclamado()){
            noReclamados.add(obj);
        }
    }

    if(noReclamados.isEmpty()){
        System.out.println("No hay objetos no reclamados");
    }else{
        System.out.println("Objetos no reclamados: ");
        for (int i = 0; i < noReclamados.size(); i++) {
            System.out.println((i + 1)+ ". " + noReclamados.get(i));
            
        }
    }
    
    return noReclamados;
   
}

public void reclamarObjeto(ArrayList<ObjetoPerdido> listaObjetoPerdidos){
        Scanner consola = new Scanner(System.in);
        if (listaObjetoPerdidos.isEmpty()) {
            System.out.println("No hay objetos por reclamar");
        } else {
            System.out.println("Seleccione el numero del objeto a reclamar");

            for (int i = 0; i < listaObjetoPerdidos.size(); i++) {
                System.out.println((i+1) + "." + listaObjetoPerdidos.get(i));
            }
            
            System.out.println("Opcion: ");
            int indice = consola.nextInt();
            consola.nextLine(); //Limpiar el buffer

            if (indice >= 1 && indice <= listaObjetoPerdidos.size()) {
                ObjetoPerdido objetoSeleccionado = listaObjetoPerdidos.get(indice - 1);
                objetoSeleccionado.marcarComoReclamado();
                System.out.println("Objeto marcado como reclamado");

            } else {
                System.out.println("Indice inválido");
            }

        }

    }
    

public void mostrarTodos(){
    for (int i = 0; i < objetos.size(); i++) {
        System.out.println((i) + "." + objetos.get(i)); 
    }
   

} 
}
