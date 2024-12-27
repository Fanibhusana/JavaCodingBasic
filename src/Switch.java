import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a no.");
//        int day =scanner.nextInt();
//        switch (day){
//            case 1:{System.out.println("Sun"); break;}
//            case 2:{System.out.println("Mon"); break;}
//            case 3:{System.out.println("Tue"); break;}
//            case 4:{System.out.println("Wed"); break;}
//            case 5:{System.out.println("Thu"); break;}
//            case 6:{System.out.println("Wed"); break;}
//            case 7:{System.out.println("Sat"); break;}
//            default:{System.out.println("enter a valid no.");}
//        }

        System.out.println("enter ur grad");
        String grad=scanner.next();
        switch (grad){
            case "a": {System.out.println("more than 90");break;}
            case "b": {System.out.println("more than 80 and less than 90");break;}
            case "c": {System.out.println("more than 70 and less than 80");break;}
            case "d": {System.out.println("more than 60 and less than 70");break;}
            default:
                System.out.println("u are in 2nd division");

        }

    }
}

