package dibujaarcoirisPoo;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Desmuestra el uso de colores en un arreglo.
 * @author Javier Arturo
 */
public class DibujoArcoIris extends JPanel{
    
    //Define los colores indigo y violeta
    /*
    - creacion de colores a travez de los colores rgb.
    - la clase color tiene atributos
    modifier and type             field and descripcion
    static color                    black
    static color                    blue
    
    estos dos colores se crean antes ya que van en el arreglo ya que no se
    tiene el color violeta como estatico.
    */
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);
    
    
    
    
    //los colores a usar en el arco iris, empezando desde los más interiores
    // las dos entradas de color blanco producen un arco vacío en el centro.
    /*Arreglo de objetos tipo Color.
    
  Es posible tener arreglos de objetos (no de clases... recuerda que
  las clases son sólo la especificación de los objetos, no los objetos concretamente). 
  De manera que puedo tener arreglos de cualquier tiempo de objeto

            Persona[] personas = new Persona[5];
    
    
    
    */
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO,
        Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    public DibujoArcoIris(){
        setBackground(Color.WHITE);
    }
    /*
    El método paintComponent es un método especial que es llamado cuando es necesario. 
    Hasta cierto punto no somos nosotros quienes controlamos cuándo este método es llamado, 
    sino que lo hace java. Algunos aspectos de la programación java y en particular aspectos 
    relativos a interfaces gráficas son controlados por java en segundo plano.

El método paintComponent se encarga del re-pintado o re-dibujado de la interfaz 
    en diferentes situaciones, por ejemplo al mover una ventana, al cambiar sus 
    dimensiones, cuando hay cambios de foco, superposiciones y otras situaciones.
    Muchas de estas situaciones son detectadas automáticamente por java y se 
    produce una llamada automática al método paintComponent.

El método pocas veces (casi nunca) es llamado directamente por el programador. 
En cambio sí suele usarse con cierta frecuencia el llamar al método repaint() 
para establecer el redibujado de ciertos componentes a través de código controlado 
    por el programador (esto a su vez puede inducir una llamada en segundo plano al
    método paintComponent).
    
    
    
    
    
    */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radio = 20;
        
        //getWidth y getHeight pertenece a jpanel por eso no es necesario instanciar.
        //ancho/2 y alto -10
        int centroX = getWidth() /2;
        int centroY = getHeight() - 10;
        
        for ( int contador = colores.length; contador > 0 ; contador--){
            //establecer el color para el arco actual
            /*le estoy diciendo a g.setColor: vas a usar el sig.color.
            el color que vas a usar dibujante va a ser el que se encuentre en la
            posicion [contador - 1] del arreglo colores
            
            */
            g.setColor( colores [contador -1]);
            
            //rellena el arco desde 0 hasta 180 grados
            //dibuja un arco relleno
            
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;
                        
            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
       
        }
        int CentroX = 310;
        int CentroY = 10;
         g.setColor(Color.red);
	g.fillRect(CentroX, CentroY, 10, 10);
        
        System.out.println(CentroX);
        System.out.println(CentroY);
    }
    
    
}
