public class RepitirFraseDoWhile {
    public static void main(String[] args) {
        String frase = "Esta é a minha frase usando (Do - While)!";

        int contador = 1;

        System.out.println("Incializando a repetição da frase: ");

        do {
            System.out.println(contador + "." + frase);
            contador++;
        } while (contador <= 10);

        System.out.println("Programa Encerrado!");
    }
}
