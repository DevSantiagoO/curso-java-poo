package logica;

public class TpPokemon {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();

        squirtle.atacarAranazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAranazo();
        charmander.atacarLanzallamas();
        bulba.atacarAranazo();
        bulba.atacarDrenaje();
        pika.atacarAranazo();
        pika.atacarImpactrueno();
    }

}
