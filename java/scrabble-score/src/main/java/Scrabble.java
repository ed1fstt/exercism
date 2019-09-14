import java.util.*;

public class Scrabble {
    private static String input;
    private Map<Character, Integer> map = new HashMap<>();

    Scrabble(String finput) {
        input = finput;
    }

    int getScore() {
        int rezScore = 0;

        puttAll("aeioulnrst",1);
        puttAll("dg",2);
        puttAll("bcmp",3);
        puttAll("fhvwy",4);
        puttAll("k",5);
        puttAll("jx",8);
        puttAll("qz",10);

        input = input.toLowerCase();
        char[] inputAr = input.replace(" ", "").toCharArray();
        Arrays.sort(inputAr);

        for (int i = 0; i < inputAr.length; i++) {
            rezScore += map.get(inputAr[i]);
        }
        return rezScore;
    }

    public void puttAll(String words, Integer s){
        for (int i = 0; i < words.length(); i++) {
            map.put(words.charAt(i), s);
        }

    }
}
