public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque!");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("Saldo insuficiente! Saldo atual: R$" + String.format("%.2f", this.balance));
        }

        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
