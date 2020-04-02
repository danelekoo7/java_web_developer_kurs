package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad3;

public class Main3 {
    public static void main(String[] args) {
        AtmApi atmApi = new AtmApi();
        atmApi.deposit();
        atmApi.getLoan();
        atmApi.payOut();
        atmApi.recharge();
        atmApi.transferMoney();
    }
}
