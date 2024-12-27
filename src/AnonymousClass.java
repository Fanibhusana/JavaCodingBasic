import java.lang.Override;

abstract class Fani{
    public abstract void code();
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}
interface FF{
    void codding();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Fani fani=new Fani(){
            public void code(){
                System.out.println("i am learning Java");
            }
            public void add(int a, int b){
                System.out.println(a+b);
            }
            public void sub(int a, int b){
                System.out.println(a-b);
            }
            public void mul(int a, int b){
                System.out.println(a*b);
            }
            public void div(int a, int b){
                System.out.println(a/b);
            }
        };
        fani.code();
        fani.add(10,20);
        fani.sub(20,10);
        fani.mul(10,10);
        fani.div(80,5);

        FF ff=new FF() {
            @Override
            public void codding() {
                System.out.println("i am in interface");
            }
        };
        ff.codding();
    }
}
