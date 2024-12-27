class Food{
    public void Print1(String typeoffood, String name, String Ratting){
        System.out.println(typeoffood+" "+name+" "+Ratting);
    }
}
class F1 extends Food{
    public void Print2(String name, String price, String quality){
        System.out.println(name+" "+price+" "+quality);
    }
}


class F2 extends Food{
    public void Print2(String name, String price, String quality){
        System.out.println(name+" "+price+" "+quality);
    }
}

class Aaa{
    public void m1(){
        System.out.println("I am in A");
    }
}
class Bbb extends Aaa{
    public void m2(){
        System.out.println("I am in B");
    }
}
class Ccc extends Aaa{
    public void m3(){
        System.out.println("I am in C");
    }
}
public class HierarchicalInheri {
    public static void main(String[] args) {
        Bbb b=new Bbb();
        Ccc c=new Ccc();

        b.m2();
        b.m1();
        c.m1();
        c.m3();

        F1 f=new F1();
        F2 f2=new F2();
        f.Print1("Veg", "Rice", "5 star");
        f.Print2("Pulau", "60","good");
        f2.Print1("Veg", "Rice", "5 star");
        f2.Print2("Biriyani","120","Excelent");
    }
}
