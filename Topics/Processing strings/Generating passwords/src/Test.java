import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 2, 1};
        int x = 10;
        a[0] -= x;
        a[1] += x;
        x -= a[2];
        a[2] = x;
        a[3] -= x;
        System.out.println(Arrays.toString(a));
    }
}
