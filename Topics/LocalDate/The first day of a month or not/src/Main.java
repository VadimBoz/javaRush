import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // put your code here
//        System.out.println("".getClass());
//        System.out.println(Period.parse("P1995Y23M05D"));
        IntBinaryOperator binaryOperator = (x, y) -> { return x > y ? x : y; };

        System.out.println(binaryOperator.applyAsInt(2,4));
    }


}