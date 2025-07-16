package conversorMedidas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConversorMedidas {
    private static final BigDecimal PES_PARA_CM = new BigDecimal("30.48");
    private static final BigDecimal JARDAS_PARA_METROS = new BigDecimal("0.9144");
    private static final BigDecimal MILHAS_PARA_KM = new BigDecimal("1.60934");

    public static BigDecimal converterPesParaCentimetros(BigDecimal pes) {
        return pes.multiply(PES_PARA_CM).setScale(4, RoundingMode.HALF_UP);
    }

    public static BigDecimal converterJardasParaMetros(BigDecimal jardas) {
        return jardas.multiply(JARDAS_PARA_METROS).setScale(4, RoundingMode.HALF_UP);
    }

    public static BigDecimal converterMilhasParaQuilometros(BigDecimal milhas) {
        return milhas.multiply(MILHAS_PARA_KM).setScale(4, RoundingMode.HALF_UP);
    }

    private static BigDecimal lerValorNumerico(String prompt, Scanner scanner) {
        BigDecimal valor = BigDecimal.ZERO;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia! Por favor, digite um número.");
                continue;
            }
            try {
                valor = new BigDecimal(input);
                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("O valor deve ser positivo. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
            }
        }
        return valor;
    }

    private static int exibirMenuEReferOpcao(Scanner scanner) {
        int opcao = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("\n--- Selecione a Conversão ---");
            System.out.println("1. Pés para Centímetros");
            System.out.println("2. Jardas para Metros.");
            System.out.println("3. Milhas para Quilômetros.");
            System.out.println("0. Sair");
            System.out.print("Sua opção: ");

            String input = scanner.nextLine().trim();
            try {
                opcao = Integer.parseInt(input);
                if (opcao >= 0 || opcao <= 3) {
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um opção entre 0 e 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número positivo e inteiro.");
            }
        }
        return opcao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("--- Conversor de Medidas");

        do {
            opcao = exibirMenuEReferOpcao(scanner);

            switch (opcao) {
                case 1:
                    BigDecimal pes = lerValorNumerico("Digite o valor em Pés: ", scanner);
                    BigDecimal cm = converterPesParaCentimetros(pes);
                    System.out.println(pes + " pé(s) equivale(m) a " + cm + " centímetros.");
                    break;
                case 2:
                    BigDecimal jardas = lerValorNumerico("Digite o valor em Jardas: ", scanner);
                    BigDecimal metros = converterJardasParaMetros(jardas);
                    System.out.println(jardas + " jarda(s) equivale(m) a " + metros + " metros.");
                    break;
                case 3:
                    BigDecimal milhas = lerValorNumerico("Digite o valor em Milhas: ", scanner);
                    BigDecimal quilometros = converterMilhasParaQuilometros(milhas);
                    System.out.println(milhas + " milha(s) equivale(m) a " + quilometros + " quilômetros.");
                    break;
                case 0:
                    System.out.println("\nSaindo do Programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção desconhecida. Tente Novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
