import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int n = Integer.parseInt(scanner.next());
        int len = str.length();
        
        if (n < len) {
            String s1 = str.substring(0, n);
            String s2  = str.substring(n) + s1;
            System.out.println(s2);
        } else
            System.out.println(str);

    }
}
