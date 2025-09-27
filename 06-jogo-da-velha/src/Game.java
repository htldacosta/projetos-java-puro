import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    String[][] tabuleiro = new String[3][3];
    private int jogador = 0; //0 = e 1 = x

    public Game(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tabuleiro[i][j] = " ";
            }
        }
    }

    public void executar(){
        tela();
        verificarJogador();
        System.out.println(jogador);
    }

    public void tela(){

        System.out.println("   0   1   2");
        System.out.println("0: " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println("1: " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println("2: " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
    }

    public int verificarJogador(){
        if (jogador == 0){
            jogador = 1;
        } else {
            jogador = 0;
        }
        return jogador;
    }

    public void jogada(){
        int linhaJogada, colunaJogada;

        do {
            System.out.println("Digite a linha escolhida: ");
            linhaJogada = scanner.nextInt();
            System.out.println("Digite a coluna escolhida: ");
            colunaJogada = scanner.nextInt();

            if (linhaJogada >= 0 && linhaJogada < 3 && colunaJogada >= 0 && colunaJogada < 3 && tabuleiro[linhaJogada][colunaJogada] == " "){

                break;
            }else {
                System.out.println("Jogada inválida! Tente novamente!");
            }
        }while (true);


    }
}
