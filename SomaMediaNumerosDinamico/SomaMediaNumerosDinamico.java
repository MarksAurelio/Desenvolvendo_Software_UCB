import java.util.Scanner;

public class SomaMediaNumerosDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;

        System.out.println("Quantos números voçê deseja incluir para calcular a soma e a média? ");
        while (true) {
            if (scanner.hasNextInt()) {
                quantidadeNumeros = scanner.nextInt();
                if (quantidadeNumeros > 0) {
                    break;
                } else {
                    System.out.println("Digite um número positivo: ");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }
        double soma = 0;
        int contador = 0;

        System.out.println("\nDigite os " + quantidadeNumeros + " números.");

        while (contador < quantidadeNumeros) {
            System.out.println("\nDigite o número #" + (contador + 1) + ": ");

            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                soma += numero;
                contador++;
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
        double media = (quantidadeNumeros > 0) ? (soma / quantidadeNumeros) : 0;

        System.out.println("\n--- Resultados ---");
        System.out.println("A soma dos " + quantidadeNumeros + " números é: " + soma);
        System.out.println("A média dos " + quantidadeNumeros + " números é: " + media);

        scanner.close();

        System.out.println("\nPrograma Encerrado!");
    }
}
