import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size of matrix");
        int row=sc.nextInt();
        System.out.println("enter the column size of matrix");
        int column=sc.nextInt();

        int[][] a=new int[row][column];
        int[][] b=new int[row][column];
        int[][] c=new int[row][column];

        System.out.println("enter element in 1st matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter element in 2nd matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of 2 matrix is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
