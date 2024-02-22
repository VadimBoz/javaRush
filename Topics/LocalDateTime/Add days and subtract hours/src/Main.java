import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-M-d\'T\'H:m");

        LocalDateTime ldt = LocalDateTime.parse(scanner.next(), dateTimeFormatter);
        System.out.println(ldt.plusDays(scanner.nextInt()).minusHours(scanner.nextInt()));
    }
}
