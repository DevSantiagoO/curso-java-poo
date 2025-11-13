package clase07;

public class Clase07 {

    public static void main(String[] args) {
        Empleado emple = new Empleado();
        emple.getCargo();

        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();

        Persona per = new Persona();
        Jefe jefe = new Jefe();

        per = jefe;
    }

}
