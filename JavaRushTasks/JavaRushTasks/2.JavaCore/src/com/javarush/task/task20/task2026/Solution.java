package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        byte[][] b = new byte[a.length + 2][a[0].length + 2];
        for (int i = 0; i < b.length - 2; i++) {
            System.arraycopy(a[i], 0, b[i + 1], 1 , b.length - 2);
        }

        int[] bounds;
        int sumRest;

        for (int i = 1; i < b.length - 1; i++) {
            for (int j = 1; j < b[0].length - 1; j++) {
                if (b[i][j] != 0) {
                    bounds = getBounds(b, i,j);
                    sumRest = sumElemens(b, i, bounds[0], j, bounds[1]);
                    int sumTheory = (bounds[0] - i + 1) * (bounds[1] - j + 1);
                    if (sumRest == sumTheory) count++;
                }
            }
        }
        return count;
    }


    public static int[] getBounds(byte[][] b, int iStart, int jStart) {
        int ii = 0;
        int jj = 0;

        for (int i = iStart; i < b.length; i++) {
            if (b[i][jStart] == 0) {
                ii = i - 1;
                break;
            }
        }

        for (int j = jStart; j < b[0].length; j++) {
            if (b[iStart][j] == 0) {
                jj = j - 1;
                break;
            }
        }
        return new int[]{ii, jj};
    }


    public static int sumElemens(byte[][] b, int iStart, int iEnd, int jStart, int jEnd) {
        int sum = 0;
        for (int u = iStart; u <= iEnd; u++) {
            for (int v = jStart; v <= jEnd; v++) {
                sum += b[u][v];
                b[u][v] = 0;
            }
        }
        return sum;
    }

}
