//Create HashMap<String, String> and add 10 pairs:
//        watermelon, berry;
//        banana, fruit;
//        cherry, berry;
//        pineapple, fruit;
//        melon, vegetable;
//        cranberry, berry;
//        apple, fruit;
//        iris, flower;
//        potato, vegetable;
//        carrot, vegetable;
//        Print only vegetables to the console."
// Note: Do not use predefined keys to get vegetables. You should use conditions to find vegetables.
// Tips: 1) Map iterator; 2) Map.Entry; 3) Foreach.

import java.util.HashMap;
import java.util.Map;

public class Task_8 {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("watermelon", "berry");
        names.put("banana", "fruit");
        names.put("cherry", "berry");
        names.put("pineapple", "fruit");
        names.put("melon", "vegetable");
        names.put("cranberry", "berry");
        names.put("apple", "fruit");
        names.put("iris", "flower");
        names.put("potato", "vegetable");
        names.put("carrot", "vegetable");

        String key = "vegetable";

        for (Map.Entry<String, String> entry : names.entrySet()) {
            String result = (entry.getValue() == key) ? entry.getKey() : "";
            System.out.println(result);
        }
    }
}


