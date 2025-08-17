
package interfacesconclaseabstracta;


public class Picachu extends Pokemon implements IElectrico{

    public Picachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Picachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Hola, soy Picachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Hola, soy Picachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Picachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Picachu y este es mi ataque Puño trueno");
    }
    
}
