import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();
        int option;

        do {
            showMenu();
            option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        System.out.print("\nDigite o valor para depósito: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.printf("Depósito de R$.2f realizado com sucesso!\n", depositAmount);
                        break;
                    case 2:
                        System.out.print("\nDigite o valor para saque: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.printf("Saque de R$%.2f realizado com sucesso!\n", withdrawAmount);
                        break;
                    case 3:
                        System.out.printf("\nSeu saldo atual é: R$%.2f\n", account.getBalance());
                        break;
                    case 4:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("\nErro: " + e.getMessage());
            }
        } while (option != 4);

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n=== AGÊNCIA BANCÁRIA ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

}