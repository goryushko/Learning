//Create ArrayList<Integer> and add 100 random numbers (Use Math.random()). -done.
//Create HashSet<Integer> and add all unique numbers from the ArrayList. - done.

import java.util.*;

public class Task_9 {
    private static int[] rnd;
    //private static int rnd;

    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList();
        for (int i = 0; i < 100; i++) {
            int rnd = (int) (Math.random() * 100);
            randomNumbers.add(rnd);
        }
        Set<Integer> uniqueNumbers = new HashSet<Integer>(randomNumbers);
        System.out.println(uniqueNumbers);
    }
}









