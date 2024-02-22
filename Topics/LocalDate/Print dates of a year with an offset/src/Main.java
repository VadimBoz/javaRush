import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        int year = localDate.getYear();
        int count = scanner.nextInt();
        System.out.println(localDate);
        while (true) {
            localDate = localDate.plusDays(count);
            if (localDate.getYear() > year) break;
            System.out.println(localDate);
        }
    }
}
