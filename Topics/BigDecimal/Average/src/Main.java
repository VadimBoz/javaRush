import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal bD1 = new BigDecimal(scanner.next());
        BigDecimal bD2 = new BigDecimal(scanner.next());
        BigDecimal bD3 = new BigDecimal(scanner.next());
        System.out.println(bD1.add(bD2).add(bD3).divide(BigDecimal.valueOf(3L), RoundingMode.DOWN).setScale(0, RoundingMode.DOWN));
    }
}