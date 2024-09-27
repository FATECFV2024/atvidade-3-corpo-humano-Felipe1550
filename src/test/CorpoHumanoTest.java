package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.CorpoHumano;

public class CorpoHumanoTest {
    private CorpoHumano corpo;

    @Before
    public void setUp() {
        corpo = new CorpoHumano(70, 0.07f, 1000, 1.75f);
    }

    @Test
    public void testGetters() {
        assertEquals(70, corpo.getMassa(), 0.01);
        assertEquals(0.07f, corpo.getVolume(), 0.01);
        assertEquals(1000, corpo.getDensidade(), 0.01);
        assertEquals(1.75f, corpo.getAltura(), 0.01);
    }

    @Test
    public void testSetters() {
        corpo.setMassa(80);
        assertEquals(80, corpo.getMassa(), 0.01);

        corpo.setVolume(0.08f);
        assertEquals(0.08f, corpo.getVolume(), 0.01);

        corpo.setDensidade(1100);
        assertEquals(1100, corpo.getDensidade(), 0.01);

        corpo.setAltura(1.80f);
        assertEquals(1.80f, corpo.getAltura(), 0.01);
    }

    @Test
    public void testCalcularIMC() {
        float expectedIMC = corpo.getMassa() / (corpo.getAltura() * corpo.getAltura());
        assertEquals(expectedIMC, corpo.calcularIMC(), 0.01);

        corpo.setMassa(80);
        corpo.setAltura(1.80f);
        expectedIMC = 80 / (1.80f * 1.80f);
        assertEquals(expectedIMC, corpo.calcularIMC(), 0.01);
    }
}
