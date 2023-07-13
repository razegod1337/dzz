public class Tel {
    public static void main(String[] args) {
        int balans = 100;
        int res;
        int popolnenue = 1100;
        int bonus;
        if (popolnenue > 1000) {
            bonus = popolnenue / 100;
            res = popolnenue + balans + bonus;
            System.out.println("Ваш баланс состовляет: " + res + " Бонусов начислено " + bonus);
        } else {
            res = balans + popolnenue;

            System.out.println("Ваш баланс состовляет " + res);

        }

    }
}