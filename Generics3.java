import java.util.List;

public class Generics3 {
    public static <T extends Number> long sum(List<T> list, boolean even) {
        return list.stream().mapToLong(Number::longValue).filter(n -> (n % 2 == 0) == even).sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(sum(numbers, true));
        System.out.println(sum(numbers, false));
    }
}

