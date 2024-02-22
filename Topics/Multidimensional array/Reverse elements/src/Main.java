
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {
            int len = twoDimArray[i].length;
            for (int j = 0; j < len / 2; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][len - 1 - j];
                twoDimArray[i][len - 1 - j] = temp;
            }
        }

    }
}
