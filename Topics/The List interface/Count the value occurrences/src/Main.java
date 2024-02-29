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

}
