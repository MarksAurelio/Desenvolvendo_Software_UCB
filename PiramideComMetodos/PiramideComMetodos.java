package PiramideComMetodos;

public class PiramideComMetodos {

    public static void exibirAsteriscosCrescente(int maxLinhas) {
        System.out.println("--- Desenhando a sequência de asteriscos ---");

        for (int i = 1; i <= maxLinhas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Programa de Desenho de Pirâmide de Asteriscos ---");

        exibirAsteriscosCrescente(6);

        System.out.println("\n--- Programa Encerrado! ---");
    }
}
