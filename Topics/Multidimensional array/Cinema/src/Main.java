import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int t = 0;
        int ti = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                t = nums[i][j];
                if (t == 0) {
                    count++;
                    if (count == k) {
                        ti = i + 1;
                        break;
                    }
                } else count = 0;
            }
            if (ti != 0) break;
        }
        System.out.println(ti); 
    }
}
