package semana14.exercicios;

public class Conta {
    private int codigo;
    private double saldo;
    private String correntista;

    public Conta(int codigo, String correntista) {
        setCodigo(codigo);
        this.saldo = 0.0;
        setCorrentista(correntista);
    }

    public double sacar(double valorSacado) {
        return this.saldo -= valorSacado;
    }

    public double depositar(double valorDepositado) {
        return this.saldo += valorDepositado;
    }

    public boolean transferirValores(Conta conta2, double valorTransferido) {
        if (saldo >= valorTransferido) {
            this.saldo -= valorTransferido;
            conta2.depositar(valorTransferido);
            return true;
        } else {
            return false;  
              }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new RuntimeException("Codigo inválido");
        }

        this.codigo = codigo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        if (correntista.length() <= 5 && correntista.length() >= 100) {
            throw new RuntimeException("Correntista inválido");
        }

        this.correntista = correntista;
    }


}