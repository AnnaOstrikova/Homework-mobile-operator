// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int customerAccount = 100;
        int replenishment = 1100;
        boolean replenishmentAmount = replenishment > 1000;
        int bonus = replenishmentAmount ? replenishment / 100 : 0;
        int replenishedAccount = customerAccount + replenishment + bonus;
        System.out.println("Колличество бонусных рублей - " + bonus);
        System.out.println("Итоговый счет - " + replenishedAccount);

    }
}
