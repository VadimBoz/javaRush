import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;

class FunctionUtils {

    Integer i = 0;
    public static Supplier<Integer> getInfiniteRange() {
        FunctionUtils functionUtils = new FunctionUtils();
        return new Supplier<Integer>() {
            @Override
            public Integer get() {
                return functionUtils.i++;
            }
        };
        // write your code here
    }

    public static void main(String[] args) {
        ArrayList<Integer> rrr = new ArrayList<>();
        rrr.isEmpty()
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();

        for(int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }


}