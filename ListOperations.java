import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println((list1.equals(list2) ? "equal." : "not equal."));

        List<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println(joinedList);

        List<Integer> clonedList = new ArrayList<>(list1.subList(0, list1.size()));
        System.out.println(clonedList);
    }
}

