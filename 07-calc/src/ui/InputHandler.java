package ui;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public double getDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine();
                return Double.parseDouble(input.replace(",","."));
            } catch (NumberFormatException e) {
                System.out.println("X Entrada inválida! Por favor, digite um número válido!");
            }
        }
    }

    public String getOperator(String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    public void close() {
        scanner.close();
    }
}
