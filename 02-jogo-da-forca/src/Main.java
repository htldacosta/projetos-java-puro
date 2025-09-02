public class Main {
    public static void main(String[] args) {

        var jogador = new Jogador("Hitalu");
        var palavra = new Palavra();

        var jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();
    }
}