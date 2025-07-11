package CalculoTrianguloBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoTrianguloBigDecimal {
    public static void main(String[] args) {
        System.out.println("--- Autoavaliação da Calculadora de Área do Triângulo (com BigDecimal) ---");
        String[][] testes = {
                { "10.0", "5.0", "25.0" }, // Teste 1
                { "4.0", "8.0", "16.0" }, // Teste 2
                { "7.5", "2.0", "7.5" }, // Teste 3
                { "1.0", "1.0", "0.5" }, // Teste 4
                { "20.0", "1.5", "15.0" }, // Teste 5
                { "0.001", "0.002", "0.000001" }, // Teste 6: Números muito pequenos
                { "1234.56", "789.01", "487295.5398" } // Teste 7: Números maiores e com muitas casas decimais
        };
        int testesPassados = 0;
        BigDecimal tolerancia = new BigDecimal("0.0000001");

        for (int i = 0; i < testes.length; i++) {
            BigDecimal base = new BigDecimal(testes[i][0]);
            BigDecimal altura = new BigDecimal(testes[i][1]);
            BigDecimal areaEsperada = new BigDecimal(testes[i][2]);

            BigDecimal areaCalculada = base.multiply(altura).divide(new BigDecimal("2"), 10, RoundingMode.HALF_UP);

            boolean passou = areaCalculada.subtract(areaEsperada).abs().compareTo(tolerancia) < 0;

            System.out.printf("\n--- Teste %d ---\n", (i + 1));
            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
            System.out.println("Área Calculada: " + areaCalculada);
            System.out.println("Área Esperada: " + areaEsperada);

            if (passou) {
                System.out.println("Status: PASSED!");
                testesPassados++;
            } else {
                System.out.println("Status: FAILED");
            }
        }
        System.out.println("\n --- Resumo da Autoavaliação ---");
        System.out.printf("Testes Passados: %d de %d\n", testesPassados, testes.length);

        if (testesPassados == testes.length) {
            System.out.println("Todos os testes foram PASSADOS. O programa está funcinando corretamente.");
        } else {
            System.out.println("Alguns testes FALHARAM. Revise o código.");
        }
        System.out.println("\n--- Autoavaliação Concluída ---");
    }
}
