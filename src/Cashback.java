public class Cashback {

    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int balance = 400;
        int refill = 1100;
        int x = refill / 100;
        int y = refill / 100 + refill + balance;
        int i = balance + refill;

        int amount;
        if (refill >= 1000) {
            amount = y;
        } else {
            amount = i;
        }
        // int amount = refill >= 1000 ? y : i;
        int bonus;
        if (refill >= 1000){
            bonus = x;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш баланс: " + amount + " рублей " + " Ваш бонус: " + bonus + " рублей");


    }

}





