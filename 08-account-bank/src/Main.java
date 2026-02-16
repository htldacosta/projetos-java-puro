import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static double saldo = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {

        } while ();

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
    
}