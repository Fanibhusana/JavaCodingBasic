class Outer{

    class Inner{
        public void person(String name, int age){
            System.out.println(name+" "+age);
        }
        public void emp(int id, String name, double salary){
            System.out.println(id+" "+name+" "+salary);
        }
        public void dep(int id, String name){
            System.out.println(id+" "+name);
        }
        public void hr(String name, String location){
            System.out.println(name+" "+location);
        }
    }
}
public class InnerClass1 {
    public static void main(String[] args) {
    Outer outer=new Outer();
    Outer.Inner inner=outer.new Inner();
    inner.person("Fani",22);
    inner.emp(1023,"FAni",25369.3);
    inner.dep(8989,"It");
    inner.hr("Srusti","BBSR");
    }
}
