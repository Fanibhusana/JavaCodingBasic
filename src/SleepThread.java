class hi extends Thread{
    public  void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{ Thread.sleep(1000); }catch(java.lang.Exception e){System.out.println(e);}

        }
    }
}

public class SleepThread {

    public static void main(String[] args) {
       hi h=new hi();
       h.start();
        hi h1=new hi();
        h1.start();
    }
}
