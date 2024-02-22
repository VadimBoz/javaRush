import java.io.File;

public class Main {
    public static void main(String[] args) {
        IPhone154 iPhone154 = new IPhone154();
        IPhone154.PrototypeIPhone154 prototypeIPhone154  = new IPhone154.PrototypeIPhone154();
        prototypeIPhone154.printMinCost();
    }
}

// An internal staff of the testing platform. Do not change it
class IPhone154 {
    static double minCost = initCost();

    static class PrototypeIPhone154 {
        void printMinCost() {
            System.out.println("The min cost of IPhone154 should be: $" + minCost);
        }
    }

    private static double initCost() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        File f = new File("fdvf");
        String ty = f.getName();
        return scanner.nextDouble();
    }
}