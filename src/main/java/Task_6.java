//Create ArrayList of Strings. Add 10 different Strings to it.
//Using any cycle find the longest String in the list and print it out.
//If there are several String with the same legth - print each from a new line."
//1) Create ArrayList of String and initialize it. - done.
//2) All values with the highest length should be printed out. - done.

import java.util.ArrayList;

public class Task_6 {
    public static void main(String[] args) {
        ArrayList<String> musicInstruments = new ArrayList<String>();
        musicInstruments.add("violin");
        musicInstruments.add("piano");
        musicInstruments.add("guitar");
        musicInstruments.add("drums");
        musicInstruments.add("tube");
        musicInstruments.add("cello");
        musicInstruments.add("accordion");
        musicInstruments.add("bagpipes");
        musicInstruments.add("flute");
        musicInstruments.add("clarinet");
        int longestString = musicInstruments.get(0).length();
        int arrayIndex = 0;
        for (int i = 0; i < musicInstruments.size(); i++) {
            if (musicInstruments.get(i).length() > longestString) {
                longestString = musicInstruments.get(i).length();
                arrayIndex = i;
            }
        }
        System.out.println("'" + musicInstruments.get(arrayIndex)+ "'" +
                " " + "is the longest word in the array.");
    }
}
