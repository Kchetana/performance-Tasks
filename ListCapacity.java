import java.util.*;

public class ListCapacity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Chetana");
        list.add("ChetanaKonepalli");
        list.add("ChetanaReddy");

        list.trimToSize();

        System.out.println(list.size());
    }
}
