package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (o == this)  return true;
        if (!(o instanceof Solution n))
            return false;
        if (n.first == null && first == null && n.last == null && last == null) return true;
        if (n.first == null && first == null && n.last != null && last != null)
            if (n.last.equals(last))
                return true;
        if  (n.first != null && first != null && n.last == null && last == null)
            if (n.first.equals(first))
                return  true;
        if (n.first != null && first != null && n.last != null && last != null)
            return n.first.equals(first) && n.last.equals(last);
        return false;
    }


//1. Хешкоды одинаковых объектов должны быть равны.
//2. Метод equals должен проверять равен ли переданный объект равен текущему(сравнение через ==).
//3. Метод equals должен проверять является ли переданный объект объектом класса Solution.
//4. Метод equals должен возвращать true в случае, если поля first и last равны у переданного объекта и текущего(не забудь что они могут быть равны null).
//5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
//6. В классе Solution должен быть реализован метод hashCode.



    public int hashCode() {
        return (31 * ((first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0)));
    }




    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
