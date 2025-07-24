package centralizarMensagem;

public class CentralizarMensagem {
    public static void exibirMensagemCentralizada(String mensagem) {
        int larguraTotal = 80;
        int comprimentoMensagem = mensagem.length();
        int espacosLaterais = (larguraTotal - comprimentoMensagem) / 2;

        if (espacosLaterais < 0) {
            espacosLaterais = 0;
        }

        String linhasHifens = "";
        for (int i = 0; i < larguraTotal; i++) {
            linhasHifens += "-";
        }
        System.out.println(linhasHifens);

        String espacosAntes = "";
        for (int i = 0; i < espacosLaterais; i++) {
            espacosAntes += " ";
        }
        int espacosDepois = larguraTotal - comprimentoMensagem - espacosLaterais;
        String espacosApos = "";
        for (int i = 0; i < espacosDepois; i++) {
            espacosApos += " ";
        }
        System.out.println(espacosAntes + mensagem + espacosApos);
        System.out.println(linhasHifens);
    }

    public static void main(String[] args) {
        exibirMensagemCentralizada("Olá Mundo!");
        exibirMensagemCentralizada("Meu nome é Maar");
        exibirMensagemCentralizada("É bom está aqui!");
        exibirMensagemCentralizada("Vou escrever um texto qualquer que contabilize 80 caracteres para um teste, apenas. Espero que funcione!");
    }
}
