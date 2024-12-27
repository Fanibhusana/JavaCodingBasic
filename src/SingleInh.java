class Car {
public void    det(String color, int wheel) {

        System.out.println(color + " " + wheel);
    }

    public void detail(int price, String fualType) {
        System.out.println(price + " " + fualType);
    }
}

     class bmw extends  Car{

    bmw(int price, String color){

        System.out.println(price+" "+color);
    }
         public void detail2( String model, String color) {
             System.out.println(model + " " + color);
         }
     }
public class SingleInh {
    public static void main(String[] args) {
        bmw b=new bmw(1200,"black");
        b.detail2("X2","red");
    }
}
