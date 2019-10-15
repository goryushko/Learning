//Create method to check: if number < 0 print “Number < 0”,
// if number > 0 print “Number > 0”
// if number = 0 throw your own exception


public class Task_1 {
    static int number = 0;

    public static void main(String[] args) {


        try {
            if (number < 0) {
                System.out.println("Number < 0");
            }
            if (number > 0) {
                System.out.println("Number > 0");
            }
            if (number == 0) {
                throw new Exception("Zero is a deprecated value. Please, enter another one.");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}