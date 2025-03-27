import java.util.*;
public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(9);
        list2.add(5);
        list2.add(2);

        ArrayList<Integer> unique = new ArrayList<>(list1);
        unique.addAll(list2);

        unique.removeIf(e -> list1.contains(e) && list2.contains(e));

        System.out.println(unique);
    }
}
