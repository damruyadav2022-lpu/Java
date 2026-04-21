import java.util.*;

public class SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // both diagonals (middle counted twice)
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sum += arr[i][n - 1 - i];
        }

        System.out.println("Sum of diagonals = " + sum);
    }
}
