package geradorDeTriangulos;

import java.util.Scanner;

public class GeradorDeTriangulos {

    public static void exibirTrianguloCrescente(final int numLinhas) {
        System.out.println("\n--- Triângulo Crescente ---");
        for (int i = 1; i <= numLinhas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exibirTrianguloDecrescente(final int numLinhas) {
        System.out.println("\n--- Triângulo Decrescente ---");
        for (int i = numLinhas; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exibirPiramideIsosceles(final int numLinhas) {
        System.out.println("\n--- Pirâmide Isósceles ---");
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < (numLinhas - 1 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int lerNumeroDeLinhas(final String prompt, final Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Por favor, digite um número.");
                continue;
            }
            try {
                numero = Integer.parseInt(input);
                if (numero <= 0) {
                    System.out.println("Entrada inválida. Por favor, digite um positivo e maior que 0.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro e positivo.");
            }
        }
        return numero;
    }

    private static int exibirMenuEReferOpcao(final Scanner scanner) {
        int opcao = -1;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("\n--- Selecione o tipo de Triângulo ---");
            System.out.println("1. Triângulo Crescente (Alinhado à Esquerda)");
            System.out.println("2. Triângulo Decrescente (Alinhado à Direita)");
            System.out.println("3. Triângulo Isósceles (Centralizado)");
            System.out.println("0. Sair");
            System.out.print("Sua opcão: ");

            String input = scanner.nextLine().trim();
            try {
                opcao = Integer.parseInt(input);

                if (opcao >= 0 && opcao <= 3) {
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro entre 0 e 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para opção.");
            }
        }
        return opcao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int linhas;

        System.out.println("--- Gerador de Triângulos de Asteriscos ---");

        do {
            opcao = exibirMenuEReferOpcao(scanner);

            if (opcao != 0) {
                linhas = lerNumeroDeLinhas("Digite o número de linhas para a criação do Triângulo: ", scanner);
            } else {
                linhas = 0;
            }
            switch (opcao) {
                case 1:
                    exibirTrianguloCrescente(linhas);
                    break;
                case 2:
                    exibirTrianguloDecrescente(linhas);
                    break;
                case 3:
                    exibirPiramideIsosceles(linhas);
                    break;
                case 0:
                    System.out.println("\n--- Programa Encerrado! ---");
                    break;
                default:
                    System.out.println("Opcão desconhecida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
