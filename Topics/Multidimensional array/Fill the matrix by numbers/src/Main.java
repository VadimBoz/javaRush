import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] line = new int[n];
        for (int i=0; i < n; i++) {
            line[i] = i;
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + i < n)  matrix[i][j + i] = line[j];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (j <= i) matrix[i][j] = line[i - j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}