public class Task_2 {
    public enum Currency {
        DOLLAR,
        EURO,
        CHF,
        CAD,
        RUR
    }

    public static void main(String[] args) {
        for (Currency i : Currency.values()) {
            System.out.println(i);
        }
    }
}
