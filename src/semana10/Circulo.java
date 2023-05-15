package semana10;

public class Circulo {
    // Atributos
    public double raio;
    
    // Métodos
    public double calcularArea(){
        return Math.PI * (raio * raio);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
    
