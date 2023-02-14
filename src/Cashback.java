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
        int cashback = refill / 100;
        int balanceWithBonus = cashback + refill + balance;
        int balanceNoBonus = balance + refill;

        int amount;
        if (refill >= 1000) {
            amount = balanceWithBonus;
        } else {
            amount = balanceNoBonus;
        }
        // int amount = refill >= 1000 ? balanceWithBonus : balanceNoBonus;
        int bonus;
        if (refill >= 1000){
            bonus = cashback;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш баланс: " + amount + " рублей " + " Ваш бонус: " + bonus + " рублей");


    }

}





