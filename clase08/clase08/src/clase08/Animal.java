package clase08;

public abstract class Animal {

    private int id_animal;
    private String descripcion;

    public abstract void hacerSonido();

    public void hacerSonido(String nombreAnimal) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
}
