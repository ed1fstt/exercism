import java.util.Arrays;
import java.util.Objects;

public class PangramChecker {
    public boolean isPangram(String input) {
        boolean isPangram = false;
        if (input != null) {
            String Alphabet = "abcdefghijklmnopqrstuvwxyz";
            String[] aAlphabet = Alphabet.split("");
            while (input.contains(" ")) {
                input = input.replace(" ", "");
            }
            input = input.toLowerCase();
            String[] aInput = input.split("");
            for (int i = 0; i < aAlphabet.length; i++) {
                boolean isThere = false;
                for (int j = 0; j < aInput.length; j++) {
                    if (Objects.equals(aAlphabet[i], aInput[j])) {
                        isThere = true;
                        break;
                    }
                }
                if (!isThere) {
                    isPangram = false;
                    break;
                } else {
                    isPangram = true;
                }
            }
        }
        return isPangram;
    }

}
