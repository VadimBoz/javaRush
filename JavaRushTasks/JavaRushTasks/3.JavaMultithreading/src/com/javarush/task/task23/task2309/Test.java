package com.javarush.task.task23.task2309;

import com.javarush.task.task23.task2309.vo.Subject;

import java.lang.reflect.ParameterizedType;

public class Test {
    int rt = 8;


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Subject f = new Subject();
        Test test = new Test();
        System.out.println(( ((ParameterizedType) f.getClass().
                getGenericSuperclass()).getActualTypeArguments()));
    }
}
