package semana12.exercícios;

public class Banco {
    public class Conta {
        private int codigo;
        private double saldo;
        private String correntista;
    
        public Conta(int codigo, String correntista) {
            this.codigo = codigo;
            this.correntista = correntista;
            this.saldo = 0.0;
        }
    
        public int getCodigo() {
            return codigo;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
        public String getCorrentista() {
            return correntista;
        }
    
        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        }
    
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }
    
        public void transferir(double valor, Conta destino) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                destino.depositar(valor);
                System.out.println("Transferência realizada com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        }
    }
    
}
