import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    private final Palavra palavra;
    private final Jogador jogador;

    public Jogo(Palavra palavra, Jogador jogador) {
        this.palavra = palavra;
        this.jogador = jogador;
    }

    public void iniciarJogo() {
        var numeroChutes = 10;
        var chutes = new ArrayList<String>();

        this.palavra.gerarPalvaraSecreta();

        var scanner = new Scanner(System.in);
        System.out.println("Olá " + this.jogador.getNome() + ", bem-vindo ao jogo da Forca!");
        System.out.println("Você tem " + numeroChutes + "chutes para advinhar a palavra secreta");
        System.out.println(this.palavra.getPalavraComChute() + "\n");

        while(!this.palavra.palavraCompleta() && chutes.size() < numeroChutes) {
            System.out.println("Digite seu chute: ");
            var chute = scanner.nextLine();

            if(chutes.contains(chute)) {
                System.out.println("Você já chutou essa letra! Tente novamente!");
                continue;
            }
            chutes.add(chute);

            this.palavra.revelarLetra(chute);

            System.out.println("Palavra: " + this.palavra.getPalavraComChute());

            if (this.palavra.palavraCompleta()) {
                System.out.println("Parabéns " + this.jogador.getNome() + "! Você venceu");
            } else if (chutes.size() > numeroChutes) {
                System.out.println("Poxa " + this.jogador.getNome()
                        + " ! Você perdeu! a palavra secreta era " + this.palavra.getPalavraSecreta());

            }
        }
    }
}
