import static java.lang.Character.isLowerCase;

public class HiddenWord {
    String hiddenWord;
    public HiddenWord(String word){
        hiddenWord = word.toUpperCase();
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getHint(String guess) {
        String hint = "";
        if (guess.toUpperCase() != guess) {
            String error = "Your guess ( " + guess + " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!";
            throw new IllegalArgumentException(error);
        }
        if (guess.length() != hiddenWord.length()) {
            String error = "Your guess ( " + guess + " ) has " + guess.length() + " characters. " + "The hidden word has " + hiddenWord.length() + " characters. Your guess must be a word with " + hiddenWord.length() + " characters!";
            throw new IllegalArgumentException(error);
        }
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == hiddenWord.charAt(i)) {
                hint += hiddenWord.charAt(i);
            } else {
                if (hiddenWord.contains("" + guess.charAt(i))){
                    hint += "+";
                } else {
                    hint += "*";
                }
            }

        }
        return hint;
    }
}
