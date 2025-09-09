import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?/";

    public static String generate(int length, boolean useUppercase, boolean useNumbers, boolean useSymbols) {
        String chars = LOWERCASE;
        if (useUppercase) chars += UPPERCASE;
        if (useNumbers) chars += DIGITS;
        if (useSymbols) chars += SYMBOLS;

        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < length; i++) {
            senha.append(chars.charAt(random.nextInt(chars.length())));
        }
        return senha.toString();
    }
}
