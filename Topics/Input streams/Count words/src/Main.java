import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String str = reader.readLine().trim();
        reader.close();

        if (str.equals("") || str.equals("\\s+")) System.out.println(0);
        else {
            String[] strAr  = str.split("\\s+");
            System.out.println(strAr.length);
        }
    }
}
