import java.util.Scanner;

public class CalculoTrianguloRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("--- Calculadora da Área do Triângulo ---");

        while (continuar) {
            double base = 0;
            double altura = 0;
            boolean entradaValida;

            entradaValida = false;
            while (!entradaValida) {
                System.out.println("\nDigite o valor da BASE do triângulo (ou 'sair' para encerrar): ");
                String inputBase = scanner.nextLine();

                if (inputBase.equalsIgnoreCase("sair")) {
                    continuar = false;
                    break;
                }
                try {
                    base = Double.parseDouble(inputBase);
                    if (base <= 0) {
                        System.out.println("A BASE deve ser um número positivo e maior que 0.");
                    } else {
                        entradaValida = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número para a BASE.");
                }
            }
            if (!continuar) {
                break;
            }
            entradaValida = false;
            while (!entradaValida) {
                System.out.println("Digite o valor da ALTURA do triângulo.");
                String inputAltura = scanner.nextLine();

                try {
                    altura = Double.parseDouble(inputAltura);
                    if (altura <= 0) {
                        System.out.println("A altura deve ser um número positivo maior que 0.");
                    } else {
                        entradaValida = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número para a altura.");
                }
            }
            double area = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + area);

            System.out.println("\nDeseja calcular a área de outro triângulo? (sim/não): ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (!resposta.equals("sim")) {
                continuar = false;
            }
        }
        scanner.close();
        System.out.println("--- Programa Encerrado! ---");
    }
}
