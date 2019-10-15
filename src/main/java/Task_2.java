//Fix the method with try-catch to get the correct result of division:

public class Task_2 {
    public static void main(String[] args) {

        try {
            System.out.println(divideByZero());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}

