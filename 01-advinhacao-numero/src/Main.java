import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100..");

        int numeroSecreto = random.nextInt(100) + 1; // Gera número entre 1-100
        int tentativas = 0;
        int palpite = 0;

        while (palpite != numeroSecreto) {
            System.out.println("Digite seu palpite: ");

            // Verifica se o input é valido
            try {
                palpite = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido!");
                scanner.next(); // Limpa o buffer do scanner
                continue;
            }

            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! tente um número maior.");
            }else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor");
            }
        }

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
        scanner.close();

    }
}