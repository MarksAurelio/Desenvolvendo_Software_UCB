import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoStrings {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("programa");
        palavras.add("proGrama");
        palavras.add("PROGRAMA");
        palavras.add("Programa");
        palavras.add("ProGrama");
        palavras.add("programas");
        palavras.add("programa3");

        System.out.println("Strings originais (na ordem de inserção):");
        for (String s : palavras) {
            System.out.println(s);
        }
        
        Collections.sort(palavras);

        System.out.println("\nStrings ordenadas (usando o compareTo):");
        for (String s : palavras) {
            System.out.println(s);
        }
    }
}
