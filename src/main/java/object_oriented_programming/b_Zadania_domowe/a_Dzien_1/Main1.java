package object_oriented_programming.b_Zadania_domowe.a_Dzien_1;

public class Main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1234);
        account.depositCash(200);
        System.out.println(account.getCash());
        account.depositCash(100);
        System.out.println(account.getCash());
        account.depositCash(50);
        System.out.println(account.getCash());
        account.depositCash(-20);
        System.out.println(account.getCash());
        account.withdrawCash(100);
        System.out.println(account.getCash());
        account.withdrawCash(-50);
        System.out.println(account.getCash());
        account.withdrawCash(1000);
        System.out.println(account.getCash());
        System.out.println(account.printInfo());
        System.out.println(account.getCash());
        System.out.println(account.getNumber());

    }
}
