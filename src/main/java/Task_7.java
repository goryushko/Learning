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
//
//        Print the content of the map, each pair from a new line.
//        Example:
//        watermelon - berry;
//        cherry - berry;
//        ..."

import java.util.HashMap;
import java.util.Map;

public class Task_7 {
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
        for (Map.Entry entry : names.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue() + ";");
        }
    }
}
