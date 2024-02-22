package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");

        System.out.println(Arrays.toString((detectAllWords(crossword, "home", "mgl")).toArray()));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        int len = words.length;
        int[] res2 = new int[2];
        List<Word> ls = new ArrayList<>();
        Word wordCur;

        for (String word: words) {
            char char1 = word.charAt(0);
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[0].length; j++) {
//                    System.out.print((char)crossword[i][j]);
                    if (crossword[i][j] == char1) {
                        res2 = findWord(crossword, i, j, word);
                        if (res2[0] != -1 && res2[1] != -1) {
                            wordCur = new Word(word);
                            wordCur.setStartPoint(j, i);
                            wordCur.setEndPoint(res2[1], res2[0]);
                            ls.add(wordCur);
                        }

                    }
                }
//                System.out.println();
            }
        }


        return ls;
    }

    private static int[] findWord(int[][] crossword, int i, int j, String word) {
        int i1 = 0;
        int j1 = 0;
        int iLen  = crossword.length;
        int jLen = crossword[0].length;
        int wLen = word.length();

        int count  = 0;

        if (j + wLen  <= jLen) { //вправо
            for (int k = j + 1; k < j + wLen; k++) {
                if (crossword[i][k] == word.charAt(k - j))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i, j + count};
        }

        count  = 0;
        if (j >= wLen - 1) { // влево
            for (int k = j - 1 ; k > j - wLen; k--) {
                if (crossword[i][k] == word.charAt(j - k))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i, j - count};
        }

        count  = 0;
        if (i + wLen <= iLen ) { // вниз
            for (int k = i + 1 ; k < i + wLen; k++) {
                if (crossword[k][j] == word.charAt(k - i))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i + count,  j};
        }

        count  = 0;
        if (i >= wLen - 1 ) { // вверх
            for (int k = i - 1 ; k > i - wLen ; k--) {
                if (crossword[k][j] == word.charAt(i - k))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i - count,  j};
        }

        count  = 0;
        if ((j + wLen  <= jLen ) &&  (i >= wLen -1 ))  {  // вправо вверх
            for (int k = 1; k < wLen; k++) {
                if (crossword[i - k][j + k] == word.charAt(k))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i - count, j + count};
        }

        if ((j >= wLen - 1) && (i >= wLen -1 )) {  // влево вверх
            for (int k = 1; k < wLen; k++) {
                if (crossword[i - k][j - k] == word.charAt(k))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i - count, j - count};
        }


        count  = 0;
        if ((j + wLen  <= jLen) && (i + wLen <= iLen )) { // вправо вниз
            for (int k = 1; k < wLen; k++) {
                if (crossword[i + k][j + k] == word.charAt(k))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i + count, j + count};
        }

        count  = 0;
        if ((j >= wLen - 1) && (i + wLen <= iLen ) ) {  // влево вниз
            for (int k = 1; k < wLen; k++) {
                if (crossword[i + k][j - k] == word.charAt(k))
                    count++;
                else break;
            }
            if (count == wLen -1)
                return new int[]{i + count, j - count};
        }
    return  new int[]{-1, -1};
    }



    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
