import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.next());
        System.out.println(localDate.getDayOfYear() + " " + localDate.getDayOfMonth());
    }
}
