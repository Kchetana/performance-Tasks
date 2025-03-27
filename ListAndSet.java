import java.util.*;

public class ListAndSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Chetana");
        list.add("Bhasker");
        list.add("Chetana");
        list.add("Bhanu");

        Set<String> set = new HashSet<>(list);
        List<String> listFromSet = new ArrayList<>(set);

        System.out.println(set);
        System.out.println(listFromSet);
    }
}
