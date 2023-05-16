package semana12;

/*

public class BancoTest {
    import org.junit.Test;
import static org.junit.Assert.*;

*/

public class ContaTest {
    @Test
    public void testSaqueComSaldoSuficiente() {
        Conta conta = new Conta(1, "Maria");
        conta.depositar(100.0);
        conta.sacar(50.0);
        assertEquals(50.0, conta.getSaldo(), 0.01);
    }

    @Test
    public void testSaqueComSaldoInsuficiente() {
        Conta conta = new Conta(2, "João");
        conta.depositar(100.0);
        conta.sacar(150.0);
        assertEquals(100.0, conta.getSaldo(), 0.01);
    }

    @Test
    public void testDeposito() {
        Conta conta = new Conta(3, "José");
        conta.depositar(200.0);
        assertEquals(200.0, conta.getSaldo(), 0.01);
    }

    @Test
    public void testTransferenciaComSaldoSuficiente() {
        Conta conta1 = new Conta(4, "Ana");
        Conta conta2 = new Conta(5, "Carlos");
        conta1.depositar(300.0);
        conta1.transferir(200.0, conta2);
        assertEquals(100.0, conta1.getSaldo(), 0.01);
        assertEquals(200.0, conta2.getSaldo(), 0.01);
    }

    @Test
    public void testTransferenciaComSaldoInsuficiente() {
        Conta conta1 = new Conta(6, "Lúcia");
        Conta conta2 = new Conta(7, "Pedro");
        conta1.depositar(100.0);
        conta

    
}
