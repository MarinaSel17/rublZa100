public class Main {

    public static void main(String[] args) {
        int count = 100;
        int refill = 1100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int itog = count + refill;
        System.out.println("Итоговый счет:" + itog);
        System.out.println("Количество бонусов:" + bonus);
    }
}
