//Create enum for days of the week.
//Write a program which will be printing the number of a day according to day of the week.
//Example:If today is Sunday - print 1; If today is Monday - print 2..."
//Use switch(day of the week) to pass the day of the week.

enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Task_10 {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.FRIDAY;

        switch (day) {
            case MONDAY:
                System.out.println("1");
                break;
            case TUESDAY:
                System.out.println("2");
                break;
            case WEDNESDAY:
                System.out.println("3");
                break;
            case THURSDAY:
                System.out.println("4");
                break;
            case FRIDAY:
                System.out.println("5");
                break;
            case SATURDAY:
                System.out.println("6");
                break;
            case SUNDAY:
                System.out.println("7");
                break;
        }

    }

}
