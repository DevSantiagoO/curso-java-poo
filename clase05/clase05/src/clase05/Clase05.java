package clase05;

import java.util.Scanner;

public class Clase05 {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(02, "San", "Fer");
        
        System.out.println("El ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2: " + alu2.getApellido());
        
        System.out.println("--- Ingrese el ID del alumno 1 ---");
        Scanner sc = new Scanner(System.in);
        alu1.setId(sc.nextInt());
        
        System.out.println("--- Ingrese el Nombre del alumno 1 ---");
        alu1.setNombre(sc.next());
        
        System.out.println("--- Ingrese el Apellido del alumno 1 ---");
        alu1.setApellido(sc.next());
        
        System.out.println("============");
        
        System.out.println("El ID del alumno 1 es: " + alu1.getId());
        System.out.println("El Nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El Apellido del alumno 1 es: " + alu1.getApellido());
        
        
    }

}
