public class DesenhaQuadradoAsteriscos {
    public static void main(String[] args) {
        int tamanho = 5;

        System.out.println("Desenhando um quadrado de asteriscos: ");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nDesenho Concluído!");
    }
}
