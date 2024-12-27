public class Emp {
    Emp(String name, String role, Long salary, char gender){
        System.out.println(name+" "+role+" "+salary+" "+gender);
    }
    Emp(String name, int age, String location, int exp){
        System.out.println(name+" "+age+" "+location+" "+exp);
    }
    public void h1(String name, int id, String company){
        System.out.println(name+" "+id+" "+company);
    }
    public void d1(String DName, int Did, String location){
        System.out.println(Did+" "+DName+" "+location);
    }

    public static void main(String[] args) {
        Emp emp = new Emp("Fani", "Devloper", 999999l, 'M');
        new Emp("Sonu", 25,"Bengaluru",2);
        emp.h1("Raj", 55,"TCS");
        emp.d1("TechT",898,"BBSR");

    }
}
