import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("u-MM-dd\'T\'H:m[:s]");
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine(), formatter).
                plusHours(11);
        LocalDate ld = localDateTime.toLocalDate();
        System.out.println(ld);
    }
}
