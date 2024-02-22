import java.time.LocalDate;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate localDate = LocalDate.of(year, month, 1);
        int m = localDate.getMonth().getValue();
        int d = localDate.getDayOfMonth();
        System.out.println(localDate + " " + localDate.plusMonths(1).minusDays(1));
    }
}
