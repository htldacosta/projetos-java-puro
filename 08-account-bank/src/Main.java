import java.util.Scanner;

public class Main {

    private static double saldo = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {

            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    saque();
                    break;
                case 3:
                    verSaldo();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();

    }

    private static void exibirMenu() {
        System.out.println("\n=== AGENCIA BANCÁRIA ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Sair");
        System.out.println("Escolha uma opção: ");

    }

    private static void depositar() {
        System.out.print("\nDigitar o valor para depósito: ");
        double valor = scanner.nextDouble();

        if(valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso!", valor);
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    private static void saque() {
        System.out.print("\nDigite o valor para saque: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            if (valor <= saldo) {
                saldo= valor;
                System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valor);
            } else {
                System.out.printf("Saldo insuficiente para realizar o saque! Seu saldo é : R$%.2f\n", saldo);
            }
        } else {
            System.out.println("Valor inválido para saque!");
        }
    }

    private static void verSaldo() {
        System.out.printf("\nSeu saldo atual é : R$%.2f\n", saldo);
    }

}