package clase09;

public class Clase09 {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        alu.setId(1);
        alu.setNombre("Sisu");
        alu.setApellido("Sasu");
        System.out.println("El ID del primer alumno es: " + alu.getId() + ". El nombre de dicho alumno es " + alu.getNombre() + " y su apellido es " + alu.getApellido() + ".");
    }
    
}
