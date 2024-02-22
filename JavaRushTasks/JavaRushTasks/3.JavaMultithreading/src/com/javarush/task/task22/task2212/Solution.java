package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
Критерии валидности:
1) если номер начинается с '+', то он содержит 12 цифр
2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 1 пару скобок '(' и ')'
4) скобки (если они есть) внутри содержат четко 3 цифры
5) номер может содержать только цифры, '+', '(' и ')'
6) номер заканчивается на цифру

Примеры:
+380501234567 - true
+38(050)1234567 - true
(050)1234567 - true
0(501)234567 - true
+38)050(1234567 - false
+38(050)123-45-67 - false
050ххх4567 - false
050123456 - false
(0)501234567 - false

*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        if (telNumber.matches("\\d{10}")) return true;
        if (telNumber.matches(".*[A-Za-zА-Яа-я#@$!-].*")) return false;
        if (telNumber.matches(".*\\).*\\(.*")) return false; // содержит скобки в неправлильном порядке или более  одной рары
        if (!telNumber.matches(".+\\d"))  return false; // не заканчивается на цифру
        if (telNumber.charAt(0) == '+' && telNumber.replaceFirst("\\+", "").matches("\\d{12}")) return true;
        if (telNumber.matches("\\d*\\(\\d{3}\\)\\d+") &&
                telNumber.replaceAll("[()]", "").matches("\\d{10}")) return true;
        if (telNumber.matches("\\+\\d{1,}\\(\\d{3}\\)\\d+") &&
                telNumber.replaceAll("[()+]", "").matches("\\d{12}")) return true;
        if (!(telNumber.matches(".*\\(\\d{3}\\).+") || !telNumber.matches(".*\\(.*"))) return false;

        return false;
    }

    public static void main(String[] args) {
//        System.out.println("+9(050)1234567".replaceAll("[()+]", ""));
        String str = "+380501234567";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "+38(050)1234567";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "(050)1234567";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "0(501)234567";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "+38)050(1234567";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "050ххх4567";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "050123456";
        System.out.println(checkTelNumber(str) + " " + str);
        str = "(0)501234567";
        System.out.println(checkTelNumber(str) + " " + str);
        System.out.println("(0)501234((567".replace("(", ""));





    }
}
