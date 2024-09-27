package main.java;

public class App {
    public static void main(String[] args) {
        // Instanciando um objeto da classe CorpoHumano
        CorpoHumano corpo = new CorpoHumano(70, 0.07f, 1000, 1.75f);

        // Exibindo os valores iniciais
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Volume: " + corpo.getVolume() + " m³");
        System.out.println("Densidade: " + corpo.getDensidade() + " kg/m³");
        System.out.println("Altura: " + corpo.getAltura() + " m");

        // Calculando e exibindo o IMC
        float imc = corpo.calcularIMC();
        System.out.println("IMC: " + imc);

        // Testando setters
        corpo.setMassa(80);
        corpo.setAltura(1.80f);
        System.out.println("Novo IMC (após alteração de massa e altura): " + corpo.calcularIMC());
    }
}
