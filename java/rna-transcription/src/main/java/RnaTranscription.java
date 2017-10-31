class RnaTranscription {
    String transcribe(String dnaStrand) {
        String rezRna = "";
        String[] tempDnaStand = dnaStrand.split("");
        String[] rnaStand = new String[tempDnaStand.length];
        for (int i = 0; i < tempDnaStand.length; i++) {
            switch (tempDnaStand[i]) {
                case "G":
                    rnaStand[i] = "C";
                    break;
                case "C":
                    rnaStand[i] = "G";
                    break;
                case "T":
                    rnaStand[i] = "A";
                    break;
                case "A":
                    rnaStand[i] = "U";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input");
            }

                rezRna = rezRna + rnaStand[i];

        }
        return rezRna;
    }

}
