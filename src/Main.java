import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String REGEX = "^\\(84\\)-\\(0[0-9]{9}\\)$";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien thoai: ");
        String phoneNumber = scanner.nextLine();

        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(phoneNumber);
        if (matcher.find()) {
            System.out.println("So dien thoai hop le");
        } else {
            System.out.println("So khong hop le");
        }
    }
}