public class Main {
    public static void main(String[] args) {
        int amount = 13_676;
        int bonus = 20;
        int result;
        if (amount > 0) {
            result = amount / bonus;
            System.out.println("Ваши бонусы составили: " + (result));
        } else {
            System.out.println("Бонусов нету");
        }
    }
}
