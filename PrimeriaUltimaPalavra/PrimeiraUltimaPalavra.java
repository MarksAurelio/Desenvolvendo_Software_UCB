package PrimeriaUltimaPalavra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiraUltimaPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        System.out.println("--- Encontrando A primeira e a Última palavra Alfabética ----");
        System.out.println("Digite 10 palavras: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a palavra #" + (i + 1) + ": ");
            String palavra = scanner.nextLine().trim();

            if (palavra.isEmpty()) {
                System.out.println("Palavra não pode ser vazia. Digite uma palavra");
                i--;
                continue;
            }
            palavras.add(palavra);
        }
        Collections.sort(palavras);

        System.out.println("\n--- Resultado ---");
        if (!palavras.isEmpty()) {
            System.out.println("A primeira palavra em ordem alfabética é: " + palavras.get(0));
            System.out.println("A última palavra em ordem alfabética é: " + palavras.get(palavras.size() - 1));
        } else {
            System.out.println("Nenhuma palavra foi inserida.");
        }
        scanner.close();
        System.out.println("\n--- Programa Encerrado! ---");
    }
}
