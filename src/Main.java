public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int balancePlus = 100;

        int newBalance;
        int bonus;
        if (balancePlus > 1000) {
            bonus = balancePlus / 100;
            newBalance = balance + balancePlus + bonus;
        } else {
            newBalance = balance + balancePlus;
            bonus = 0;
        }
        System.out.println("Итоговая сумма на счету клиента: " + newBalance + " руб.");
        System.out.println("Бонус равен: " + bonus + " руб.");
    }
}
