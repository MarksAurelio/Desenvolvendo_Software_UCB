public class DesenhaAsteriscosSequenciaCrescente {
    public static void main(String[] args) {
        int maxLinhas = 5;

        System.out.println("Desenhando uma sequência crescente de asteriscos: ");

        for (int i = 1; i <= maxLinhas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Programa Encerrado!");
    }
}
