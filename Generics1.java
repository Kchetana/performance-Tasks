import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Generics1 {
    public static <T> long count(Collection<T> list, Predicate<T> condition) {
        return list.stream().filter(condition).count();
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long oddCount = count(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
