import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    private static final String PHONE_NUMBER_PATTERN = "^\\(84\\)-\\(0\\d{9}\\)$";

    public static boolean isValidPhoneNumber(String number) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("(84)-(0978489648)")); // True
        System.out.println(isValidPhoneNumber("(a8)-(22222222)")); // False
    }
}
