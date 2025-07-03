import java.util.Scanner;

public class SomaMedia10Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 0;
        int quantidadeNumeros = 10;

        System.out.println("Digite " + quantidadeNumeros + " números.");

        while (contador < quantidadeNumeros) {
            System.out.println("Digite o número #" + (contador + 1) + ": ");

            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                soma += numero;
                contador++;
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
        double media = soma / quantidadeNumeros;

        System.out.println("A soma dos " + quantidadeNumeros + " números é: " + soma);
        System.out.println("A média dos " + quantidadeNumeros + " números é: " + media);

        scanner.close();
    }
}
