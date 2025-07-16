package calculoTrianguloComTestes;

public class CalculoTrianguloComTestes {
    public static void main(String[] args) {
        System.out.println("--- Autoavaliaçao da Calculadora de Área do Triângulo ---");

        double[][] testes = {
                { 10.0, 5.0, 25.0 },
                { 4.0, 8.0, 16.0 },
                { 7.5, 2.0, 7.5 },
                { 1.0, 1.0, 0.5 },
                { 20.0, 1.5, 15.0 },
                { 0.001, 0.002, 0.000001 },
                { 1234.56, 789.01, 487295.5398 }
        };

        int testesPassados = 0;
        double tolerancia = 0.0001;

        for (int i = 0; i < testes.length; i++) {
            double base = testes[i][0];
            double altura = testes[i][1];
            double areaEsperada = testes[i][2];

            double areaCalculada = (base * altura) / 2;

            boolean passou = Math.abs(areaCalculada - areaEsperada) < tolerancia;

            System.out.printf("\n--- Teste %d ---\n", (i + 1));
            System.out.printf("Base: %.2f, Altura: %.2f\n", base, altura);
            System.out.printf("Área Calculada: %.4f\n", areaCalculada);
            System.out.printf("Área Esperada: %.4f\n", areaEsperada);

            if (passou) {
                System.out.println("Status: PASSED");
                testesPassados++;
            } else {
                System.out.println("Status: FAILED");
            }
        }
        System.out.println("\n--- Resumo da Autoavaliação ---");
        System.out.printf("Testes Passados: %d de %d\n", testesPassados, testes.length);

        if (testesPassados == testes.length) {
            System.out.println("Todos os testes foram PASSADOS. O programa está funcionando corretamente.");
        } else {
            System.out.println("Alguns testes FALHARAM. Revise o código.");
        }
        System.out.println("\n--- Autoavaliação Concluída ---");
    }
}
