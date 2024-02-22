package com.javarush.task.task24.task2413;

public class Test {

    public static void main(String[] args) {

        Canvas canvas = new Canvas(10,5);

        char[][] matrix = canvas.getMatrix();
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println(matrix.length + " matrix.length высота");
        System.out.println(matrix[0].length + " matrix[0].length ширина");

        int[][] m  = new int[10][5];
        for (int j = 0; j < m.length ; j++) {
            for (int i = 0; i < m[0].length; i++) {
                System.out.print("8_");
//                if (matrix[j][i] != 0)
//                    setPoint(x+j, y+i, c);
            }
            System.out.println("");
        }
    }

}
