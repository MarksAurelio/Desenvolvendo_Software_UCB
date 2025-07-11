package CriaExibeData;

import java.time.LocalDate;
import java.util.Scanner;

public class CriaExibeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int ano = 0;
        boolean entradaValida;

        System.out.println("--- Criador e Exibidor de Data ---");

        entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite o ano (ex: 2025):");
            String inputLinha = scanner.nextLine();
            try {
                ano = Integer.parseInt(inputLinha);
                if (ano < 1900 || ano > 2100) {
                    System.out.println("Ano inválido. Digite um ano entre 1900 e 2100.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro e positivo para o ano.");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite o mês (ex: 1 - 12): ");
            String inputLinha = scanner.nextLine();
            try {
                mes = Integer.parseInt(inputLinha);
                if (mes < 1 || mes > 12) {
                    System.out.println("Mês inválido. Digite um mês no intervalo de (1 a 12).");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro e positivo para o mês.");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite o dia (ex: 1 - 31): ");
            String inputLinha = scanner.nextLine();
            try {
                dia = Integer.parseInt(inputLinha);
                if (dia < 1 || dia > 31) {
                    System.out.println("Digite o dia no intervalo de (1 a 31).");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro e positivo para o dia.");
            }
        }
        LocalDate dataCriada = null;
        try {
            dataCriada = LocalDate.of(ano, mes, dia);
            System.out.println("\n--- Data Criada ---");
            System.out.println("Sua data formatada: " + dataCriada);
        } catch (java.time.DateTimeException e) {
            System.out.println("\nErro: A data inserida (" + dia + "/" + mes + "/" + ano
                    + ") não é uma data válida. Por favor, verifique.");
            System.out.println("Detalhes do erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println("\n--- Programa Encerrado ---");
    }
}
