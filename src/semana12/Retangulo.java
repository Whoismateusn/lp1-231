package semana12;


public class Retangulo {
    public double base;
    public double altura;

    public Retangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
    }

    public Retangulo (double valor){
        this.base = valor;
        this.base = valor;
        //ou só 'this(valor, valor)' pq 2x valor está no metodo construtor de cima
        //this() abrindo e fechando parenteses está chamando construtor
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base * altura);
    }
    
    
}
