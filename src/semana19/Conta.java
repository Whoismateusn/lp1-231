package semana19;
import java.time.LocalDate;

    public abstract class Conta{
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, double tarifa, Correntista correntista) {
    this.numero = numero;
    this.correntista = correntista;
    this.dataAbertura = LocalDate.now();
    this.saldo = 0.0;
    this.tarifa = 0.0;
    correntista.addConta(this);
    }

        public void depositar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException ("Valor inválido para depósito");
        }

        saldo += valor;
        System.out.println ("Depósito de R$" + valor + " realizado para " + correntista);
        System.out.println ("Saldo atual: R$" + saldo);
    }

    public void sacar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        }
        if (valor > saldo) {
        throw new IllegalArgumentException("Saldo insuficiente para saque");
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado por " + correntista) ;
        System.out.println("Saldo atual: R$" + saldo);
    }
    public abstract double calcularTarifa();
    public int getNumero() {
        return numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }
    public Correntista getCorrentista() {
        return correntista;
    }
}
    





