import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("u-MM-dd\'T\'H:m[:s]");
        DateTimeFormatter formatterOut1 = DateTimeFormatter.ofPattern("uuuu D HH:mm:ss");
        DateTimeFormatter formatterOut2 = DateTimeFormatter.ofPattern("uuuu D HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine(), formatter).
        plusMinutes(scanner.nextInt());

        if (localDateTime.getSecond() == 0)
        System.out.println(localDateTime.format(formatterOut2));
        else
        System.out.println(localDateTime.format(formatterOut1));
        }
}
