import java.util.Scanner;
public class FindMax2DimensionalArrays {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row:  ");
        m = scanner.nextInt();
        System.out.println("Enter the column: ");
        n = scanner.nextInt();

        // khai báo ma trận A có m dòng, n cột
        int A[][] = new int[m][n];

        System.out.println("Element in array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("Max is: " + max);
    }
}
