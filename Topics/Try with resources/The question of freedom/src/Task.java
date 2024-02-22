// You can experiment here, it won’t be checked

import java.util.Locale;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    int n= 5;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    double d = scanner.nextDouble();
//    assert (n < 0) : "revevvrvr";
    // put your code here
    Tm ttm = new Tm(5);
    System.out.println(ttm.t);
    Tm ttm2 = new Tm(-5);
    float r = 3.2342423435747457574574f;
    System.out.println(3.3 / 3);
    double t = Math.PI;
  }

  public static class Tm {
    int  t;

    public Tm (int t) {
      assert (t < 0) : "revevvrvr";
      this.t = t;
    }

  }


}
