// Non Static inner class
class Out{
    class In{
        public void show(){
            System.out.println("i am in non static inner class");
        }
    }
}

// Static inner class
class Out1{
   static class In1{
        public void show(){
            System.out.println("i am in static  inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Out out=new Out();
        Out.In in= out.new In();
        in.show();

        Out1 out1=new Out1();
        Out1.In1 in1=new Out1.In1();
        in1.show();
    }

}
