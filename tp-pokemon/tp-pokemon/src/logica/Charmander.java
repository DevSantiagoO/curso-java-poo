package logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño de fuego.");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas.");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas.");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje.");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Charmander y este es mi ataque añarazo.");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco.");
    }
    
}
