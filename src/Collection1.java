import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add("Fani");
        System.out.println(arrayList);

        ArrayList<String> name = new ArrayList();
        name.add("Fani");
        name.add("Anu");
        name.add("Ananta");
        System.out.println(name);
    }
}
