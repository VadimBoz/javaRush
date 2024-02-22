package com.javarush.task.task23.task2305;

/* 
Inner
*/

import java.util.Arrays;

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution[] res = new Solution[2];
        res[0] = new Solution();
        res[1] = new Solution();
        res[0].innerClasses = new InnerClass[2];
        res[0].innerClasses[0] = res[0].new InnerClass();
        res[0].innerClasses[1] = res[1].new InnerClass();

        res[1].innerClasses = new InnerClass[2];
        res[1].innerClasses[0] = res[0].new InnerClass();
        res[1].innerClasses[1] = res[1].new InnerClass();


        return res;
    }

    public static void main(String[] args) {
//        System.out.println(getTwoSolutions()[0]);

    }
}
