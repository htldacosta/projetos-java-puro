import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 - papel; 2 - Pedra; 3 - Tesoura;

        // U(1) C(2) = -1 Usuario Venceu;
        // U(1) C(3) = -2, Computador Venceu
        // U(2) C(1) = 1, Computador Venceu
        // U(2) C(3) = -1. Usuario Venceu
        // U(3) C(1) = 2, Usuario Venceu
        // U(3) C(2) = 1, Computador Venceu

        int numeroUsuario;
        int escolhaComputador;
        int pontosComputador = 0;
        int pontosUsuario = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Jokenpo. digite 1: Papel. 2: Pedra. 3: Tesoura.");
            Scanner leitor = new Scanner(System.in);
            Random gerador = new Random();

            numeroUsuario = leitor.nextInt();
            escolhaComputador = gerador.nextInt(3) + 1; // Gere um numero entre 1 e 3

            // verifica a escolha do computador
            switch (escolhaComputador) {
                case 1:
                    System.out.println("Computador escolheu Papel");
                    break;
                case 2:
                    System.out.println("Computador escolheu Pedra");
                    break;
                case 3:
                    System.out.println("Computador escolheu Tesoura");
                    break;
            }

            // verifica o vencedor da partida
            if (numeroUsuario == escolhaComputador) {
                System.out.println("Empate.");
            } else if ((numeroUsuario - escolhaComputador) == -1 ||
                    (numeroUsuario - escolhaComputador) == 2) {
                System.out.println("Vc venceu a partida.");
                pontosUsuario++;
            } else {
                System.out.println("O computador venceu a partida.");
                pontosComputador++;
            }
        }
        // verifica o vencedor do jogo
        if (pontosUsuario > pontosComputador) {
            System.out.println("Usuario venceu o jogo.");
        } else if (pontosComputador > pontosUsuario) {
            System.out.println("O computador venceu o jogo.");
        }
        else {
            System.out.println("Empate entre os jogadores.");
        }

        System.out.println(pontosComputador + " | " + pontosUsuario);

    }
}