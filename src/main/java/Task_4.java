//Create an array of 15 random integers from the segment [0;   9]. - done
// Display the array on the screen. - done
// Count how many in the array of even elements and display this number on the screen on a separate line. - done.

import java.util.Arrays;
import java.util.Random;

public class Task_4 {

    public static void main(String[] args) {
        int evenCount = 0;
        Integer[] arr = new Integer[15];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("15 numbers generated randomly: " + Arrays.toString(arr));

        System.out.println("The quantity of an even numbers in the array is: " + evenCount);
    }

}
