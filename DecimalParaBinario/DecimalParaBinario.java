package decimalParaBinario;

import java.util.Scanner;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDecimal = 0;
        boolean entradaValida = false;

        System.out.println("--- Conversor Decimal para Binário ---");

        while (!entradaValida) {
            System.out.print("Por favor, digite um número inteiro não negativo: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Por favor, digite um número inteiro não negativo.");
                continue;
            }
            try {
                numeroDecimal = Integer.parseInt(input);
                if (numeroDecimal < 0) {
                    System.out.println("Número de ser positivo (maior ou igual a 0).");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número positivo.");
            }
        }
        String numeroBinario = "";

        if (numeroDecimal == 0) {
            numeroBinario = "0";
        } else {
            int tempNumero = numeroDecimal;

            while (tempNumero > 0) {
                int resto = tempNumero % 2;
                numeroBinario = resto + numeroBinario;
                tempNumero = tempNumero / 2;
            }
        }
        System.out.println("\n--- Resultado da Conversão ---");
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Número Binário: " + numeroBinario);

        scanner.close();

        System.out.println("\n--- Programa Encerrado! ---");
    }
}