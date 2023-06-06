package semana14.exercicios;

public class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        setAltura(altura);
        setPeso(peso);
    }
    
    public double calcularImc() {
        return peso / Math.pow(altura, 2);
    }

    public String getFaixa() {
        if (calcularImc() < 18.5) {
            return "ABAIXO DO PESO";
        } else 
            if (calcularImc() < 25) {
              return "PESO NORMAL";
            } else 
                if (calcularImc() < 30) {
                 return "SOBREPESO";
                } else {
                     return "OBESIDADE";
                       }  
    }
    

    public String getSituacao() {
        if (calcularImc() < 18.5) {
            return "GANHAR"; 
        } else 
            if (calcularImc() < 25) {
                return "NORMAL";
            } else {
                    return "PERDER"; 
                   }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new RuntimeException("Altura inválida");
        }

        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0.0) {
            throw new RuntimeException("Peso inválido");
        }

        this.peso = peso;
    }
}