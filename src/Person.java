class Lorry{
    Lorry(String color, int price, int tSize){
        System.out.println(color+" "+price+" "+tSize);
    }
    Lorry(String eType, int capacityInLit){
        System.out.println(eType+" "+capacityInLit);
    }
    public void car(String name, String color, int price){
        System.out.println(name+" "+color+" "+price);
    }
    public  void bike(String name, String color){
        System.out.println(name+" "+color);
    }
}


public class Person {



//    Person(String name, int age){
//        System.out.println(name+" "+age);
//    }
//    public void print(String name, int age, String branch){
//        System.out.println(name+" "+age+" "+branch);
//    }

    public static void main(String[] args) {
//        Person person = new Person("Fani", 22);
//        person.print("Fani", 22, "CSE");

        Lorry lorry = new Lorry("green",2333,85);
        new Lorry("Petrol", 20);
        lorry.car("Thar","black",90000);
        lorry.bike("Ninja", "green");
    }
}
