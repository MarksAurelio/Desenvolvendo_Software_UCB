package TrianguloDeCaracteres;

public class TrianguloDeCaracteres {
    private void exibeTriangulo(final int altura) {
        for (int linha = 0; linha < altura; ++linha) {
            for (int coluna = 0; coluna < linha + 1; ++coluna) {System.out.print('*');}
            System.out.println();
            }
        }
    public static void main(final String[] args) {
        final TrianguloDeCaracteres objeto = new TrianguloDeCaracteres();
        objeto.exibeTriangulo(6);
    }
}
