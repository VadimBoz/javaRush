import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        int n = Integer.parseInt(scanner.next());

        int indexMin = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < n)
                indexMin = i;
            else break;
        }

        int indexMax = array.size() - 1;
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) > n)
                indexMax = i;
            else break;
        }

        if (array.contains(n)) {
            for (Integer item : array) {
                if (Objects.equals(n, item)) {
                    System.out.print(n + " ");
                }
            }
        } else if (array.get(indexMax) != n && array.get(indexMin) != n) {
            if ((array.get(indexMax) - n) < (n - array.get(indexMin))) {
                for (Integer item : array) {
                    if ((Objects.equals(item, array.get(indexMax)))) {
                        System.out.print(item + " ");
                    }
                }
            } else if ((array.get(indexMax) - n) > (n - array.get(indexMin))) {
                for (Integer item : array) {
                    if ((Objects.equals(item, array.get(indexMin)))) {
                        System.out.print(item + " ");
                    }
                }

            } else {
                for (Integer item : array) {
                    if (Objects.equals(item, array.get(indexMax)) ||
                            (Objects.equals(item, array.get(indexMin)))) {
                        System.out.print(item + " ");
                    }
                }

            }
        }

    }

}


//    int delta = Integer.MAX_VALUE;
//        for (int i : numbers) {
//                if (Math.abs(i - n) < delta) {
//        delta = Math.abs(i - n);
//        result.clear();
//        result.add(i);
//        } else if (Math.abs(i - n) == delta) {
//        result.add(i);
//        }
//        }
