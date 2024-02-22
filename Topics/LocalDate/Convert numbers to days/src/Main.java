import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
         Scanner scanner = new Scanner(System.in);
        int year  = scanner.nextInt();
        int dayInYear  = scanner.nextInt();
        int dayInYear1  = scanner.nextInt();
        int dayInYear2  = scanner.nextInt();
        System.out.println(LocalDate.ofYearDay(year, dayInYear));
        System.out.println(LocalDate.ofYearDay(year, dayInYear1));
        System.out.println(LocalDate.ofYearDay(year, dayInYear2));
        
    }
}
