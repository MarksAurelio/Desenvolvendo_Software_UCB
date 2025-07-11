package RetanguloDeCaracteresRevisao;

public class RetanguloDeCaracteresRevisao {
    private void exibeLinhaContinua(final int largura) {
        for (int coluna = 0; coluna < largura; ++coluna) {
            System.out.print('*');
        }
    }

    private void exibeLinhaSoComExtremidades(final int largura) {
        System.out.print('*');
        for (int coluna = 0; coluna < (largura - 2); ++coluna) {
            System.out.print(' ');
        }
        System.out.print('*');
    }

    private void exibeRetangulo(final int altura, final int largura) {
        for (int linha = 0; linha < altura; ++linha) {
            if ((linha == 0) || (linha == (altura - 1))) {
                exibeLinhaContinua(largura);
            } else {
                exibeLinhaSoComExtremidades(largura);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final RetanguloDeCaracteresRevisao objeto = new RetanguloDeCaracteresRevisao();
        objeto.exibeRetangulo(4, 8);
    }
}
