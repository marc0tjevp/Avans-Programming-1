
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
//        if(!guessedLetters.contains(letter)) {
//            this.guessedLetters += letter;
//        } else {
//            this.numberOfFaults += 1;
//        }
        if (guessedLetters.contains(letter)) {

        } else if (word.contains(letter)) {
            guessedLetters += letter;
        } else {
            numberOfFaults++;
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        int length = word.length();
        int i = 0;
        String hidden = "";
        while (i < length) {
            char c = word.charAt(i);
            String character = "" + c;
            if (guessedLetters.contains(character)) {
                hidden += word.charAt(i);
            } else {
                hidden += "_";
            }
            i++;
        }
        return hidden;
    }
}
