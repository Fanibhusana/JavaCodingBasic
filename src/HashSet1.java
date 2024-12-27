import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits);
        Set<String> fruits1=new TreeSet<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Apple");
        System.out.println(fruits1);
        Set<String> fruits2=new LinkedHashSet<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Apple");
        System.out.println(fruits2);
        Set<Integer> num=new HashSet<>();
        num.add(102);
        num.add(78);
        num.add(7569);
        num.add(456);
        System.out.println(num);
        Set<Integer> num1=new TreeSet<>();
        num1.add(102);
        num1.add(78);
        num1.add(7569);
        num1.add(456);
        System.out.println(num1);
        Set<Integer> num2=new LinkedHashSet<>();
        num2.add(102);
        num2.add(78);
        num2.add(7569);
        num2.add(456);
        System.out.println(num2);
    }
}
