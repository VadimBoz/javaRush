import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        BigInteger c = new BigInteger(scanner.next());
        BigInteger d = new BigInteger(scanner.next());
        BigInteger zer0 = BigInteger.ZERO;
        BigInteger res  =  a.negate().multiply(b).add(c).subtract(d);
        System.out.println(res);

    }
}