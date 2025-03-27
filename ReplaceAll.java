import java.util.*;

public class ReplaceAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");

        list.replaceAll(e -> e.equals("B") ? "M" : e);

        System.out.println("Updated ArrayList: " + list);
    }
}



