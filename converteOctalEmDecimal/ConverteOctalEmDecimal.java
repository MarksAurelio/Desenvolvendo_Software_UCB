package converteOctalEmDecimal;

public class ConverteOctalEmDecimal {
    public static int convertarOctalParaDecimal(String octal) {
        octal = octal.trim();

        if (octal.isEmpty()) {
            throw new IllegalArgumentException("A string de entrada não pode ser vazia");
        }
        int decimal = 0;
        int potencia = 0;
        
        for (int i = octal.length() - 1; i >= 0; i--) {
            char digitoChar = octal.charAt(i);

            int digito = Character.getNumericValue(digitoChar);

            if (digito < 0 || digito > 7) {
                throw new IllegalArgumentException(
                        "Dígito inválido no númeor octal: '" + digitoChar + "'. Dígitos octais devem ser de 0 a 7. ");
            }

            decimal += digito * Math.pow(8, potencia);
            potencia++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Octal '10' em Decimal: " + convertarOctalParaDecimal("10"));
            System.out.println("Octal '27' em Decimal: " + convertarOctalParaDecimal("27"));
            System.out.println("Octal '123' em Decimal: " + convertarOctalParaDecimal("123"));
            System.out.println("Octal '777' em Decimal: " + convertarOctalParaDecimal("777"));
            System.out.println("Octal '0' em Decimal: " + convertarOctalParaDecimal("0"));
            System.out.println("Octal '     45    ' em Decimal: " + convertarOctalParaDecimal("  45   "));

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
