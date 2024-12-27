import java.lang.Override;

interface Swimmer{
    void swim();
}
interface Fly{
    void fly();
}
public class MultipuleInheri implements Swimmer,Fly{
    @Override
   public void swim(){
        System.out.println("i am swimming");
    }
    @Override
  public   void fly(){
        System.out.println("i am flying");
    }

    public static void main(String[] args) {
        MultipuleInheri multipuleInheri=new MultipuleInheri();
        multipuleInheri.fly();
        multipuleInheri.swim();
    }
}
