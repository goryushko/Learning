//Create method to check: if number < 0 print “Number < 0”,
// if number > 0 print “Number > 0”
// if number = 0 throw your own exception

public class Task_1 {

    static int number = 0;

    public static void main(String[] args) throws MyException {
        if (number < 0) {
            System.out.println("Number < 0");
        }
        if (number > 0) {
            System.out.println("Number > 0");
        }
        if (number == 0) {
            throw new MyException("This number prohibits to be entered: " + number);
        }
    }
    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}


