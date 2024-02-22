package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амигодрузья!"));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String temp = String.valueOf(string);
        if (string.matches(".*\\s.+\\s.*\\s.*\\s.*")) {
            int start = string.indexOf(" ");
            int end = start;
            temp = temp.replaceFirst("\\s", "+");
            temp = temp.replaceFirst("\\s", "+");
            temp = temp.replaceFirst("\\s", "+");
            temp = temp.replaceFirst("\\s", "+");
            if (temp.indexOf(" ") > -1) end  = temp.indexOf(" ");
            else end = string.length();
            return string.substring(start + 1, end);
        } else throw new TooShortStringException();

    }

    public static class TooShortStringException extends RuntimeException {
    }
}
