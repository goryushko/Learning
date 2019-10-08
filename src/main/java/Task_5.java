//Create ArrayList of Strings. Add 5 different Strings to it.
//Using any cycle print all the values of the ArrayList to the console.
//1) Create ArrayList of String and initialize it. - done.
//2) The size of the ArrayList should be printed to the console. - done.
//3) All values should be printed to the console (each from a new line)" - done.

import java.util.ArrayList;

public class Task_5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("plum");
        fruits.add("apple");
        fruits.add("pineapple");
        System.out.println("The size of the array is: " + fruits.size());
        System.out.println("The list of the fruits is below:");
        for (String i : fruits) {
            System.out.println(i + "\n");
        }
    }
}
