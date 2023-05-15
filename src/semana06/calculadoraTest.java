package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class calculadoraTest {
    
    @Test
    public void somaDoisNumerosPositivos() {
        // AAA


        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double soma = calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(12.0, soma);
    }
        //SOMAR

    @Test
    public void somaUmNumeroPositivoEUmNegativo() {
            
        double numero1 = 10.0;
        double numero2 = -2.0;

        double soma = calculadora.somar(numero1, numero2);

        assertEquals(8.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativos() {
            
        double numero1 = -10.0;
        double numero2 = -2.0;

        double soma = calculadora.somar(numero1, numero2);

        assertEquals(-12.0, soma);
    }
        
        // SUBTRAIR

    @Test
    public void subtrairDoisNumerosPositivos(){

        double numero1 = 10.0;
        double numero2 = 2.0;

        double subtracao = calculadora.subtrair(numero1, numero2);

        assertEquals(8.0, subtracao);
    }

    @Test
    public void subtrairUmNumeroPositivo(){

        double numero1 = 10.0;
        double numero2 = -2.0;

        double subtracao = calculadora.subtrair(numero1, numero2);

        assertEquals(12.0, subtracao);
    }

    @Test
    public void subtrairDoisNumerosNegativos(){

        double numero1 = -10.0;
        double numero2 = -2.0;

        double subtracao = calculadora.subtrair(numero1, numero2);

        assertEquals(-8.0, subtracao);
    }

    //MULTIPLCAR

    @Test
    public void multiplicarDoisNumerosPositivos(){

        double numero1 = 10.0;
        double numero2 = 2.0;

        double multiplicacao = calculadora.multiplicar(numero1, numero2);

        assertEquals(20.0, multiplicacao);
    }

    @Test
    public void multiplicarUmNumeroNegativoEUmPositivo(){

        double numero1 = 10.0;
        double numero2 = -2.0;

        double multiplicacao = calculadora.multiplicar(numero1, numero2);

        assertEquals(-20.0, multiplicacao);
    }

    @Test
    public void multiplicarDoisNumerosNegativos(){

        double numero1 = -10.0;
        double numero2 = -2.0;

        double multiplicacao = calculadora.multiplicar(numero1, numero2);

        assertEquals(20.0, multiplicacao);
    }

        //DIVIDIR
    @Test
    public void DividirDoisNumerosPositivos(){

        double numero1 = 10.0;
        double numero2 = 2.0;

        double divisao = calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);
    }

    @Test
    public void DividirUmNumeroNegativoEUmPositivo(){

        double numero1 = 10.0;
        double numero2 = -2.0;

        double divisao = calculadora.dividir(numero1, numero2);

        assertEquals(-5.0, divisao);
    }

    @Test
    public void DividirDoisNumerosNegativos(){

        double numero1 = -10.0;
        double numero2 = -2.0;

        double divisao = calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);
    }
}