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

        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        int numeroUsuario;
        int escolhaComputador;

        numeroUsuario = leitor.nextInt();
        escolhaComputador = gerador.nextInt(3) + 1; // Gere um numero entre 1 e 3
        
        if (numeroUsuario == escolhaComputador) {
            System.out.println("Empate.");
        } else if ((numeroUsuario - escolhaComputador) == -1 ||
                (numeroUsuario - escolhaComputador) == 2) {
            System.out.println("Usuario vencedor.");
        }else {
            System.out.println("Computador foi vencedor.");
        }
    }
}