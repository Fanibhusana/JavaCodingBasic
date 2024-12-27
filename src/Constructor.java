public class Constructor {
    Constructor(){
        System.out.println("Hi i am in TATAStrive");
    }
    Constructor(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        new Constructor(10,20);
    }
}
