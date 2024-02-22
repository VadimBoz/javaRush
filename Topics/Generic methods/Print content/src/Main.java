// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define info method here
    public static <T> String info(T[] ar) {
        if (ar.length == 0) return "[]";
        String res = "[";
        for (T item : ar) {
            res += item + ", ";
        }


        return res.substring(0, res.length()-2) + "]";

    }

//    public static void main(String[] args) {
//        String[] ar = new String[]{"1", "2"};
//        System.out.println(info(ar));
//        Integer[] rr = new Integer[]{1,2,3,4};
//        System.out.println(info(rr));
//        String[] ar3 = new String[]{};
//        System.out.println(info(ar3));
//
//    }
}