class college extends  Thread{
    public void run(){
        System.out.println("GIET");
    }
}
class PUC extends  Thread{
    public void run(){
        System.out.println("Bhargabi +2 Science College");
    }
}
class  scl extends  Thread{
    public void run(){
        System.out.println("KGPNHS");
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        college college=   new college();
                PUC puc=new PUC();
        scl scl=new scl();
        college.start();
        puc.start();
        scl.start();
    }
}
