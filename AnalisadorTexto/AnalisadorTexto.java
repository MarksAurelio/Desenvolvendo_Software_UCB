package AnalisadorTexto;

import java.util.Scanner;

public class AnalisadorTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Analisador de Texto ---");
        System.out.println("Digite um linha de texto: ");

        String linhaTexto = scanner.nextLine();

        int quantidadeDeCaracteres = 0;
        for (char caractere : linhaTexto.toCharArray()) {
            if (caractere != ' ' && caractere != '\t') {
                quantidadeDeCaracteres++;
            }
        }

        String[] palavras = linhaTexto.trim().split("\\s+");

        int quantidadeDePalavras = 0;
        if (linhaTexto.trim().isEmpty()) {
            quantidadeDePalavras = 0;
        } else {
            quantidadeDePalavras = palavras.length;
        }
        System.out.println("\n--- Resultados ---");
        System.out.println("Texto Digitado: \"" + linhaTexto + "\"");
        System.out.println("Quantidade de caracteres (excluindo espaços e tabulações): " + quantidadeDeCaracteres);
        System.out.println("Quantidade de palavras: " + quantidadeDePalavras);

        scanner.close();
        System.out.println("\n --- Programa Encerrado! ---");
    }
}
