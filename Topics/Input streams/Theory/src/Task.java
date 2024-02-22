// You can experiment here, it won’t be checked

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // start coding here
    String str = reader.readLine();
    reader.close();
    if (str.equals("") || str.equals("\\s+")) System.out.println(0);
    else {
      String[] strAr = str.split("\\s+");
      System.out.println(strAr.length);
    }

  }
}
