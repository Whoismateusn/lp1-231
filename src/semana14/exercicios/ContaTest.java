package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContaTest {
    
    @Test
    public void saca() {
        Conta conta = new Conta(1, "Cristiane");

        double saca = conta.sacar(22);

        assertEquals(-22, saca);
    }

    @Test
    public void deposita() {
        Conta conta = new Conta(1, "Cristiane");

        double deposita = conta.depositar(22);

        assertEquals(22, deposita);
    }

    @Test 
    public void tranfereValorParaOutraConta() {
        Conta conta1 = new Conta(1,"Cristiane");
        Conta conta2 = new Conta (2,"Yoshida");

        conta1.saldo = 80;
        double transfere = conta1.transferirValores(conta2, 20);

        assertEquals(60, transfere);
    }
}