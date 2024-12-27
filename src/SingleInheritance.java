class A{
    public void printit(){
        System.out.println("i am  in parent class");
    }
}
class B extends A{


}

public class SingleInheritance {
    public static void main(String[] args) {
        B b=new B();
        b.printit();
    }
}
