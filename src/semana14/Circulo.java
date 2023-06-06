package semana14;

public class Circulo {
    //atributo
    public double raio;
    
    //construtor 
    public Circulo(double raio){
        this.raio = raio;
    }
    
    //métodos
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}