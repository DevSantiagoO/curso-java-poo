package clase08;

public class Perro extends Animal {

    private String nombre_Perro;
    private double peso;
    private double raza;
    private double sexo;

    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro.");
    }
}
