
package interfacesconclaseabstracta;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
         System.out.println("Hola, soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Hola, soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPuniofuego() {
       System.out.println("Hola, soy Charmander y este es mi ataque puño de fuego");
    }

    @Override
    public void atacarLanzarllamas() {
        System.out.println("Hola, soy Charmander y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy Charmander y este es mi ataque Ascuas");
    }
    
}
