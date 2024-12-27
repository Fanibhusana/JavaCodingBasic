import java.lang.Override;

abstract class Calculate{
    abstract void add(int a, int b);
    abstract  void sub(int a, int b);
    abstract  void mul(int a, int b);
    abstract void div(int a, int b);
}

public class Abstract extends  Calculate{
    @Override
    void add(int a, int b) {
        System.out.println(a+b);
    }
    @Override
    void sub(int a, int b) {
        System.out.println(a-b);
    }
    @Override
    void mul(int a, int b) {
        System.out.println(a*b);
    }
    @Override
    void div(int a, int b) {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Abstract anAbstract=new Abstract();
        anAbstract.add(10,20);
        anAbstract.sub(20,10);
        anAbstract.mul(20,8);
        anAbstract.div(10,2);


    }
}
