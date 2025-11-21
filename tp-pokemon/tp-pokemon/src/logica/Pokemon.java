package logica;

public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected String sexo;
    protected double peso;
    protected int temporadaQueAparece;
    protected String tipo;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();
}
