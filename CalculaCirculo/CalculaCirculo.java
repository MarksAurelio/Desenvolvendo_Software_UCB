package CalculaCirculo;

import java.util.Scanner;

public class CalculaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = 0;
        boolean entradaValida = false;

        System.out.println("--- Calculadora de Círculo ---");

        while (!entradaValida) {
            System.out.println("Digite o raio do Círculo: ");
            String inputLinha = scanner.nextLine();

            if (inputLinha.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Digite o raio do Círculo.");
                continue;
            }
            try {
                raio = Double.parseDouble(inputLinha);
                if (raio <= 0) {
                    System.out.println("O raio deve ser um número positivo (maior que zero)");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número para o raio.");
            }
        }
        double circunferencia = 2 * Math.PI * raio;

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("--- Resultados ---");
        System.out.println("Raio: " + raio);
        System.out.println("Circunferência: " + circunferencia);
        System.out.println("Área do Círculo " + area);

        scanner.close();

        System.out.println("\n--- Programa Encerrado! ---");
    }

}
