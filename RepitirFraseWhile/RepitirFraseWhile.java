public class RepitirFraseWhile {
    public static void main(String[] args) {
        String frase = "Esta é a minha frase repitida!";

        int contador = 1;

        System.out.println("Iniciando a repetição da frase: ");

        while (contador <= 10) {
            System.out.println(contador + ". " + frase);
            contador++;
        }
        System.out.println("\nRepetição Encerrada!");
    }
}
