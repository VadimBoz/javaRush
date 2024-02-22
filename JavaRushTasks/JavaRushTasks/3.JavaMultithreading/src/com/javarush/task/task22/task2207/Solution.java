package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
*/
//рот тор торт о о тот тот тот
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        String fileName =  System.getProperty("user.dir") + "/3.JavaMultithreading/src/com/javarush/task/task22/task2207/" + scanner.nextLine();
        String fileName =  scanner.nextLine();

        BufferedReader bufferedReader  = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.ready()) {
            stringBuilder.append(bufferedReader.readLine());
            stringBuilder.append(" ");
        }
        String[] arrInput = stringBuilder.toString().split(" ");

        for (int i = 0; i < arrInput.length - 1; i++) {
            Pair pair = new Pair();
            pair.first = arrInput[i];
            StringBuilder stringBuilder1 = new StringBuilder(arrInput[i]);
            for (int j = i + 1; j < arrInput.length; j++) {
                StringBuilder stringBuilder2  = new StringBuilder(arrInput[j]);
                if (stringBuilder1.toString().equals(stringBuilder2.reverse().toString())) {
                    pair.second = arrInput[j];
                    arrInput[j] = "322123ver33";
                    result.add(pair);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result.toArray()));

    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
