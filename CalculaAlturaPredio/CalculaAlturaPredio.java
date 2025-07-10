package CalculaAlturaPredio;

import java.util.Scanner;

public class CalculaAlturaPredio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double anguloGraus = 0;
        double distancia = 0;
        boolean entradaValida = false;

        System.out.println("--- Calculadora de Altura de Prédio ---");
        System.out.println("Baseado no ângulo de elevação e na distância até o prédio.");

        while (!entradaValida) {
            System.out.println("\nDigite o ângulo de elevação até o topo do prédio (em graus): ");
            String inputLinha = scanner.nextLine();

            if (inputLinha.isEmpty()) {
                System.out.println("Entrada vazia. Digite um número.");
                continue;
            }
            try {
                anguloGraus = Double.parseDouble(inputLinha);
                if (anguloGraus <= 0 || anguloGraus >= 90) {
                    System.out.println("O ângulo dever ser maior que 0 e menor que 90 graus para um cálculo válido.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número para o ângulo.");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite a distância até a base do prédio (em metros): ");
            String inputLinha = scanner.nextLine();

            if (inputLinha.isEmpty()) {
                System.out.println("Entrada vazia. Digite um número para distância.");
                continue;
            }
            try {
                distancia = Double.parseDouble(inputLinha);
                if (distancia <= 0) {
                    System.out.println("A distância deve ser um número positivo (maior que zero).");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número para distância. ");
            }
        }
        double anguloRadianos = Math.toRadians(anguloGraus);
        // Alternativamente: anguloRadianos = anguloGraus * (Math.PI / 180);

        double altura = distancia * Math.tan(anguloRadianos);

        System.out.println("--- Resultado ---");

        System.out.printf("Ângulo de elevação: %.2f graus\n", anguloGraus);
        System.out.printf("Distância até o prédio: %.2f metros\n", distancia);
        System.out.printf("A altura calculada do prédio é: %.2f metros\n", altura);

        scanner.close();

        System.out.println("--- Programa Encerrado! ---");
    }
}
