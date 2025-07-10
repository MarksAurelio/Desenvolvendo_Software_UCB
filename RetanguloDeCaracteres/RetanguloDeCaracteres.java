package RetanguloDeCaracteres;

public class RetanguloDeCaracteres {
    private void exibeRetangulo(final int altura, final int largura) {
        for (int linha = 0; linha < altura; ++linha) {
            if ((linha == 0) || (linha == 3)) {
                for (int coluna = 0; coluna < largura; ++coluna) {
                    System.out.print('*');
                }
            } else {
                System.out.print('*');
                for (int coluna = 0; coluna < (largura - 2); ++coluna) {
                    System.out.print(' ');
                }
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(final String[] args) {
        final RetanguloDeCaracteres objeto = new RetanguloDeCaracteres();
        objeto.exibeRetangulo(4, 8);
    }
}
