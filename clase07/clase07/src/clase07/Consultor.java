package clase07;

public class Consultor extends Persona {

    String nombre_consultora;
    int num_consultora;

    public Consultor() {
    }

    public Consultor(String nombre_consultora, int num_consultora, int id, String nombre, String apellido, String domicilio, String telefono) {
        super(id, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultora = num_consultora;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(int num_consultora) {
        this.num_consultora = num_consultora;
    }
}
