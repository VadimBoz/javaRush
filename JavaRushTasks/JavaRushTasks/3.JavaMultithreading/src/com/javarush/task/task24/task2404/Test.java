package com.javarush.task.task24.task2404;

import java.io.*;
import java.nio.file.Path;

public class Test {

    public static void main(String[] args) throws IOException {
        String fileStr= System.getProperty("user.dir");
        Path file = Path.of(fileStr);
        File f = new File(fileStr + "//" + "dataset_91007.txt");

        if(f.exists() && f.isFile()) {
            System.out.println(f.toString());
            int max = 0;
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String[] str = br.readLine().split(" ");
                for (String item : str) {
                    if (Integer.parseInt(item) > max) max = Integer.parseInt(item);
                }
            }
            System.out.println(max);
        }
        else System.out.println("нет");





    }


//    BufferedReader bufferedReader = new BufferedReader(FileReader());

}
