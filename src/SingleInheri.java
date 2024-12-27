class Dog{
    public void details(String name, String color, String bread){
        System.out.println(name+" "+color+" "+bread);
    }
}
class BabyDog{
    public void details2(String name, String color, String bread, char gender){
        System.out.println(name+" "+color+" "+bread+" "+ gender);
    }
}
public class SingleInheri {
    public static void main(String[] args) {
        BabyDog dog=new BabyDog();
        dog.details2("tummy","black","indian", 'm');
    }
}
