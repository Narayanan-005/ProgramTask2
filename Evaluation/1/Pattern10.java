import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Array Size : ");
        int n = scanner.nextInt();
        new Pattern10().pattern(n);

    }

    public void pattern(int n) {
        int mat[][] = new int[n][n];
        int temp = mat.length / 2;
        int start = 0;
        int end = mat.length - 1;
        while (start <= temp) {
            if (start % 2 == 0) {
                for (int i = start; i <= end; i++) {
                    mat[start][i] = 1;
                }
                for (int i = start; i <= end; i++) {
                    mat[i][end] = 1;
                }
                for (int i = end; i >= start; i--) {
                    mat[end][i] = 1;
                }
                for (int i = end; i >= start; i--) {
                    mat[i][start] = 1;
                }
            }
            start++;
            end--;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}




