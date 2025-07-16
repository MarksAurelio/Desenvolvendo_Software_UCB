package contadorDeCaracteres;

import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Contador de Caracteres ---");

        String linhaTexto;
        while (true) {
            System.out.println("Por favor, Digite uma linha de texto: ");
            linhaTexto = scanner.nextLine().trim();
            if (linhaTexto.isEmpty()) {
                System.out.println("A linha não pode ser vazia. Por favor, digite uma linha de texto.");
            } else {
                break;
            }
        }
        char caractereAlvo;
        while (true) {
            System.out.println("Digite o caractere que deseja contar: ");
            String inputCaractere = scanner.nextLine().trim();
            if (inputCaractere.length() == 1) {
                caractereAlvo = inputCaractere.charAt(0);
                break;
            } else if (inputCaractere.isEmpty()) {
                System.out.println("Nenhum caractere digitado. Por favor, digite um caractere.");
            } else {
                System.out.println("Por favor, digite apenas um caractere.");
            }
        }
        int contador = 0;
        for (int i = 0; i < linhaTexto.length(); i++) {
            if (linhaTexto.charAt(i) == caractereAlvo) {
                contador++;
            }
        }
        System.out.println("\n--- Resultado ---");
        System.out.println("Texto digitado: \"" + linhaTexto + "\"");
        System.out.println("Caractere a contar: '" + caractereAlvo + "'");
        System.out.println("O caractere '" + caractereAlvo + "' aparece " + contador + " vez(es) na linha.");

        scanner.close();

        System.out.println("\n--- Programa Encerrado ---");
    }
}
