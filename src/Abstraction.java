import java.lang.Override;

abstract  class Human{
    abstract  void eat();
}

public class Abstraction extends  Human{
    @Override
    void eat() {
        System.out.println("eating food");
    }

    public static void main(String[] args) {
        Abstraction abstraction=new Abstraction();
        abstraction.eat();
    }
}
