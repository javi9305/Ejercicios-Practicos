
package interfacesconclaseabstracta;

/*
¿Como me doy cuenta que es una interface y no una clase abstracta lo que necesito para diferenciar los 
ataques de los pokemnos electricos, agua, etc?

Porque lo unico que nos interesa son los poderes, los ataques, lo que pueda hacer un pokemon electrico, planta, de fuego,
no nos interesa las caracteristicas , ¿porque? porque las caracteristicas ya la tengo en la clase abstracta.

Cuando hay una especializacion  y va mas al "que hace algo" se utilizan interfaces, mientras cuando me interesa
"el que es"  utilizo clases abstractas.

*/

public abstract class Pokemon {
    //Declaracion de atributos
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
}
