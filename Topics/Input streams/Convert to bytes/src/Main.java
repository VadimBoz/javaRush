import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        String str = scanner.nextLine();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(str.getBytes());
        byte[] array = bos.toByteArray();
        for (byte b: array) {
            System.out.print(b);
        }



    }
}