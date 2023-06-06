package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    public void calculaImc() {
        Pessoa pessoa = new Pessoa(1.60, 60);

        double calculaImc = pessoa.calcularImc();

        assertEquals(23.437499999999996, calculaImc);
    }
    
    @Test 
    public void exibeFaixa() {
        Pessoa pessoa = new Pessoa(1.60, 60);

        String exibeFaixa = pessoa.getFaixa();

        assertEquals("PESO NORMAL", exibeFaixa);
    }

    @Test 
    public void exibeSituacao() {
        Pessoa pessoa = new Pessoa(1.60, 60);

        String exibeSituacao = pessoa.getSituacao();

        assertEquals("NORMAL", exibeSituacao);
    }

    @Test public void recebeAltura() {
        Pessoa pessoa = new Pessoa(1.60, 60);

        pessoa.setAltura(1.70);

        assertEquals(1.70, pessoa.getAltura());
    }

    @Test public void recebePeso() {
        Pessoa pessoa = new Pessoa(1.60, 60);

        pessoa.setPeso(70);

        assertEquals(70, pessoa.getPeso());
    }
}