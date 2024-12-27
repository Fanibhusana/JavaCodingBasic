import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collection2 {
    public static void main(String[] args) {
        List<String> arrayList = new Vector<>();
        arrayList.add("Fani");
        arrayList.add("Maharana");
        arrayList.add("KGPNHS");
        arrayList.add("BSC");
        arrayList.add("GIET");
        arrayList.add("2001326123");
        arrayList.add(2,"cse");
        System.out.println(arrayList);
        arrayList.add(4,"BBSR");
        System.out.println(arrayList);
        arrayList.remove("KGPNHS");
        System.out.println(arrayList);
        arrayList.remove(5);
        System.out.println(arrayList);

    }
}
