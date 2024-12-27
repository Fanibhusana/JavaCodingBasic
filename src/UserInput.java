import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter First name");
        String fn=scanner.nextLine();
        System.out.println("enter Last name");
        String ln =scanner.nextLine();
        System.out.println("enter college name");

        String college=scanner.nextLine();
        System.out.println("enter branch name");
        String branch=scanner.next();
        System.out.println("enter mobile no");
        long mob=scanner.nextLong();
        System.out.println("enter age");
        int age= scanner.nextInt();
        System.out.println("enter USN");
        String usn=scanner.next();
        System.out.println();
        System.out.println("First Name- "+fn);
        System.out.println("Last Name- "+ln);
        System.out.println("college name- "+college);
        System.out.println("branch name- "+branch);
        System.out.println("moblie no.- "+mob);
        System.out.println("age- "+age);
        System.out.println("USN - "+usn);


    }

}
