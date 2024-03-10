import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        return n < 2 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(calcDoubleFactorial(n - 2));
    }

//    public static void main(String[] args) {
//        System.out.println(calcDoubleFactorial(1));
//    }
}