package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
//        try {
            if (string.matches(".*\\t.+\\t.*")) {
                int start  = string.indexOf("\t");
                string = string.replaceFirst("\t", " ");
                int end  = string.indexOf("\t");

                return string.substring(start + 1, end);
            } else
                throw new TooShortStringException();
//        } catch (TooShortStringException e) {
//            e.printStackTrace();
//        }

//        return string;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
//        System.out.println(getPartOfString("\tJavaRush - лучший сервисобучения Java."));
    }
}
