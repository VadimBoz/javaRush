import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[0]);
        int day = Integer.parseInt(str[2]);
        System.out.println(LocalDate.of(year,month,1).plusMonths(1).minusDays(day));
    }
}
