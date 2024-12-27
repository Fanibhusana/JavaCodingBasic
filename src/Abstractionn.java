import java.lang.Override;

abstract class Emp1{
    abstract void officework(int id, int hr);
}
class person extends Emp1{
      person(int age, String name){
          System.out.println(name+" "+age);
     }
    @Override
    void officework(int id, int hr) {
        System.out.println(id+" "+hr);
    }
    void personalwork(int study, int sleep){
        System.out.println(study+" "+sleep);
    }
}


public class Abstractionn {
    public static void main(String[] args) {
        person per = new person(21,"Fani");
        per.officework(22,8);
        per.personalwork(6,6);

    }
}
