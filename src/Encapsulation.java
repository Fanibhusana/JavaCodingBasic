class calc{
    private int age;
    private String name;
    public void setage(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        calc c=new calc();
        c.setage(50);
        c.setName("Fani");
        System.out.println(c.getAge()+" "+c.getName());
    }
}
