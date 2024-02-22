import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt(); // uppercase letters
        int b = scanner.nextInt(); // lowercase letters
        int c = scanner.nextInt();  // digits
        int n = scanner.nextInt(); // consists of exactly N symbols

        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            index.add(i);
        }

        Random randomN = new Random();
        ArrayList<Character> arrayListN;
        arrayListN = Stream.generate(ArrayList::new).limit(n)
                .map(s -> (char) (randomN.nextInt(25) + 97))
                .collect(Collectors.toCollection(ArrayList::new));


        ArrayList<Character> arrayListA;
        arrayListA = Stream.generate(ArrayList::new).limit(a)
                .map(s -> (char) (randomN.nextInt(25) + 65))
                .collect(Collectors.toCollection(ArrayList::new));


        ArrayList<Character> arrayListC;
        arrayListC = Stream.generate(ArrayList::new).limit(c)
                .map(s -> (char) (randomN.nextInt(9) + 48))
                .collect(Collectors.toCollection(ArrayList::new));


        arrayListN = addChar(arrayListA, arrayListN, index);
        arrayListN = addChar(arrayListC, arrayListN, index);

        for (int i = 0; i < arrayListN.size() - 1 ; i++) {
            while (arrayListN.get(i) == arrayListN.get(i+1)) {
                char cc = getRandomChar(arrayListN.get(i+1));
                arrayListN.remove(i + 1);
                arrayListN.add(i + 1, cc);
            }
        }

        arrayListN.forEach(System.out::print);
    }


    private static ArrayList<Character> addChar(ArrayList<Character> arrayListIN, ArrayList<Character> arrayListRes, ArrayList<Integer> index) {
        Random random = new Random();
        for (Character item : arrayListIN) {
            int rnd = random.nextInt(index.size());
            int ind = index.get(rnd);
            index.remove(rnd);
            arrayListRes.set(ind, item);
        }
        return arrayListRes;
    }

    private  static char getRandomChar(char ch) {
        Random random = new Random();
        if (ch >= 33 && ch <= 47) {
            return  (char) (random.nextInt(14) + 33);
        } else if (ch >= 48 && ch <= 57) {
            return  (char) (random.nextInt(9) + 48);

        } else if (ch >= 65 && ch <= 90) {
            return (char) (random.nextInt(25) + 65);

        } else if (ch >= 97 && ch <= 122) {
            return (char) (random.nextInt(25) + 97);
        } else return (char) (random.nextInt(14) + 33);
    }

}