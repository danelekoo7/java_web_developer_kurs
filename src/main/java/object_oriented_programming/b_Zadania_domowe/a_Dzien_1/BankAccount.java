package object_oriented_programming.b_Zadania_domowe.a_Dzien_1;

public class BankAccount {
    private int number;
    private double cash = 0;

    protected BankAccount(int number) {
        this.number = number;
    }

    protected int getNumber() {
        return this.number;
    }

    protected double getCash() {
        return this.cash;
    }

    protected void depositCash(double amount) {
        if (amount >= 0) {
            this.cash = this.cash + amount;
        } else {
            System.out.println("kwota nie może być mniejsza od zera");
        }
    }

    protected double withdrawCash(double amount) {
        double result = 0;
        if (amount > 0 && amount <= this.cash) {
            result = this.cash - amount;
            this.cash = result;
        } else if (amount > 0 && amount > this.cash) {
            result = this.cash;
            this.cash = 0;
        } else {
            System.out.println("Kwota nie może być mniejsza od zera");
        }
        return result;
    }

    protected String printInfo() {
        return "numer konta to " + this.number + " stan konta to " + this.cash;
    }
}