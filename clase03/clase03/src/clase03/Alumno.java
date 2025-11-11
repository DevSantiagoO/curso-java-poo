
package clase03;

public class Alumno {
      int id;
    String nombre;
    String apellido;
    
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre: ");
    }
    
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobado.");
        }else{
            System.out.println("No esta aprobado.");
        }
    }
}
