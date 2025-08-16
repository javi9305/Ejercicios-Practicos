package dibujaarcoirisPoo;


import javax.swing.JFrame;




public class PruebaDibujoArcoIris extends JFrame{
    
    public static void main(String[] args) {
        //Creo un objeto de tipo DibujoArcoiris
        DibujoArcoIris panel = new DibujoArcoIris();
        //Creo un objeto de tipo JFrame
        JFrame aplicacion = new JFrame();
        //EXIT_ON_CLOSE: Finaliza la aplicación cuando se cierra la ventana.
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel); //agrego el objeto panel al JFrame que en este caso se llama aplicacion
        aplicacion.setSize(400, 250); //le coloco un tamaño
        aplicacion.setVisible(true); //coloco true para ser visible
    }
    
}
