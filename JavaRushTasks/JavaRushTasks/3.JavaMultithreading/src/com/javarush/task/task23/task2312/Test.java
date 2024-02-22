package com.javarush.task.task23.task2312;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        int w = 20;
        int h = 5;
        int[][] p = new int[w][h];
        p[3][3] = 2;
        p[0][0] = 1;
        p[w - 1][h - 1] = 1;


        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                if (p[i][j] == 0) System.out.print("u");
                else if (p[i][j] == 2) System.out.print("X");
                else if (p[i][j] == 3) System.out.print("^");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
