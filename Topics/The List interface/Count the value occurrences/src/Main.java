import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        List<Integer> l1 = list1.stream().filter(s -> s== elem).collect(Collectors.toList());
        List<Integer> l2 = list2.stream().filter(s -> s== elem).collect(Collectors.toList());
        return l1.size() == l2.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        List<Integer> l1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> l2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        List<Integer> l1 = Arrays.stream(scanner.nextLine().split(" "))
//                .map(s -> Integer.parseInt(s))
//                .collect(Collectors.toList());
//        List<Integer> l2 = Arrays.stream(scanner.nextLine().split(" "))
//                .map(s -> Integer.parseInt(s))
//                .collect(Collectors.toList());

        System.out.println(checkTheSameNumberOfTimes(n, l1, l2));
    }
}