import java.lang.Override;

interface F{
    void f();
}
class G1 implements F{
    @Override
    public void f(){
        System.out.println("in class G1");
    }
}
class G2 implements F{
    @Override
    public void f() {
        System.out.println("in class G2");
    }
}
public class HierachiInterface {
    public static void main(String[] args) {
        G1 g1=new G1();
        g1.f();

        G2 g2=new G2();
        g2.f();
    }
}
