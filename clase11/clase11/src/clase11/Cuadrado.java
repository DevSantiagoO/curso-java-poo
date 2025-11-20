package clase11;

public class Cuadrado implements Figura, Dibujable{
        private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        this.lado = lado;
    }
    
    
   @Override
    public double calcularArea(){
        double area = 0;
        area = lado * lado;
        return area;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Hola estoy dibujando un cuadrado.");
    }
}
