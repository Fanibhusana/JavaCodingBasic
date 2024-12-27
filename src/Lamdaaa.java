interface Printing{
    void show();
}
interface  Mul{
    void multi(int a, int b, int c);
}
public class Lamdaaa {
    public static void main(String[] args) {
        Printing printing=() -> System.out.println("i am in interface");
        printing.show();
        Mul mul=(a, b, c) -> System.out.println(a*b*c);
        mul.multi(10,20,30);
    }
}
