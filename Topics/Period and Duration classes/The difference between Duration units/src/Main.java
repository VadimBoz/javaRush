import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Duration> durations = createDurationList(scanner);

        Duration result = getMaxMinusAvg(durations);

        System.out.println(result);
    }

    public static List<Duration> createDurationList(Scanner scanner) {
        List<Duration> list = new ArrayList<>();
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.DAYS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.HOURS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.SECONDS));

        return list;
    }

    public static Duration getMaxMinusAvg(List<Duration> durations) {
        Duration sumD = Duration.ofNanos(0);
        Duration maxD = Duration.ofNanos(0);
        for (Duration item : durations) {
            if (item.compareTo(maxD) > 0) maxD = item;
            sumD = sumD.plus(item);
        }
        return maxD.minus(sumD.dividedBy(durations.size()));
    }
}