// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here

    public static <T> T[]  invert(T[] ar) {
        for (int i = 0 ; i < ar.length/2  ; i++) {
            T temp  = ar[i];
            ar[i] =  ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
        }

        return ar;
    }


//    public static void main(String[] args) {
//        Integer[] ar = new Integer[]{1, 4};
//        invert(ar);
//         System.out.println(Arrays.toString(ar));
//    }
}