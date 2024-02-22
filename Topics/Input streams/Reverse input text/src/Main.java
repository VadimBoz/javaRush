import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        char[] charAr = str.toCharArray();
        for (int i = charAr.length - 1; i > -1 ; i--) {
            System.out.print(charAr[i]);
        }
    }
}
