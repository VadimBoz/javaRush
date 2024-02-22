import java.util.Locale;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double d = scanner.nextDouble();
        // put your code here
        System.out.println(Math.PI * d * d);
    }
}
