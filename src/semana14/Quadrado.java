package semana14;

public class Quadrado {
    public double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    private String nome;
    //getters
    // public TIPO ATRIBUTO getNome_Atributo(){
    //return Atributo
    //}


         public double getLado(){
            return lado;
         }

        
    // setter
    public void setLado(double lado){
    if (lado > 0.0) {
        this.lado = lado
    } else {
        throw new  RuntimeException("lado inválido")
    }
    this.lado = lado;
    }

}
    






