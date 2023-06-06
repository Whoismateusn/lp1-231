package semana14.exercicios;

public class Aquario {
    private double comprimento;
    private double largura;
    private double altura;

    public Aquario (double comprimento, double largura, double altura) {
        setComprimento(comprimento);
        setLargura(largura);
        setAltura(altura);
    }

    public Aquario (double valor) {
        setComprimento(valor);
        setLargura(valor);
        setAltura(valor);
    }

    public double calcularVolume() {
        return (comprimento * altura * largura)/1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro() {
        return calcularVolume() * 3;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento <= 0.0) {
            throw new RuntimeException("Comprimento inválido");
        }

        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0.0) {
            throw new RuntimeException("Comprimento inválido");
        }

        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new RuntimeException("Comprimento inválido");
        }

        this.altura = altura;
    }  
}