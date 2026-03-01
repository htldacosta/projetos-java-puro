import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();
        int option;

        do {
            showMenu();
        }
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