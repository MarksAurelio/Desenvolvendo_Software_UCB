package desenhaHGrande;

public class DesenhaHGrande {
    public static void grandeH(int numeroLinha) {
        switch (numeroLinha) {
            case 1:
                System.out.print("H   H");
                break;
            case 2:
                System.out.print("H   H");
                break;
            case 3:
                System.out.print("HHHHH");
                break;
            case 4:
                System.out.print("H   H");
                break;
            case 5:
                System.out.print("H   H");
                break;
            default:
                System.err.print("     ");
                break;
        }
    }

    public static void main(String[] args) {
        int alturaH = 5;
        int quantidadeHs = 6;

        for (int linhaAtual = 1; linhaAtual <= alturaH; linhaAtual++) {
            for (int hAtual = 0; hAtual < quantidadeHs; hAtual++) {
                grandeH(linhaAtual);
                if (hAtual < quantidadeHs - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
