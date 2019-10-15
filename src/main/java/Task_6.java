//Write a program that will enter numbers from the keyboard.
//The code for reading numbers from the keyboard must be in the readData method.
//The code inside the readData is wrapped in a try..catch.
//If the user entered some text, instead of entering a number, the method should catch the exception
//and display all previously entered numbers as a result.
//Numbers output from a new line preserving the order of input.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_6 {

    static void readData(){
        List<Integer> tokens = new ArrayList<>();
        System.out.println("Please, enter you numbers: ");
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            try {
                if (i >= 0) {
                    tokens.add(Integer.valueOf(scanner.nextLine()));
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println(tokens);
      }
    }

    public static void main(String[] args) {
        readData();
    }
}
