class Animal{
    public void d1(String color, String typefood){
        System.out.println(color+" "+typefood);
    }
}
class Dog1 extends Animal{
    public void d2(String name, String breed,String color){
        System.out.println(name+" "+breed+" "+color);
    }
}
class BabyDog1 extends Dog1{
    public void d3(String name, String breed,String color, char gender){
        System.out.println(name+" "+breed+" "+color+" "+gender);
    }
}


class Aa{
    public void print1(){
        System.out.println("i am in A");
    }
}
class Bb extends Aa{
    public void print2(){
        System.out.println("i am in B");
    }
}
class C extends  Bb{
    public void print3(){
        System.out.println("i am in C");
    }
}

public class MultilevelInheri {
    public static void main(String[] args) {
        C c=new C();
        c.print1();
        c.print2();
        c.print3();

        BabyDog1 b=new BabyDog1();
        b.d1("Black", "Nonveg");
        b.d2("tiger", "germanSeford","gray");
        b.d3("tummy","indian","black", 'm');
    }
}
