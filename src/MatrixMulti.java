import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column size of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("enter the row and column size of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 != r2) System.out.println("Matrix multiplication is not possible.");

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];

        System.out.println("enter element in 1st matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element in 2nd matrix");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }
            }
        }
            System.out.println("multiplication of 2 matrix is ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
