import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double ro = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println(ro * h * 9.8);
    }
}