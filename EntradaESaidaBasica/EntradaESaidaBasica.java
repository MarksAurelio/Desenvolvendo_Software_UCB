import java.util.Scanner;

public class EntradaESaidaBasica {
    public static void main(String[] args) {
        // Criar um objeto Scanner para captar as entradas do usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite usa idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nOlá " + nome + "! Você têm " + idade + " anos.");

        scanner.close();
    }
}
