class college1 implements   Runnable{
    public void run(){
        System.out.println("GIET");
    }
}
class PUC1 implements   Runnable{
    public void run(){
        System.out.println("Bhargabi +2 Science College");
    }
}

public class MultiThreadInterface {
    public static void main(String[] args) {
        college1 college=   new college1();
        PUC1 puc=new PUC1();
Thread t1= new Thread(college);
        Thread t2= new Thread(puc);
    t1.start();
    t2.start();
    }
}
