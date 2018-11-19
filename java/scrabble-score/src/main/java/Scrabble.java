import java.util.ArrayList;
import java.util.Arrays;
public class Scrabble {
    private static String input;
    Scrabble(String finput){
        input =finput;
    }
    int getScore() {
        int rezScore =0;
        Character[] ar1 = {'a','e','i','o','u','l','n','r','s','t'};
        Character[] ar2 = {'d','g'};
        Character[] ar3 = {'b','c','m','p'};
        Character[] ar4 = {'f','h','v','w','y'};
        Character[] ar5 = {'k'};
        Character[] ar8 = {'j','x'};
        Character[] ar10 = {'q','z'};
       ArrayList<Character> arl1 = getList("aeioulnrst");
       

        input = input.toLowerCase();
        char[] inputAr = input.replace(" ","").toCharArray();
        Arrays.sort(inputAr);

        for(int i = 0; i<inputAr.length; i++){
            if (Arrays.asList(ar1).contains(inputAr[i])){
                rezScore++;
            }else if (Arrays.asList(ar2).contains(inputAr[i])){
                rezScore=rezScore+2;
            }else  if(Arrays.asList(ar3).contains(inputAr[i])){
                rezScore=rezScore+3;
            }else if (Arrays.asList(ar4).contains(inputAr[i])){
                rezScore=rezScore+4;
            }else if (Arrays.asList(ar5).contains(inputAr[i])){
                rezScore=rezScore+5;
            }else if (Arrays.asList(ar8).contains(inputAr[i])){
                rezScore=rezScore+8;
            }else if (Arrays.asList(ar10).contains(inputAr[i])){
                rezScore=rezScore+10;
            }
        }
        return rezScore;
    }
   public  ArrayList<Character> getList(String words){
        ArrayList<Character> sampleList = new ArrayList<Character>();
        for(int i =  0; i<words.lenght(); i++){
            sampleList.add(words.charAt(i));
        }
        return sampleList;
    }
}
