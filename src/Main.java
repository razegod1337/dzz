public class Main {
    public static void main(String[] args) {
        int amount = 13_676;
        int bonus = 20;
        int resyaltat;
        if (amount > 0) {
            resyaltat = amount / bonus;
            System.out.println("Ваши бонусы составили: " + (resyaltat));
        } else {
            System.out.println("Бонусов нету");
        }
    }
}
