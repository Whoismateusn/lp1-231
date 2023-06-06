package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void calculaVolume() {
        Aquario aquario = new Aquario(100, 50, 40);

        double calculaVolume = aquario.calcularVolume();

        assertEquals(200, calculaVolume);
    }

    @Test
    public void calculaVolumeComValoresIguais() {
        Aquario aquario = new Aquario(100);
        
        double calculaVolume = aquario.calcularVolume();

        assertEquals(1000, calculaVolume);
    }

    @Test
    public void calculaPotenciaDoTermostatoParaAquecer() {
        Aquario aquario = new Aquario(100, 50, 40);

        double calculaPotencia = aquario.calcularPotenciaDoTermostato(24, 22);

        assertEquals(20, calculaPotencia);
    }
    
    @Test
    public void calculaPotenciaDoTermostatoParaEsfriar() {
        Aquario aquario = new Aquario(100, 50, 40);

        double calculaPotencia = aquario.calcularPotenciaDoTermostato(23, 26);

        assertEquals(-30, calculaPotencia);
    }

    @Test
    public void calculaQuantidadeLitrosFiltro() {
        Aquario aquario = new Aquario(100, 50, 40);

        double calculaFiltragem = aquario.calcularQuantidadeLitrosFiltro();

        assertEquals(600, calculaFiltragem);
    }

    @Test
    public void recebeComprimento() {
        Aquario aquario = new Aquario (100, 50, 40);

        aquario.setComprimento(120);

        assertEquals(120, aquario.getComprimento());
    }

    @Test
    public void recebeLargura() {
        Aquario aquario = new Aquario (100, 50, 40);

        aquario.setLargura(70);

        assertEquals(70, aquario.getLargura());
    }

    @Test
    public void recebeAltura() {
        Aquario aquario = new Aquario (100, 50, 40);

        aquario.setAltura(60);

        assertEquals(60, aquario.getAltura());
    }
}