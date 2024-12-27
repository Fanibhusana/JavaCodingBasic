import java.util.Scanner;

public class NestedIfElse1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur percentage");
        int a=sc.nextInt();

        if(a>=60){
            if(a>=80) System.out.println("a");
            else System.out.println("b");
        }
        else{

            if(a>=35) System.out.println("c");
            else System.out.println("f");
        }
    }
}
