import java.util.ArrayList;

public class RaindropConverter {

    String convert(int number) {
        String raindropSpeak  = "";
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        for (int i = 1; i<=number; i++) {
            if (number % i ==0) {
                arrl.add(i);
            }
        }
        if (arrl[2] == 3) {
            raindropSpeak+="Pling";
        }
        else if (arrl[])
        return raindropSpeak;

    }

}
