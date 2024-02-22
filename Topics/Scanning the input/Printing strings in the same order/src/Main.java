import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(gcd(15, 44));

    }
    public static int gcd(int a, int b) {
        while (b > 0) {

            int c = a % b;
            System.out.println("a = " + a + " b= " + b + " c = " + c);
            a = b;
            b = c;

        }
        return a;
    }
}