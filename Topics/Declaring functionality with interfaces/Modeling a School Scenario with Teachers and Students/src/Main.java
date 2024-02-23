import java.util.*;

public class Main {
    interface Person {
        // Write your code here
    }

    public static class Teacher implements Person {
        private String name;
        private String subject;

        // Constructor and other necessary methods go here
    }

    public static class Student implements Person {
        private String name;
        private String subject;

        // Constructor and other necessary methods go here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String[] inputs = sc.nextLine().split(":");
            if (inputs[0].startsWith("T")) {
                // handle teacher
            }
            else if (inputs[0].startsWith("S")) {
                // handle student
            }
        }

        sc.close();
    }
}