import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.Callable;

class Seven {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override public void run() {
                System.out.println("Hello!");
            }
        });

        Thread thread1 = new Thread(() -> System.out.println("Hello!"));

        Comparator<String> comparator = new Comparator<String>() {
            @Override public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        Comparator<String> comparator1 = String::compareTo;


        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });



        JButton button1 = new JButton("Click me");
        button.addActionListener(e -> System.out.println("Button clicked"));

    }
    public static final TernaryIntPredicate ALL_DIFFERENT = (n1, n2, n3) -> {
        if (n1 != n2 && n2 != n3 && n1 != n3) return true;
        return false;
    };

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int n1, int n2, int n3);
        // Write a method here
    }


    final double variable = 10;
    Serializable serializable = new Serializable() {
        double applyFun(double x) {
            return x + variable;
        }
    };

    Callable<String> callable = new Callable<String>() {
        @Override
        public String call() throws Exception {
            Thread.sleep(100);
            return "hello";
        }
    };

}