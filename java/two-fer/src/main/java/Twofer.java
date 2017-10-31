public class Twofer {
    public String twofer(String name) {
      String rez = "";
      if (name==null) {
          rez =  "One for you, one for me.";
      }
      else {
        rez = "One for "+name+", one for me.";
      }
      return rez;
    }
}
