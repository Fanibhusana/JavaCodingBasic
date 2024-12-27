import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter age");
//
//        int age=scanner.nextInt();
//        if(age>=18) System.out.println("eligible for vote");
//        else System.out.println("not eligible for vote");

        System.out.println("--------------------------------");
        System.out.println("eneter a no. to check is it even or odd");
        int num=scanner.nextInt();
        if(num%2==0) System.out.println("it is even");
        else System.out.println("it is odd");
    }
}
