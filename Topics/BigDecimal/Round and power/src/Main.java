import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int power  = scanner.nextInt();
        int scale  = scanner.nextInt();
        BigDecimal bigDecimal1 = new BigDecimal(scanner.next()).setScale(scale, RoundingMode.FLOOR);
        System.out.println(bigDecimal1.pow(power));
    }
}