package com.javarush.task.task22.task2211;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        String file1 =  System.getProperty("user.dir") + "/3.JavaMultithreading/src/com/javarush/task/task22/task2211/1";
//        String file2 =  System.getProperty("user.dir") + "/3.JavaMultithreading/src/com/javarush/task/task22/task2211/2";

        if (args.length == 2) {
            String file1 = args[0];
            String file2 = args[1];
            Charset utf8 = StandardCharsets.UTF_8;
            Charset windows1251 = Charset.forName("Windows-1251");

            try (FileInputStream finStream = new FileInputStream(file1);
                 FileOutputStream foStream = new FileOutputStream(file2)) {
                byte[] buffer = new byte[256];
                int count;
                String out;

                while (finStream.available() > 0) {
                    count = finStream.read(buffer);
                    String s = new String(buffer, windows1251);
                    System.out.println(s);
                    foStream.write(s.getBytes(utf8));
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
