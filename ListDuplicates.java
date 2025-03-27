import java.util.*;
public class ListDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chetana");
        list.add("Chetana");
        list.add("Pooja");
        list.add("Sreeja");
        list.add("Pooja");

        ArrayList<String> dups = new ArrayList<>();

        list.forEach(e -> {
            if (list.indexOf(e) != list.lastIndexOf(e) && !dups.contains(e)) {
                dups.add(e);
            }
        });

        System.out.println(dups);
    }
}
