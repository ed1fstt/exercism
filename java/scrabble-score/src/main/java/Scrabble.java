import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private static String input;

    Scrabble(String finput) {
        input = finput;
    }

    int getScore() {
        int rezScore = 0;

        ArrayList<Character> arl1 = getList("aeioulnrst");
        ArrayList<Character> arl2 = getList("dg");
        ArrayList<Character> arl3 = getList("bcmp");
        ArrayList<Character> arl4 = getList("fhvwy");
        ArrayList<Character> arl5 = getList("k");
        ArrayList<Character> arl8 = getList("jx");
        ArrayList<Character> arl10 = getList("qz");

        Map<ArrayList<Character>, Integer> map = new HashMap<>();
        map.put(arl1, 1);
        map.put(arl2, 2);
        map.put(arl3, 3);
        map.put(arl4, 4);
        map.put(arl5, 5);
        map.put(arl8, 8);
        map.put(arl10, 10);

        input = input.toLowerCase();
        char[] inputAr = input.replace(" ", "").toCharArray();
        Arrays.sort(inputAr);

        for (int i = 0; i < inputAr.length; i++) {
            ArrayList<Character> tempArl = new ArrayList<>();
            if (arl1.contains(inputAr[i])) {
                tempArl = arl1;
            } else if (arl2.contains(inputAr[i])) {
                tempArl = arl2;
            } else if (arl3.contains(inputAr[i])) {
                tempArl = arl3;
            } else if (arl4.contains(inputAr[i])) {
                tempArl = arl4;
            } else if (arl5.contains(inputAr[i])) {
                tempArl = arl5;
            } else if (arl8.contains(inputAr[i])) {
                tempArl = arl8;
            } else if (arl10.contains(inputAr[i])) {
                tempArl = arl10;
            }
            rezScore = rezScore + map.get(tempArl).intValue();
        }

        return rezScore;
    }

    public ArrayList<Character> getList(String words) {
        ArrayList<Character> sampleList = new ArrayList<Character>();
        for (int i = 0; i < words.length(); i++) {
            sampleList.add(words.charAt(i));
        }
        return sampleList;
    }
}
