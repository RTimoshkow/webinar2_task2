public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int transfer = 1869;
        int finalBalance;

        if (transfer > 1000) {
            finalBalance = (balance + transfer + transfer / 100);
        } else {
            finalBalance = balance + transfer;
        }
        System.out.println("Ваш баланс = " + finalBalance);
    }
}