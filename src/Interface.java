import java.lang.Override;

interface Animal1{
    void eat();
    void travel();

}
class  Mammal implements  Animal1{

    @Override
    public void eat() {
        System.out.println("Can eat");
    }

    @Override
    public void travel() {
        System.out.println("can travel");
    }

}
public class Interface {
    public static void main(String[] args) {
        Mammal mammal=new Mammal();
        mammal.eat();
        mammal.travel();
    }
}
