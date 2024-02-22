import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        int year = 2017;
//        int day  = 365;
        Scanner scanner  = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate ld = LocalDate.ofYearDay(year, day);
        int m = ld.getMonth().getValue();
        int length = ld.lengthOfMonth();
        LocalDate ld1 = LocalDate.of(year, m, 1);
        LocalDate ld2 = LocalDate.of(year, m, 1).plusMonths(1).minusDays(1);
//        System.out.println(ld1);
//        System.out.println(ld2);
//        System.out.println(ld);
//        System.out.println(length);
        if (ld.isEqual(ld2)) System.out.println(true);
        else System.out.println(false);
    }
}