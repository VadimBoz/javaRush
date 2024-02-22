import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner  = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd\'T\'HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine(),dateTimeFormatter );
        LocalDateTime localDateTimeStart = LocalDateTime.of(localDateTime.getYear(), 1,1, 0,0);
        Duration duration = Duration.between(localDateTimeStart, localDateTime);
        System.out.println(duration.getSeconds()/(60*60));
    }
}