 interface Calcu{
    int cal(int a, int b);
}
public class LamExp {
    public static void main(String[] args) {
        Calcu add=(a, b) -> a+b;
        Calcu sub=(a, b) -> a-b;
        Calcu mul=(a, b) -> a*b;
        Calcu div=(a, b) -> a/b;
        System.out.println(add.cal(10,20));
        System.out.println(sub.cal(100,20));
        System.out.println(mul.cal(10,20));
        System.out.println(div.cal(100,20));

    }
}
