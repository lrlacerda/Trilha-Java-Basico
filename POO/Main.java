// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void avancarMusica();
    void retrocederMusica();
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void abrirPaginaWeb(String url);
    void fecharPaginaWeb();
}

// Classe que representa o iPhone
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean musicaTocando = false;
    private boolean emChamada = false;
    private boolean navegando = false;

    public void tocarMusica() {
        if (!musicaTocando) {
            System.out.println("Iniciando a reprodução de música...");
            musicaTocando = true;
        }
    }

    public void pausarMusica() {
        if (musicaTocando) {
            System.out.println("Pausando a reprodução de música...");
            musicaTocando = false;
        }
    }

    public void avancarMusica() {
        if (musicaTocando) {
            System.out.println("Avançando para a próxima faixa de música...");
        }
    }

    public void retrocederMusica() {
        if (musicaTocando) {
            System.out.println("Retrocedendo para a faixa anterior de música...");
        }
    }

    public void fazerChamada(String numero) {
        if (!emChamada) {
            System.out.println("Fazendo chamada para " + numero + "...");
            emChamada = true;
        }
    }

    public void receberChamada(String numero) {
        if (!emChamada) {
            System.out.println("Recebendo chamada de " + numero + "...");
            emChamada = true;
        }
    }

    public void encerrarChamada() {
        if (emChamada) {
            System.out.println("Encerrando a chamada...");
            emChamada = false;
        }
    }

    public void abrirPaginaWeb(String url) {
        if (!navegando) {
            System.out.println("Abrindo página web: " + url);
            navegando = true;
        }
    }

    public void fecharPaginaWeb() {
        if (navegando) {
            System.out.println("Fechando a página web...");
            navegando = false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        // Exemplo de uso do iPhone
        meuiPhone.tocarMusica();
        meuiPhone.avancarMusica();
        meuiPhone.fazerChamada("123-456-789");
        meuiPhone.encerrarChamada();
        meuiPhone.abrirPaginaWeb("https://www.example.com");
        meuiPhone.fecharPaginaWeb();
    }
}
