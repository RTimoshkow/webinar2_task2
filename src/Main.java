public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int transfer = 1500;
        int finalBalance;

        if (transfer > 1000) {
            finalBalance = (int) (balance + transfer * 1.1);
        } else {
            finalBalance = balance + transfer;
        }
       System.out.println("Ваш баланс = " + finalBalance);
    }
}