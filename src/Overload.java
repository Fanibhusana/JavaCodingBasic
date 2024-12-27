class Demo{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    Demo(int a, int b){
        System.out.println(a+b);
    }
    Demo(int a, int b, int c){
        System.out.println(a+b+c);

    }
}

public class Overload {

    public static void main(String[] args) {
        Demo demo = new Demo(55,66);
        new Demo(52,63,96);
        demo.add(10,50);
        demo.add(82,90);

    }
}
