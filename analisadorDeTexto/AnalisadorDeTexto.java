package analisadorDeTexto;

import java.util.Scanner;

public class AnalisadorDeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Analisador de Texto ---");
        System.out.println("Digite uma linha de texto: ");
        String linha = scanner.nextLine();

        int contadorCaracteres = 0;
        for (char c : linha.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                contadorCaracteres++;
            }
        }
        String[] palavras = linha.trim().split("\\s+");

        int contadorPalavras = 0;
        if (palavras.length == 1 && palavras[0].isEmpty()) {
            contadorPalavras = 0;
        } else {
            contadorPalavras = palavras.length;
        }
        System.out.println("\n--- Resultados ---");
        System.out.println("Quantidade de caracteres (excluindo espaços, tabulações): " + contadorCaracteres);
        System.out.println("Quantidade de palavras: " + contadorPalavras);

        scanner.close();

        System.out.println("\n---Programa Encerrado!");
    }
}
