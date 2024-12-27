class Parent{
    public void mobile(){
        System.out.println("Nokia 1600");
    }
}

class Child extends Parent{

    public void mobile(){
        System.out.println("IPhone 13");
    }
}


public class Override {
    public static void main(String[] args) {
        Parent child=new Child();
        child.mobile();
    }
}
