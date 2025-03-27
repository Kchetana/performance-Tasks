import java.util.*;
public class RotateLeftList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;
        k = k % list.size();

        List<Integer> rotated = new ArrayList<>(list.subList(k, list.size()));
        rotated.addAll(list.subList(0, k));

        System.out.println(rotated);
    }
}
