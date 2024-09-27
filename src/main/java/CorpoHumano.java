package main.java;

public class CorpoHumano {
    // Atributos privados
    private float massa;
    private float volume;
    private float densidade;
    private float altura;

    // Construtor
    public CorpoHumano(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    // Métodos Getters
    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }

    public float getAltura() {
        return altura;
    }

    // Métodos Setters
    public void setMassa(float massa) {
        this.massa = massa;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC (Índice de Massa Corporal)
    public float calcularIMC() {
        return massa / (altura * altura);
    }
}
