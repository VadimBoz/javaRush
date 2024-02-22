package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

//        String fileNameF =  System.getProperty("user.dir") + "/3.JavaMultithreading/src/com/javarush/task/task22/task2209/" + fileName;
        String fileNameF = fileName;

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileNameF));
        String[] str = bufferedReader1.readLine().split(" ");

        StringBuilder result = getLine(str);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {

        StringBuilder res = new StringBuilder();
        if (words == null || words.length == 0) return res;
        int point = 0;
        ArrayList<String> resArrayList;
        String temp = "";
        while (true) {
            resArrayList = new ArrayList<>();
            ArrayList<String> wordsArrayList = new ArrayList<>(Arrays.asList(words));
            String item;
            int count = 0;
            resArrayList.add(wordsArrayList.get(point));
            while (count < words.length - 1) {
                count++;
                item = resArrayList.get(resArrayList.size() - 1);
                char end = item.charAt(item.length() - 1);
                for (int j = 0; j < wordsArrayList.size(); j++) {
                    char start = wordsArrayList.get(j).toLowerCase().charAt(0);
                    if (end == start) {
                        if (!resArrayList.contains(wordsArrayList.get(j))) {
                            temp = wordsArrayList.get(j);
                            wordsArrayList.remove(temp);
                            resArrayList.add(temp);
                            break;
                        } else {
                            temp = wordsArrayList.get(j);
                            wordsArrayList.remove(temp);
                            if (wordsArrayList.contains(temp)) {
                                resArrayList.add(temp);
                            }
                        }

                    }
                }

            }
            if (resArrayList.size() != words.length && point < words.length - 2) point++;
            else break;
        }
        resArrayList.forEach(s -> res.append(" ").append(s));
        return res.deleteCharAt(0);
    }
}
