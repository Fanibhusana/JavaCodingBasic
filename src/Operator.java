public class Operator {
    public static void main(String[] args) {
        int a=10;
        int b=98;
        //arithimetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println();
        System.out.println("----------------------------------------------");

        //relational operator
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        String s1="fani";
        String s2="bhu";
        System.out.println(s1!=s2);
        System.out.println("----------------------------------------------");
        // logical operator
        System.out.println((a>b)&&(a<b));
        System.out.println(!(a>b)||(a>b));

        System.out.println(0^0);
        System.out.println(~5);
        System.out.println(5&2);
        System.out.println(5|2);
        System.out.println(5^2);
        System.out.println("-----------------------------------------");
        System.out.println(4<<2);
        System.out.println(4>>2);
        System.out.println("  - ------------------------------------------------------------");
        int age=22;
        int mob=78;
        System.out.println(age & mob);
        System.out.println(age | mob);
        System.out.println(~age);
        System.out.println(age ^mob);
        System.out.println(age<<2);
        System.out.println(age>>2);

        System.out.println("--------------------------------------------");
        int x=9;
        System.out.println(x+=10);
        System.out.println(x-=10);
        System.out.println(x*=10);
        System.out.println(x/=10);
        System.out.println(x%=10);
        System.out.println(x<<=2);
        System.out.println(x>>=2);
        System.out.println(x^=2);

    }
}
