import java.util.List;

public class Generics4 {
    public static <T> int findIndex(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        System.out.println(findIndex(words, "banana"));
        System.out.println(findIndex(words, "grape"));
    }
}
