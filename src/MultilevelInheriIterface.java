interface A1{
    void a();
}
interface B1 extends A1{
    void b();
}
class Cc implements B1{
    public  void a(){
        System.out.println("a method");
    }
    public void b(){
        System.out.println("b method");
    }
}

public class MultilevelInheriIterface {
    public static void main(String[] args) {
        Cc c=new Cc();
        c.a();
        c.b();
    }
}
