package logica;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba.");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola de agua.");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja.");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidropulso.");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje.");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo.");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco.");
    }

}
