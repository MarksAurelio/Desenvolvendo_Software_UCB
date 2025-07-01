import java.util.Scanner;

public class LerNumerosAteMenosUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros;

        System.out.println("Digite números aleatórios ou (-1 para sair): ");

        do {
            System.out.println("Digite um número: ");
            numeros = scanner.nextInt();

            if (numeros != -1) {
                System.out.println("Voçê digitou: " + numeros);
            }
        } while (numeros != -1);

        System.out.println("Voçê digitou -1. Programa Encerrado!");

        scanner.close();
    }
}
