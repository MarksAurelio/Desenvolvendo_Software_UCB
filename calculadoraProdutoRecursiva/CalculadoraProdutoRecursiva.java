package calculadoraProdutoRecursiva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraProdutoRecursiva {
    public static long calcularProdutoSequencia(int inicio, int fim) {
        if (inicio == fim) {
            return inicio;
        } else if (inicio > fim) {
            throw new IllegalArgumentException("O número do início não pode ser maior que o número do fim.");
        } else {
            return (long) inicio * calcularProdutoSequencia(inicio + 1, fim);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- Calculadora de Produto de Sequência Recursiva ---");
            System.out.print("Digite o número do início da sequência: ");
            int inicio = scanner.nextInt();

            System.out.print("Digite o número do fim da sequência: ");
            int fim = scanner.nextInt();

            long resultado = calcularProdutoSequencia(inicio, fim);
            System.out.println("0 produto da sequência de " + inicio + " a " + fim + " é: " + resultado);
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida. Por favor, digite apenas números inteiros.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println("\n--- Programa Encerrado! ---");
    }
}
