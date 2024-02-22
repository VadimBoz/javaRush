// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define hasNull method here
    public static <T> boolean hasNull(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) return true;
        }
        return false;
    }
}