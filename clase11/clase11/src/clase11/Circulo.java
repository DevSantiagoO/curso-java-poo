package clase11;

public class Circulo implements Figura, Dibujable, Rotable {
    private double radio;
    
    public Circulo(){}
    
    public Circulo(double radio, double x, double y){
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        double pi = 3.14;
        double area = pi * radio * radio;
        return area;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Hola estoy dibujando un circulo.");
    }
    
    @Override
    public void rotar(){
        System.out.println("Hola estoy rotando el circulo.");
    }
    
}
