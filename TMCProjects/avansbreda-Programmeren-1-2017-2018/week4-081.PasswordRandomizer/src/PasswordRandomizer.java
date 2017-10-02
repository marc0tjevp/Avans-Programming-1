import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Random password = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
    }

    public String createPassword() {

        String s = "";

        for(int i = 0; i < passwordLength; i++){
            char a = alphabet.charAt(password.nextInt(alphabet.length()));
            s+=a;
        }

        return s;
    }
}
