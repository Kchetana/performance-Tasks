import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 90, 1, 8, 0, 23};

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int num : numbers) {
            linkedHashSet.add(num);
            treeSet.add(num);
        }


        Iterator<Integer> linkedIterator = linkedHashSet.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }

        Iterator<Integer> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.print(treeIterator.next() + " ");
        }
    }
}

