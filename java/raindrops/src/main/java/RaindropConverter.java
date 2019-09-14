public class RaindropConverter {

    String convert(int number) {
        String raindropSpeak  = "";
            if (number % 3 == 0) {
                raindropSpeak +="Pling";
            }
            if (number % 5 == 0) {
              raindropSpeak += "Plang";
            }
            if (number % 7 == 0) {
              raindropSpeak += "Plong";
            }
            if (raindropSpeak == "") {
              raindropSpeak = Integer.toString(number);
            }
        return raindropSpeak;
    }
}
